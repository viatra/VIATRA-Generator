import csv
import numpy as np
import matplotlib.pyplot as plt
from os import listdir

def main():
	csvLocation = '../ca.mcgill.ecse.dslreasoner.realistic.metrics/outputs/calculatedMetrics/stats/'
	csvFileName = 'stats'

	with open(csvLocation + csvFileName + '.csv') as f:
		reader = csv.reader(f, delimiter=',')
		for row in reader:
			rowName = row[0]
			rowVals = [float(i) for i in row[1:]]
			plt.plot(rowVals, label = rowName)
	
#	plt.yticks(fontsize=17)
#	plt.xticks(fontsize=17)
	plt.title("Node Activity measurement w/ and w/o neighbourhood")
	plt.ylabel("Metric value")
	plt.xlabel("Different models")
	plt.ylim(bottom=0, top=5)
	plt.legend()
	plt.savefig('outputs/' + csvFileName + ".png")
	plt.show()
	plt.clf()
	
if __name__== "__main__":
	main()