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
    human = GraphCollection('../input/humanOutput/', 500, 'Human')
    # viatra30 = GraphCollection('../input/viatraOutput30/', 500,'Viatra (30 nodes)')
    # viatra60 = GraphCollection('../input/viatraOutput60/', 500, 'Viatra (60 nodes)')
    viatra100 = GraphCollection('../input/viatraOutput100/', 500, 'Viatra (100 nodes)')
    viatra100R = GraphCollection('../input/realisticViatraOutput_container/', 500, 'Realistic Viatra containers (100 nodes)')
    viatra100C = GraphCollection('../input/viatraOutput100C/', 500, 'Realistic Viatra consistent (100 nodes)')
    viatra100EE = GraphCollection('../input/realisticViatra_excludeExit/', 500, 'Realistic Viatra no Exit (100 nodes)')
    # random = GraphCollection('../input/randomOutput/', 500, 'Random')
    # alloy = GraphCollection('../input/alloyOutput/', 500, 'Alloy (30 nodes)')
    # realistic_viatra = GraphCollection('../input/viatra_output_consistent_100/', 50, 'Realistic Viatra With Some Constraints (100 nodes)')
    # human100 = GraphCollection('../input/human_output_100/', 304, 'Human')
    models_to_compare = [human, viatra100EE,viatra100C]
    
    # define output folder
    outputFolder = '../output/'

    #calculate metrics
    metricStat(models_to_compare, 'Node Activity', nodeActivity, 0, outputFolder)
    metricStat(models_to_compare, 'Out Degree', outDegree, 1, outputFolder)
    metricStat(models_to_compare, 'MPC', mpc, 2, outputFolder)

def calculateKSMatrix(dists):
    dist = []

    for i in range(len(dists)):
        dist = dist + dists[i]
    matrix = np.empty((len(dist),len(dist)))

    for i in range(len(dist)):
        matrix[i,i] = 0
        for j in range(i+1, len(dist)):
            value, p = metrics.ks_distance(dist[i], dist[j])
            matrix[i, j] = value
            matrix[j, i] = value
    return matrix


def calculateMDS(dissimilarities):
    embedding = MDS(n_components=2, dissimilarity='precomputed')
    trans = embedding.fit_transform(X=dissimilarities)
    return trans

def plot(graphTypes, coords, title='',index = 0, savePath = ''):
    color = ['blue', 'red', 'green', 'yellow']
    plt.figure(index, figsize=(7, 4))
    plt.title(title)
    index = 0
    for i in range(len(graphTypes)):
        x = (coords[index:index+graphTypes[i].size, 0].tolist())
        y = (coords[index:index+graphTypes[i].size, 1].tolist())
        index += graphTypes[i].size
        plt.plot(x, y, color=color[i], marker='o', label = graphTypes[i].name, linestyle='', alpha=0.7)
    plt.legend(loc='upper right')
    plt.savefig(fname = savePath, dpi=150)
    #graph.show()

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
    plot(graphTypes, out_d_coords, metricName, graphIndex,outputFolder + '/'+ metricName+'.png')

def nodeActivity(graphType):
    return graphType.nas

def outDegree(graphType):
    return graphType.out_ds

def mpc(graphType):
    return graphType.mpcs

if __name__ == '__main__':
    main()