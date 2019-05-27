from GraphType import GraphStat
from GraphType import GraphCollection
from scipy import stats
import readCSV as reader
import matplotlib.pyplot as plt

class GraphDistance:
    #init with a graph stat and a collection of graph stats
    def __init__(self, graphStat, collection):
        self.graph = graphStat
        self.collection = collection
        print('calculating for %d' %(self.graph.id))
        self.out_d_distance = average_ks_distance(collection.out_ds, graphStat.out_d)
        self.na_distance = average_ks_distance(collection.nas, graphStat.na)
        self.mpc_distance = average_ks_distance(collection.mpcs, graphStat.mpc)

def average_ks_distance(targets, sample):
    distance = 0.0
    for target in targets:
        value, p = stats.ks_2samp(target, sample)
        distance += value
    
    distance = distance / len(targets)
    return distance

# metric_selector: GraphDistance -> float
def plot(infos, lines, id, metric_selector, title):
    metric_distances = retrive_info_from_list(metric_selector, list(infos.values()))
    x = retrive_info_from_list(lambda a : a.graph.num_nodes, list(infos.values))
    graph = plt.figure(id)
    plt.title(title)

    for line in lines:
        line_infos = retrive_info_from_list(lambda a: infos[a], line)
        line_y = retrive_info_from_list(metric_selector, line_infos)
        line_x = retrive_info_from_list(lambda a : a.graph.num_nodes, list(infos.values))
        plt.plot(line_x, line_y, color='blue')
    plt.plot(x, metric_distances, color='red', linestyle='', marker='o',alpha=0.7)
    graph.show()

def retrive_info_from_list(selector, distances):
    return list(map(selector, list(infos.values)))

human = GraphCollection('../statistics/humanOutput/', 300, 'Human')
file_names = reader.readmultiplefiles('../statistics/viatraEvolve/', 500, False)

infos = []
# read all files
for name in file_names:
    infos.append(GraphStat(name))

infos = list(map(lambda s: GraphDistance(s, human), infos))

info_dic = {}
for info in infos:
    info_dic[info.graph.id] = info

plot(info_dic, [[1,2,3,4,5,6,7,8,9,10]], 0, lambda a: a.out_d_distance, 'out degree')
# plot(info_dic, 1, lambda a: a.na_distance, 'node activity')
# plot(info_dic, 2, lambda a: a.mpc_distance, 'mpc')

input()