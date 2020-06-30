/*******************************************************************************
 * Copyright (c) 2010-2014, Miklos Foldenyi, Andras Szabolcs Nagy, Abel Hegedus, Akos Horvath, Zoltan Ujhelyi and Daniel Varro
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-v20.html.
 * 
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.viatra.dse.util;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.viatra.query.runtime.matchers.util.Preconditions;

/**
 * This class contains static helper methods.
 * @author Andras Szabolcs Nagy
 */
public final class EMFHelper {

    private static final Logger logger = Logger.getLogger(EMFHelper.class);

    private EMFHelper() {
    }

    public static class EmfHelperException extends RuntimeException {
        private static final long serialVersionUID = 7635796550669616626L;
        
        public EmfHelperException(String string) {
            super(string);
        }
        public EmfHelperException(String string, Throwable e) {
            super(string, e);
        }
    }

    /**
     * Gets the {@link EditingDomain} of either an {@link EObject}, {@link Resource} or {@link ResourceSet}.
     * @param notifier The {@link Notifier}.
     * @return The EditingDomain.
     */
    public static EditingDomain getEditingDomain(Notifier notifier) {
        Objects.requireNonNull(notifier);
        if (notifier instanceof EObject) {
            EObject eObject = (EObject) notifier;
            return AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
        } else if (notifier instanceof Resource) {
            Resource resource = (Resource) notifier;
            EList<EObject> contents = resource.getContents();
            if (contents.isEmpty()) {
                return null;
            }
            return AdapterFactoryEditingDomain.getEditingDomainFor(contents.get(0));
        } else if (notifier instanceof ResourceSet) {
            ResourceSet resourceSet = (ResourceSet) notifier;
            if (resourceSet.getResources().isEmpty()) {
                return null;
            }
            return getEditingDomain(resourceSet.getResources().get(0));
        }
        
        return null;
    }
    
    /**
     * Creates (or gets if already exists) an {@link EditingDomain} over the given {@link Notifier},
     * either an {@link EObject}, {@link Resource} or {@link ResourceSet}.
     * @param notifier The {@link Notifier}.
     * @return The EditingDomain.
     */
    public static EditingDomain createEditingDomain(Notifier notifier) {
        
        EditingDomain domain = getEditingDomain(notifier);
        if (domain != null) {
            return domain;
        }
        
        registerExtensionForXmiSerializer("dummyext");
        
        if (notifier instanceof EObject) {
            EObject eObject = (EObject) notifier;

            domain = new AdapterFactoryEditingDomain(null, new BasicCommandStack());
            Resource resource = domain.getResourceSet().createResource(URI.createFileURI("dummy.dummyext"));
            domain.getCommandStack().execute(new AddCommand(domain, resource.getContents(), eObject));
            
            return domain;
            
        } else if (notifier instanceof Resource) {
            Resource resource = (Resource) notifier;
            
            ResourceSet resourceSet = resource.getResourceSet();
            if (resourceSet != null) {
                return new AdapterFactoryEditingDomain(null, new BasicCommandStack(), resourceSet);
            } else {
                domain = new AdapterFactoryEditingDomain(null, new BasicCommandStack(), (ResourceSet) null);
                resourceSet = domain.getResourceSet();
                domain.getCommandStack().execute(new AddCommand(domain, resourceSet.getResources(), resource));
                return domain;
            }
            
        } else if (notifier instanceof ResourceSet) {
            return new AdapterFactoryEditingDomain(null, new BasicCommandStack(), (ResourceSet) notifier);
        } else {
            throw new EmfHelperException("Not supported argument type.");
        }
    }

    /**
     * Saves the EMF model (EObject or Resource) into the given file. An {@link XMIResourceFactoryImpl} will be
     * registered if not already.
     * 
     * Doesn't throw exception but logs an error if the save was unsuccessful.
     * 
     * @param model Can be an {@link EObject} or a {@link Resource}.
     * @param fileName
     */
    public static void saveModel(Notifier model, String fileName) {

        Objects.requireNonNull(model);
        Preconditions.checkArgument(fileName != null && !fileName.isEmpty(), "File name is null or empty.");

        int extensionIndex = fileName.lastIndexOf('.');

        Preconditions.checkState(extensionIndex > -1 && extensionIndex != fileName.length() - 1, "Bad file extension.");

        String ext = fileName.substring(extensionIndex + 1);

        registerExtensionForXmiSerializer(ext);

        URI uri = URI.createFileURI(fileName);
        Resource resource;

        if (model instanceof ResourceSet) {
            throw new EmfHelperException("Unsupported type: ResourceSet");
        } else if (model instanceof Resource) {
            resource = (Resource) model;
        } else if (model instanceof EObject) {
            EObject root = (EObject) model;
            ResourceSet resSet = new ResourceSetImpl();
            resource = resSet.createResource(uri);
            resource.getContents().add(root);
        } else {
            throw new EmfHelperException("Unkown type: " + model.getClass());
        }

        resource.setURI(uri);
        saveResource(resource);
    }

