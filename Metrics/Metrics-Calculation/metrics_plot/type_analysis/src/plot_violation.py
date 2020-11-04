import matplotlib.pyplot as plt
import numpy as np
import cdf_histogram as cdf
import readCSV as reader
import constants
import csv
from shutil import copy


# viatra_controlled = np.genfromtxt('../statistics/violations/viatra_controlled.csv', delimiter='\n')
# viatra_controlled_mean = np.mean(viatra_controlled)
# viatra_nocons = np.genfromtxt('../statistics/violations/viatra_no_cons_violation.csv', delimiter='\n')
# viatra_nocons_mean = np.mean(viatra_nocons)
# human = np.genfromtxt('../statistics/violations/human_violation.csv', delimiter='\n')
# human_mean = np.mean(human)
# print('viatra controlled violation mean: ' + str(viatra_controlled_mean))
# print('viatra no cons violation mean: ' + str(viatra_nocons_mean))
# print('human output violation mean: ' + str(human_mean))


def read_violation_file(file_name):
    violation = {}
    with open(file_name) as f:
        for i, line in enumerate(f):
            line = int(line.rstrip())
            if line in violation:
                violation[line] += 1
            else:
                violation[line] = 1
    f.close()
    return violation

# violation = read_violation_file('../statistics/violations/viatra_controlled.csv')
# print(violation)
# fig, ax = plt.subplots()
# rects = ax.bar(violation.keys(), violation.values())
# cdf.autolabel(rects, ax)
# ax.set_title('viatra controlled violation distribution')
# ax.set_xlabel('number of violations')
# ax.set_ylabel('number of occurrence')
# plt.show()
# fig.savefig('../statistics/violations/viatra_controlled_violation_distribution.png')


def plot_violation():
    v = np.array([0,1,1,0,0])
    print(v)
    (n, bins) = np.histogram(v, bins=v.size, density=True)  # NumPy version (no plot)
    # plt.plot(.5 * (bins[1:] + bins[:-1]), n)
    plt.hist(v, bins=50, density=1)
    plt.show()


def human_output_size():
    list_of_files = reader.readmultiplefiles('../statistics/humanOutput/', 5000)
    num_nodes_list =[]
    human_size_dic = {}
    for file in list_of_files:
        contents = reader.readcsvfile(file)
        num_of_node = contents[constants.NUMBER_NODES]
        # human_size_dic[file] = int(num_of_node[0])
        # num_nodes_list.append(int(num_of_node[0]))
        if 90 <= num_of_node[0] <= 110:
            copy(file, '../statistics/human_output_100/')

    # mean = np.mean(num_nodes_list)
    # std = np.std(num_nodes_list)
    # with open('../statistics/human_output_size.csv', 'w', newline='') as csvfile:
    #     spamwriter = csv.writer(csvfile, delimiter=',',
    #                             quotechar='|', quoting=csv.QUOTE_MINIMAL)
    #     spamwriter.writerow(['mean', mean])
    #     spamwriter.writerow(['standard deviation', std])
    #     for key, value in human_size_dic.items():
    #         spamwriter.writerow([key, value])



