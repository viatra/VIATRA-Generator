import os, sys
lib_path = os.path.abspath(os.path.join('..', '..', 'utils'))
sys.path.append(lib_path)
import glob
import random 
from sklearn.manifold import MDS
import matplotlib.pyplot as plt
from scipy import stats
import numpy as np
from GraphType import GraphCollection
import DistributionMetrics as metrics

def main():
    domain = 'yakindu'
    # read models
    alloy = GraphCollection('../input/{}/Alloy/'.format(domain), 100, 'All')
    human = GraphCollection('../input/{}/Human/'.format(domain), 304, 'Hum')
    base = GraphCollection('../input/{}/Base/'.format(domain), 100, 'GS')
    real = GraphCollection('../input/{}/Real/'.format(domain), 100, 'Real')
    random = GraphCollection('../input/{}/Random/'.format(domain), 100, 'Rand')
    na_rep = GraphCollection('../input/{}/Human/na_rep/'.format(domain), 1, 'Med')
    mpc_rep = GraphCollection('../input/{}/Human/mpc_rep/'.format(domain), 1, 'Med')
    od_rep = GraphCollection('../input/{}/Human/od_rep/'.format(domain), 1, 'Med')

    # a hack to make the node type as the same as an exiting model
    type_rep = GraphCollection('../input/{}/Human/od_rep/'.format(domain), 1, 'Med')
    if(domain == 'yakindu'):
        type_rep.nts = [{'Entry': 0.04257802080554814, 'Choice': 0.1267671379034409, 'State': 0.1596092291277674, 'Transition': 0.6138636969858629, 'Statechart': 0.010136036276340358, 'Region': 0.04467858095492131, 'Exit': 0.0018338223526273673, 'FinalState': 0.0005334755934915977}]
    elif (domain == 'ecore'):
        type_rep.nts = [{'EAttribute': 0.23539778449144008, 'EClass': 0.30996978851963747, 'EReference': 0.33081570996978854, 'EPackage': 0.012789526686807653, 'EAnnotation': 0.002517623363544813, 'EEnumLiteral': 0.07275931520644502, 'EEnum': 0.013645518630412891, 'EDataType': 0.004028197381671702, 'EParameter': 0.005941591137965764, 'EGenericType': 0.002014098690835851, 'EOperation': 0.009415911379657605, 'ETypeParameter': 0.0007049345417925478}]
    elif (domain == 'github'):
        type_rep.nts = [{'Project': 0.012636538873420432, 'Commit': 0.5525808524309276, 'User': 0.05847076461769116, 'Issue': 0.12743628185907047, 'PullRequest': 0.07560505461554937, 'IssueEvent': 0.17327050760334123}]

    types = sorted(type_rep.nts[0].keys())

    model_collections = [human, alloy, random, base,  real]
    # for model_collection in model_collections:
    #     print(model_collection.name)
    #     length = len(model_collection.violations)
    #     percentage = sum(map(lambda v: int(v==0), model_collection.violations)) / length
    #     print(percentage)


    models_to_compare_na = [human, alloy, random, base,  real, na_rep]
    models_to_compare_mpc = [human, alloy, random, base,  real, mpc_rep]
    models_to_compare_od = [human, alloy, random, base,  real, od_rep]
    models_to_compare_nt = [human, real]
    for modelCollection in models_to_compare_nt:
        type_dists = []
        for nt in modelCollection.nts:
            type_dist = []
            for key in types:
                type_dist.append(nt.get(key, 0.0))
            type_dists.append(type_dist)
        modelCollection.nts = type_dists


    # define output folder
    outputFolder = '../output/{}/'.format(domain)

    #calculate metrics
    # metricStat(models_to_compare_na, 'Node_Activity', nodeActivity, 0, outputFolder, calculateKSMatrix)
    # metricStat(models_to_compare_od, 'Out_Degree', outDegree, 1, outputFolder, calculateKSMatrix)
    # metricStat(models_to_compare_mpc, 'MPC', mpc, 2, outputFolder, calculateKSMatrix)
    metricStat(models_to_compare_nt, 'Node_Types', nodeType, 3, outputFolder, calculateManualKSMatrix)   

def calculateKSMatrix(dists):
    dist = []

    for i in range(len(dists)):
        dist = dist + dists[i]
    matrix = np.empty((len(dist),len(dist)))

    for i in range(len(dist)):
        matrix[i,i] = 0
        for j in range(i+1, len(dist)):
            value, p= metrics.ks_distance(dist[i], dist[j])
            matrix[i, j] = value
            matrix[j, i] = value
    return matrix

def calculateManualKSMatrix(dists):
    dist = []

    for i in range(len(dists)):
        dist = dist + dists[i]
    matrix = np.empty((len(dist),len(dist)))

    for i in range(len(dist)):
        matrix[i,i] = 0
        for j in range(i+1, len(dist)):
            value = metrics.manhattan(dist[i], dist[j])
            matrix[i, j] = value
            matrix[j, i] = value
    return matrix


def calculateMDS(dissimilarities):
    embedding = MDS(n_components=2, dissimilarity='precomputed')
    trans = embedding.fit_transform(X=dissimilarities)
    return trans

def plot(graphTypes, coords, title='',index = 0, savePath = ''):
    color = ['#377eb8' , '#e41a1c', '#4daf4a', '#984ea3', '#ff7f00', '#ffff33']
    markers = ['o', '+', 'x', '^', 'v', '*']
    fill_styles = ['full', 'full', 'full', 'none', 'none', 'full']
    plt.figure(index, figsize=(5, 2))
    # plt.title(title)
    index = 0
    for i in range(len(graphTypes)):
        x = (coords[index:index+graphTypes[i].size, 0].tolist())
        y = (coords[index:index+graphTypes[i].size, 1].tolist())
        index += graphTypes[i].size
        plt.plot(x, y, color=color[i], marker=markers[i], label = graphTypes[i].name, linestyle='', alpha=0.7, fillstyle = fill_styles[i])
    plt.savefig(fname = savePath+'.jpg', dpi=500)
    plt.legend(loc='upper right')
    plt.savefig(fname = savePath+'_lengend.jpg', dpi=500)

def mkdir_p(mypath):
    '''Creates a directory. equivalent to using mkdir -p on the command line'''

    from errno import EEXIST
    from os import makedirs,path

    try:
        makedirs(mypath)
    except OSError as exc: # Python >2.5
        if exc.errno == EEXIST and path.isdir(mypath):
            pass
        else: raise

def metricStat(graphTypes, metricName, metric, graphIndex, outputFolder, matrix_calculator):
    metrics = []
    for graph in graphTypes:
        metrics.append(metric(graph))
        outputFolder = outputFolder + graph.name + '-'
    print('calculate' + metricName +' for ' + outputFolder)
    mkdir_p(outputFolder)
    matrix = matrix_calculator(metrics)
    np.savetxt(outputFolder + '/' + metricName + '.csv', matrix, delimiter=',')
    out_d_coords = calculateMDS(matrix)
    plot(graphTypes, out_d_coords, metricName, graphIndex,outputFolder + '/'+ metricName)

def nodeActivity(graphType):
    return graphType.nas

def outDegree(graphType):
    return graphType.out_ds

def mpc(graphType):
    return graphType.mpcs

def nodeType(graphType):
    return graphType.nts

def tcc(graphType):
    return graphType.tccs

if __name__ == '__main__':
    main()