    private static void saveResource(Resource resource) {
        try {
            resource.save(Collections.emptyMap());
        } catch (IOException e) {
            logger.error(e);
        }
    }

    /**
     * Loads a model as a {@link Resource}. In headless mode, don't forget to call XYZPackage.eINSTANCE.
     */
    public static Resource loadModel(String fileName) throws IOException {
        Preconditions.checkArgument(fileName != null && !fileName.isEmpty(), "File name is null or empty.");
        int extensionIndex = fileName.lastIndexOf('.');
        Preconditions.checkState(extensionIndex > -1 && extensionIndex != fileName.length() - 1, "Bad file extension.");

        String ext = fileName.substring(extensionIndex + 1);
        registerExtensionForXmiSerializer(ext);

        ResourceSetImpl rSet = new ResourceSetImpl();
        URI fileUri = URI.createFileURI(fileName);
        Resource resource = rSet.createResource(fileUri);

        resource.load(null);
        return resource;
    }

    /**
     * Retrieves the root EObject from a Resource or ResourceSet.
     * <ul>
     * <li>Returns null if there is no content.</li>
     * <li>Returns the notifier itself if it is an EObject.</li>
     * <li>Logs a warn if there are multiple roots.</li>
     * </ul>
     * 
     * @param notifier
     * @return The root EObject or null.
     */
    public static EObject getRootEObject(Notifier notifier) {
        if (notifier instanceof EObject) {
            return (EObject) notifier;
        } else if (notifier instanceof Resource) {
            Resource resource = (Resource) notifier;
            List<EObject> contents = resource.getContents();
            if (contents.size() > 1) {
                logger.warn("Resource has more than one root.");
            }
            if (contents.isEmpty()) {
                return null;
            } else {
                return contents.get(0);
            }
        } else if (notifier instanceof ResourceSet) {
            ResourceSet resourceSet = (ResourceSet) notifier;
            List<Resource> resources = resourceSet.getResources();
            if (resources.size() > 1) {
                logger.warn("ResourceSet has more than one resources.");
            }
            if (resources.isEmpty()) {
                return null;
            } else {
                return getRootEObject(resources.get(0));
            }
        } else {
            throw new EmfHelperException("Unkown type: " + notifier.getClass());
        }
    }

    /**
     * Registers an {@link XMIResourceFactoryImpl} for the given extension.
     * @param ext The extension as a String.
     */
    public static void registerExtensionForXmiSerializer(String ext) {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.computeIfAbsent(ext, e -> new XMIResourceFactoryImpl());
    }

    /**
     * Clones the given model. Either an {@link EObject}, {@link Resource} or {@link ResourceSet}.
     * @param notifier The root container of the model.
     * @return The cloned model.
     */
    public static Notifier clone(Notifier notifier) {
        Copier copier = new Copier();
        Notifier clonedModel = clone(notifier, copier, null);
        copier.copyReferences();
        return clonedModel;
    }

    private static Notifier clone(Notifier notifier, Copier copier, ResourceSet resourceSetToCloneTo) {
        Objects.requireNonNull(copier);
        
        if (notifier instanceof EObject) {
            EObject eObject = (EObject) notifier;
            return copier.copy(eObject);
        } else if (notifier instanceof Resource) {
            Resource resource = (Resource) notifier;
            ResourceSet rSetTemp = resourceSetToCloneTo;
            if (resourceSetToCloneTo == null) {
                rSetTemp = new ResourceSetImpl();
            }
            Resource clonedResource = rSetTemp.createResource(URI.createFileURI("dummy.dummyext"));
            
            for (EObject eObject : resource.getContents()) {
                EObject clonedEObject = copier.copy(eObject);
                clonedResource.getContents().add(clonedEObject);
            }
            
            return clonedResource;
        } else if (notifier instanceof ResourceSet) {
            ResourceSet resourceSet = (ResourceSet) notifier;
            ResourceSetImpl clonedResourceSet = new ResourceSetImpl();
            
            for (Resource resource : resourceSet.getResources()) {
                clone(resource, copier, clonedResourceSet);
            }
            
            return clonedResourceSet;
        } else {
            throw new EmfHelperException("Not supported argument type.");
        }
    }

