from pyclustering.cluster.kmedoids import kmedoids
from pyclustering.utils import read_sample
from pyclustering.samples.definitions import FCPS_SAMPLES
from pyclustering.utils.metric import distance_metric, type_metric
import matplotlib.pyplot as plt 

# metric = distance_metric(type_metric.MINKOWSKI, degree=2)
# print(metric([1,1], [2,2]))

# Load list of points for cluster analysis.
sample = [[1,1,1], [2,2,2],[3,3,3]]

# Set random initial medoids.
initial_medoids = [1, 1 ,1]
# Create instance of K-Medoids algorithm.
kmedoids_instance = kmedoids(sample, initial_medoids)
# Run cluster analysis and obtain results.
kmedoids_instance.process()
centoids = kmedoids_instance.get_medoids()
clusters = kmedoids_instance.get_clusters()
# Show allocated clusters.
for cluster_id in range(len(clusters)):
    for index in clusters[cluster_id]:
        if(cluster_id == 0):
            plt.plot(sample[index][0], sample[index][1], 'ro')
            print(sample[index][0])
        else:
            plt.plot(sample[index][0], sample[index][1], 'bo')

plt.plot(sample[centoids[0]][0], sample[centoids[0]][1], 'bo')
# plt.plot(sample[centoids[1]][0], sample[centoids[1]][1], 'ro')
plt.show()