import numpy as np
import matplotlib.pyplot as plt
from scipy import stats
import glob
import random
import constants

#
# read csvfile returns outdegree, node activity, mpc
# as matrix with the first row of values and second row of count
#
def readcsvfile(filename):
    
    contents = {}
    with open(filename) as f:
        data = list(f)
        f.close()
        for i, line in enumerate(data):
            arr = line.replace('\n', '').split(',')
            # if there is no element in the line, continue
            if len(line) < 0: continue
            # else check for contents
            # if it is MPC then use float
            if arr[0] == constants.MPC_VALUE:
                contents[constants.MPC_VALUE] = list(map(float, arr[1:]))
            # meta models are string
            elif(arr[0] == constants.METAMODEL):
                contents[constants.METAMODEL] = arr[1:]
            # Node types
            elif(arr[0] == constants.NODE_TYPE):
                types = data[i+1].replace('\n', '').split(',')
                numbers = data[i+2].replace('\n', '').split(',')
                contents[constants.Node_TYPE_KEY] = {t : n for t, n in zip(types, numbers)}
            # NA and OD are integers, and store other information as string
            else:
                try:
                    contents[arr[0]] = list(map(int, arr[1:]))
                except:
                    contents[arr[0]] = arr[1:]
    return contents

def checkAndReshape(arr):
    if len(arr.shape) < 2:
        arr = np.reshape(arr, (arr.shape[0],1))
    return arr

def readTrajectory(filename):
    state_codes = []
    with open(filename) as f:
        for i, line in enumerate(f):
            if(line == ''): continue
            state_codes.append(int(line))
    return state_codes
#
# take a matrix as input
# return the sample array
#
def getsample(dataMatrix):
    data = []
    value = dataMatrix[0, :]
    count = dataMatrix[1, :]
    for i, v in enumerate(value):
        for x in range(0, int(count[i])):
            data.append(v)
    return data

def reproduceSample(values, counts):
    arr = np.array([values, counts])
    return getsample(arr)

#
# take an array of filenames as input
# return the samples of outdegree, na, mpc
#
def getmetrics(filename):
    contents = readcsvfile(filename)
    outdegree_sample = reproduceSample(contents[constants.OUT_DEGREE_VALUE], contents[constants.OUT_DEGREE_COUNT])
    na_sample = reproduceSample(contents[constants.NA_VALUE], contents[constants.NA_COUNT])
    mpc_sample = reproduceSample(contents[constants.MPC_VALUE], contents[constants.MPC_COUNT])
    return contents,outdegree_sample, na_sample, mpc_sample

#
# read number of files in the given path RANDOMLY
#
def readmultiplefiles(dirName, maxNumberOfFiles, shouldShuffle = True):
    list_of_files = glob.glob(dirName + '*.csv')  # create the list of file
    if shouldShuffle: 
        random.shuffle(list_of_files)
    #if the number of files is out of bound then just give the whole list
    file_names =  list_of_files[:maxNumberOfFiles]
    # print(file_names)
    return file_names


def plotlines(x, y, ax):
    l1, = ax.plot(x, y)


def testgetsamplesfromfiles():
    files = readmultiplefiles('../statistics/viatraOutput/', 2)
    for file in files:
        getmetrics(file)

def probability(data):
    sum = np.sum(data)
    probabilityList = []
    for d in data:
        p = d/sum
        probabilityList.append(p)
    a = np.array(probabilityList)
    return a


def cumulativeProbability(p):
    cdf = np.cumsum(p)
    return cdf


def plot():
    fig, ax = plt.subplots()
    fig, ax1 = plt.subplots()
    fig, ax2 = plt.subplots()
    fig, ax3 = plt.subplots()
    fig, ax4 = plt.subplots()
    fig, ax5 = plt.subplots()
    list_of_files = readmultiplefiles('../statistics/iatraOutput/')
    for file_name in list_of_files:
        contents = readcsvfile(file_name)
        outdegree = [contents[constants.OUT_DEGREE_VALUE], contents[constants.OUT_DEGREE_COUNT]]
        na = [contents[constants.NA_VALUE], contents[constants.NA_COUNT]]
        mpc = [contents[constants.MPC_VALUE], contents[constants.MPC_COUNT]]
        outV = outdegree[0, :]
        outC = outdegree[1, :]
        outP = probability(outC)
        outCumP = cumulativeProbability(outP)
        plotlines(outV, outP, ax)
        naV = na[0, :]
        naC = na[1, :]
        naP = probability(naC)
        naCumP = cumulativeProbability(naP)
        plotlines(naV, naP, ax1)
        mpcV = mpc[0, :]
        mpcC = mpc[1, :]
        mpcP = probability(mpcC)
        mpcCumP = cumulativeProbability(mpcP)
        plotlines(mpcV, mpcP, ax2)
        plotlines(outV, outCumP, ax3)
        plotlines(naV, naCumP, ax4)
        plotlines(mpcV, mpcCumP, ax5)
    ax.set_xlabel('ourdegree')
    ax.set_ylabel('pdf')
    ax.grid()

    ax1.set_xlabel('node activity')
    ax1.set_ylabel('pdf')
    ax1.grid()

    ax2.set_xlabel('multiplex participation coefficient')
    ax2.set_ylabel('pdf')
    ax2.grid()

    ax3.set_xlabel('ourdegree')
    ax3.set_ylabel('cdf')
    ax3.grid()

    ax4.set_xlabel('node activity')
    ax4.set_ylabel('cdf')
    ax4.grid()

    ax5.set_xlabel('multiplex participation coefficient')
    ax5.set_ylabel('cdf')
    ax5.grid()

    plt.show()


# plot()

