import glob
import random 
from sklearn.manifold import MDS
import matplotlib.pyplot as plt
from scipy import stats
import numpy as np
from GraphType import GraphCollection

def calculateKSMatrix(dists):
    dist = []

    for i in range(len(dists)):
        dist = dist + dists[i]
    matrix = np.empty((len(dist),len(dist)))

    for i in range(len(dist)):
        matrix[i,i] = 0
        for j in range(i+1, len(dist)):
            value, p = stats.ks_2samp(dist[i], dist[j])
            matrix[i, j] = value
            matrix[j, i] = value
    return matrix


def calculateMDS(dissimilarities):
    embedding = MDS(n_components=2, dissimilarity='precomputed')
    trans = embedding.fit_transform(X=dissimilarities)
    return trans

def plot(graphTypes, coords, title='',index = 0, savePath = ''):
    half_length = int(coords.shape[0] / len(graphTypes))
    color = ['blue', 'red', 'green', 'yellow']
    lineStyle = ['', '-']
    plt.figure(index, figsize=(7, 4))
    plt.title(title)
    for i in range(len(graphTypes)):
        x = (coords[(i*half_length):((i+1)*half_length), 0].tolist())
        y = (coords[(i*half_length):((i+1)*half_length), 1].tolist())
        plt.plot(x, y, color=color[i], marker='o', label = graphTypes[i].name, linestyle=lineStyle[i], alpha=0.7)
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

def metricStat(graphTypes, metricName, metric, graphIndex):
    metrics = []
    foldName = '../output/'
    for graph in graphTypes:
        metrics.append(metric(graph))
        foldName = foldName + graph.name + '-'
    print('calculate' + metricName +' for ' + foldName)
    mkdir_p(foldName)
    out_d_coords = calculateMDS(calculateKSMatrix(metrics))
    plot(graphTypes, out_d_coords, metricName, graphIndex,foldName + '/'+ metricName+'.png')

def nodeActivity(graphType):
    return graphType.nas

def outDegree(graphType):
    return graphType.out_ds

def mpc(graphType):
    return graphType.mpcs


# read models
human = GraphCollection('../statistics/humanOutput/', 500, 'Human')
# viatra30 = GraphCollection('../statistics/viatraOutput30/', 500, 'Viatra (30 nodes)')
# viatra60 = GraphCollection('../statistics/viatraOutput60/', 500, 'Viatra (60 nodes)')
# viatra100 = GraphCollection('../statistics/viatraOutput100/', 500, 'Viatra (100 nodes)')
# random = GraphCollection('../statistics/randomOutput/', 500, 'Random')
# alloy = GraphCollection('../statistics/alloyOutput/', 500, 'Alloy (30 nodes)')
viatraEvolve = GraphCollection('../statistics/viatraEvolve/', 130, 'viatraEvolve', shouldShuffle = False)

#calculate metrics
metricStat([human, viatraEvolve], 'Node Activity', nodeActivity, 0)
metricStat([human, viatraEvolve], 'Out Degree', outDegree, 1)
metricStat([human, viatraEvolve], 'MPC', mpc, 2)