    public static class ENamedElementComparator implements Comparator<ENamedElement> {
        @Override
        public int compare(ENamedElement eClass1, ENamedElement eClass2) {
            return eClass1.getName().compareTo(eClass2.getName());
        }
    }

    /**
     * This class is used to store
     * <ul>
     * <li>{@link EClass}es,</li>
     * <li>{@link EAttribute}s,</li>
     * <li>{@link EReference}s,</li>
     * <li>EAttributes by EClasses,</li>
     * <li>EReferences by EClasses</li>
     * </ul>
     * for a given set of {@link EPackage}s.
     *
     */
    public static class MetaModelElements {
        public Set<EPackage> metaModelPackages;
        public Set<EClass> classes;
        public Set<EAttribute> attributes;
        public Set<EReference> references;
        public Map<EClass, Set<EAttribute>> attributesOfClass;
        public Map<EClass, Set<EReference>> referencesOfClass;
    }

    /**
     * Traverses the full metamodel on the given {@link EPackage}s and returns all the classes, attributes and
     * references it contains.
     * 
     * @param metaModelPackages
     *            The set of {@link EPackage}s.
     * @return A {@link MetaModelElements} instance containing the metamodel elements.
     */
    public static MetaModelElements getAllMetaModelElements(Set<EPackage> metaModelPackages) {
        return getMetaModelElements(metaModelPackages, true, true, true);
    }

    /**
     * Return a {@link MetaModelElements} instance populated with its {@link MetaModelElements#classes}.
     * 
     * @param metaModelPackages
     *            The set of {@link EPackage}s.
     * @return AA {@link MetaModelElements} instance.
     */
    public static MetaModelElements getClasses(Set<EPackage> metaModelPackages) {
        return getMetaModelElements(metaModelPackages, true, false, false);
    }

    /**
     * Return a {@link MetaModelElements} instance populated with its {@link MetaModelElements#references} and
     * {@link MetaModelElements#referencesOfClass}.
     * 
     * @param metaModelPackages
     *            The set of {@link EPackage}s.
     * @return AA {@link MetaModelElements} instance.
     */
    public static MetaModelElements getReferences(Set<EPackage> metaModelPackages) {
        return getMetaModelElements(metaModelPackages, false, true, false);
    }

    /**
     * Return a {@link MetaModelElements} instance populated with its {@link MetaModelElements#attributes} and
     * {@link MetaModelElements#attributesOfClass}.
     * 
     * @param metaModelPackages
     *            The set of {@link EPackage}s.
     * @return AA {@link MetaModelElements} instance.
     */
    public static MetaModelElements getAttrbiutes(Set<EPackage> metaModelPackages) {
        return getMetaModelElements(metaModelPackages, false, false, true);
    }

    private static MetaModelElements getMetaModelElements(Set<EPackage> metaModelPackages, boolean getClasses,
            boolean getReferences, boolean getAttrbiutes) {

        Comparator<ENamedElement> comparator = new ENamedElementComparator();

        MetaModelElements result = new MetaModelElements();
        result.metaModelPackages = metaModelPackages;
        if (getClasses) {
            result.classes = new TreeSet<EClass>(comparator);
        }
        if (getReferences) {
            result.references = new HashSet<EReference>();
            result.referencesOfClass = new HashMap<EClass, Set<EReference>>();
        }
        if (getAttrbiutes) {
            result.attributes = new HashSet<EAttribute>();
            result.attributesOfClass = new HashMap<EClass, Set<EAttribute>>();
        }
        for (EPackage ePackage : metaModelPackages) {
            for (EClassifier eClassifier : ePackage.getEClassifiers()) {
                if (eClassifier instanceof EClass) {
                    EClass eClass = ((EClass) eClassifier);
                    if (getClasses) {
                        result.classes.add(eClass);
                    }
                    if (getReferences) {
                        result.referencesOfClass.put(eClass, new TreeSet<EReference>(comparator));
                        for (EReference eReference : eClass.getEAllReferences()) {
                            result.references.add(eReference);
                            result.referencesOfClass.get(eClass).add(eReference);
                        }
                    }
                    if (getAttrbiutes) {
                        result.attributesOfClass.put(eClass, new TreeSet<EAttribute>(comparator));
                        for (EAttribute eAttribute : eClass.getEAllAttributes()) {
                            result.attributes.add(eAttribute);
                            result.attributesOfClass.get(eClass).add(eAttribute);
                        }
                    }
                }
            }
        }
        return result;
    }

}
