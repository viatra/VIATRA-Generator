/**
 * Generated from platform:/resource/ca.mcgill.ecse.dslreasoner.vampire.queries/src/ca/mcgill/ecse/dslreasoner/vampire/queries/vampireQueries.vql
 */
package ca.mcgill.ecse.dslreasoner.vampire.queries;

import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSAnd;
import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSAnnotation;
import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSComment;
import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSEquivalent;
import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSExistentialQuantifier;
import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSFofFormula;
import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSFunction;
import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSFunctionFof;
import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSInequality;
import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSOr;
import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSUnaryNegation;
import ca.mcgill.ecse.dslreasoner.vampire.queries.VLSUniversalQuantifier;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;

/**
 * A pattern group formed of all public patterns defined in vampireQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file vampireQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package ca.mcgill.ecse.dslreasoner.vampire.queries, the group contains the definition of the following patterns: <ul>
 * <li>VLSComment</li>
 * <li>VLSFofFormula</li>
 * <li>VLSAnnotation</li>
 * <li>VLSOr</li>
 * <li>VLSAnd</li>
 * <li>VLSEquivalent</li>
 * <li>VLSFunction</li>
 * <li>VLSExistentialQuantifier</li>
 * <li>VLSUniversalQuantifier</li>
 * <li>VLSUnaryNegation</li>
 * <li>VLSInequality</li>
 * <li>VLSFunctionFof</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class VampireQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static VampireQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new VampireQueries();
    }
    return INSTANCE;
  }
  
  private static VampireQueries INSTANCE;
  
  private VampireQueries() {
    querySpecifications.add(VLSComment.instance());
    querySpecifications.add(VLSFofFormula.instance());
    querySpecifications.add(VLSAnnotation.instance());
    querySpecifications.add(VLSOr.instance());
    querySpecifications.add(VLSAnd.instance());
    querySpecifications.add(VLSEquivalent.instance());
    querySpecifications.add(VLSFunction.instance());
    querySpecifications.add(VLSExistentialQuantifier.instance());
    querySpecifications.add(VLSUniversalQuantifier.instance());
    querySpecifications.add(VLSUnaryNegation.instance());
    querySpecifications.add(VLSInequality.instance());
    querySpecifications.add(VLSFunctionFof.instance());
  }
  
  public VLSComment getVLSComment() {
    return VLSComment.instance();
  }
  
  public VLSComment.Matcher getVLSComment(final ViatraQueryEngine engine) {
    return VLSComment.Matcher.on(engine);
  }
  
  public VLSFofFormula getVLSFofFormula() {
    return VLSFofFormula.instance();
  }
  
  public VLSFofFormula.Matcher getVLSFofFormula(final ViatraQueryEngine engine) {
    return VLSFofFormula.Matcher.on(engine);
  }
  
  public VLSAnnotation getVLSAnnotation() {
    return VLSAnnotation.instance();
  }
  
  public VLSAnnotation.Matcher getVLSAnnotation(final ViatraQueryEngine engine) {
    return VLSAnnotation.Matcher.on(engine);
  }
  
  public VLSOr getVLSOr() {
    return VLSOr.instance();
  }
  
  public VLSOr.Matcher getVLSOr(final ViatraQueryEngine engine) {
    return VLSOr.Matcher.on(engine);
  }
  
  public VLSAnd getVLSAnd() {
    return VLSAnd.instance();
  }
  
  public VLSAnd.Matcher getVLSAnd(final ViatraQueryEngine engine) {
    return VLSAnd.Matcher.on(engine);
  }
  
  public VLSEquivalent getVLSEquivalent() {
    return VLSEquivalent.instance();
  }
  
  public VLSEquivalent.Matcher getVLSEquivalent(final ViatraQueryEngine engine) {
    return VLSEquivalent.Matcher.on(engine);
  }
  
  public VLSFunction getVLSFunction() {
    return VLSFunction.instance();
  }
  
  public VLSFunction.Matcher getVLSFunction(final ViatraQueryEngine engine) {
    return VLSFunction.Matcher.on(engine);
  }
  
  public VLSExistentialQuantifier getVLSExistentialQuantifier() {
    return VLSExistentialQuantifier.instance();
  }
  
  public VLSExistentialQuantifier.Matcher getVLSExistentialQuantifier(final ViatraQueryEngine engine) {
    return VLSExistentialQuantifier.Matcher.on(engine);
  }
  
  public VLSUniversalQuantifier getVLSUniversalQuantifier() {
    return VLSUniversalQuantifier.instance();
  }
  
  public VLSUniversalQuantifier.Matcher getVLSUniversalQuantifier(final ViatraQueryEngine engine) {
    return VLSUniversalQuantifier.Matcher.on(engine);
  }
  
  public VLSUnaryNegation getVLSUnaryNegation() {
    return VLSUnaryNegation.instance();
  }
  
  public VLSUnaryNegation.Matcher getVLSUnaryNegation(final ViatraQueryEngine engine) {
    return VLSUnaryNegation.Matcher.on(engine);
  }
  
  public VLSInequality getVLSInequality() {
    return VLSInequality.instance();
  }
  
  public VLSInequality.Matcher getVLSInequality(final ViatraQueryEngine engine) {
    return VLSInequality.Matcher.on(engine);
  }
  
  public VLSFunctionFof getVLSFunctionFof() {
    return VLSFunctionFof.instance();
  }
  
  public VLSFunctionFof.Matcher getVLSFunctionFof(final ViatraQueryEngine engine) {
    return VLSFunctionFof.Matcher.on(engine);
  }
}
