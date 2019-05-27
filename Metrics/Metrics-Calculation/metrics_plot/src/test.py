from sklearn.datasets import load_digits
from sklearn.manifold import MDS
import matplotlib.pyplot as plt
from scipy import stats
import numpy as np

dist = []

for i in range(100):
    rvs = stats.uniform.rvs(size=500, loc=0., scale=1)
    dist.append(rvs)

for i in range(100):
    rvs2 = stats.powerlaw .rvs(1.66, size=500)
    dist.append(rvs2)

matrix = np.empty((len(dist),len(dist)))

for i in range(len(dist)):
    matrix[i,i] = 0
    for j in range(i+1, len(dist)):
        value, p = stats.ks_2samp(dist[i], dist[j])
        matrix[i, j] = value
        matrix[j, i] = value

embedding = MDS(n_components=2, dissimilarity='precomputed')
trans = embedding.fit_transform(X=matrix)
x = (trans[:100,0]).tolist()
y = (trans[:100,1]).tolist()

x2 = (trans[100:,0]).tolist()
y2 = (trans[100:,1]).tolist()
plt.plot(x, y, 'yo')
plt.plot(x2, y2, 'ro')
plt.show()
