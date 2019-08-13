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
    # read models
    alloy = GraphCollection('../input/measurement2/yakindu/Alloy/', 100, 'Alloy')
    human = GraphCollection('../input/measurement2/yakindu/Human/', 304, 'Human')
    base = GraphCollection('../input/measurement2/yakindu/BaseViatra/', 100, 'BaseViatra')
    real = GraphCollection('../input/measurement2/yakindu/RealViatra/', 100, 'RealViatra')
    random = GraphCollection('../input/measurement2/yakindu/Random/', 100, 'Random')
    na_rep = GraphCollection('../input/measurement2/yakindu/Human/na_rep/', 1, 'rep')
    mpc_rep = GraphCollection('../input/measurement2/yakindu/Human/mpc_rep/', 1, 'rep')
    od_rep = GraphCollection('../input/measurement2/yakindu/Human/od_rep/', 1, 'rep')

    # a hack to make the node type as the same as an exiting model
    type_rep = GraphCollection('../input/measurement2/yakindu/Human/od_rep/', 1, 'rep')
    type_rep.nts = [{'Entry': 0.04257802080554814, 'Choice': 0.1267671379034409, 'State': 0.1596092291277674, 'Transition': 0.6138636969858629, 'Statechart': 0.010136036276340358, 'Region': 0.04467858095492131, 'Exit': 0.0018338223526273673, 'FinalState': 0.0005334755934915977}]
    types = sorted(type_rep.nts[0].keys())

    # random = GraphCollection('../input/randomOutput/', 500, 'Random')
    # alloy = GraphCollection('../input/alloy/', 500, 'Alloy (30 nodes)')
    # realistic_viatra = GraphCollection('../input/viatra_output_consistent_100/', 50, 'Realistic Viatra With Some Constraints (100 nodes)')
    models_to_compare_na = [human, alloy,base, real, random,  na_rep]
    models_to_compare_mpc = [human, alloy,base, real, random,  mpc_rep]
    models_to_compare_od = [human, alloy,base, real, random,  od_rep]
    models_to_compare_nt = [human, alloy,base, real, random,  type_rep]
    for modelCollection in models_to_compare_nt:
        type_dists = []
        for nt in modelCollection.nts:
            type_dist = []
            for key in types:
                type_dist.append(nt.get(key, 0.0))
            type_dists.append(type_dist)
        modelCollection.nts = type_dists


    # define output folder
    outputFolder = '../output/'

    #calculate metrics
    # metricStat(models_to_compare_na, 'Node_Activity', nodeActivity, 0, outputFolder)
    metricStat(models_to_compare_od, 'Out_Degree', outDegree, 1, outputFolder)
    # metricStat(models_to_compare_mpc, 'MPC', mpc, 2, outputFolder)
    # metricStat(models_to_compare_nt, 'Node Types', nodeType, 3, outputFolder)

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


def calculateMDS(dissimilarities):
    embedding = MDS(n_components=2, dissimilarity='precomputed')
    trans = embedding.fit_transform(X=dissimilarities)
    return trans

def plot(graphTypes, coords, title='',index = 0, savePath = ''):
    color = ['blue', 'm', 'gold', 'green', 'k', 'red']
    markers = ['o', 'v', '+', 'x', '^', '*']
    plt.figure(index, figsize=(5, 4))
    # plt.title(title)
    index = 0
    for i in range(len(graphTypes)):
        x = (coords[index:index+graphTypes[i].size, 0].tolist())
        y = (coords[index:index+graphTypes[i].size, 1].tolist())
        index += graphTypes[i].size
        plt.plot(x, y, color=color[i], marker=markers[i], label = graphTypes[i].name, linestyle='', alpha=0.7)
    plt.savefig(fname = savePath+'.png', dpi=500)
    plt.legend(loc='upper right')
    plt.savefig(fname = savePath+'_lengend.png', dpi=500)

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

def metricStat(graphTypes, metricName, metric, graphIndex, outputFolder):
    metrics = []
    for graph in graphTypes:
        metrics.append(metric(graph))
        outputFolder = outputFolder + graph.name + '-'
    print('calculate' + metricName +' for ' + outputFolder)
    mkdir_p(outputFolder)
    out_d_coords = calculateMDS(calculateKSMatrix(metrics))
    plot(graphTypes, out_d_coords, metricName, graphIndex,outputFolder + '/'+ metricName)

def nodeActivity(graphType):
    return graphType.nas

def outDegree(graphType):
    return graphType.out_ds

def mpc(graphType):
    return graphType.mpcs

def nodeType(graphType):
    return graphType.nts

if __name__ == '__main__':
    main()