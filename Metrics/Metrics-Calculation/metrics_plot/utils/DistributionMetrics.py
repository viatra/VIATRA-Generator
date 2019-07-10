from scipy import stats
from scipy.spatial import distance

def ks_distance(samples1, samples2):
    value, p = stats.ks_2samp(samples1, samples2)
    return (value, p)

def js_distance(samples1, samples2):
    map1 = fromSamples(samples1)
    map2 = fromSamples(samples2)
    allKeys = set(map1.keys()) | set(map2.keys())
    dist1 = distributionFromMap(map1, allKeys)
    dist2 = distributionFromMap(map2, allKeys)
    return distance.jensenshannon(dist1, dist2, 2)

def euclidean_distance(samples1, samples2):
    map1 = fromSamples(samples1)
    map2 = fromSamples(samples2)
    allKeys = set(map1.keys()) | set(map2.keys())
    dist1 = distributionFromMap(map1, allKeys)
    dist2 = distributionFromMap(map2, allKeys)
    distance = 0
    for i in range(len(dist2)):
        distance += pow(dist1[i] - dist2[i], 2)
    return pow(distance, 0.5)

def fromSamples(samples):
    m = {}
    length = len(samples)
    for sample in samples:
        value = m.get(sample, 0)
        m[sample] = value + 1
    for key in list(m.keys()):
        m[key] /= length
    return m

def distributionFromMap(m, allKeys):
    dist = []
    for key in allKeys:
        value = m.get(key, 0)
        dist.append(value)
    return dist

