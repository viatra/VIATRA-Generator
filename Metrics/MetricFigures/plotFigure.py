import csv
import numpy as np
import matplotlib.pyplot as plt
from os import listdir

def main():
	#fileNames = ['statsNA', 'statsMPC', 'statsEDA']
	fileNames = ['statsEDA1', 'statsEDA2', 'statsEDA3']
	for csvFileName in fileNames:
		csvLocation = '../ca.mcgill.ecse.dslreasoner.realistic.metrics/outputs/calculatedMetrics/stats/'
		with open(csvLocation + csvFileName + '.csv') as f:
			reader = csv.reader(f, delimiter=',')
			ind = 0
			for row in reader:
				rowName = row[0] + row[1]
				for i in row[2:] :
					print(i)
					float(i)
				rowVals = [float(i) for i in row[2:]]
				if ind == 0 :
					plt.plot(rowVals, label = rowName, lineWidth = 3)
				else :
					plt.plot(rowVals, label = rowName, alpha = 0.5)
				ind += 1
	
		plt.title("Node Activity measurement w/ and w/o neighbourhood")
		plt.ylabel("Metric value")
		plt.xlabel("Different models")
	#	plt.ylim(bottom=0, top=5)
		plt.legend()
		plt.savefig('outputs/' + csvFileName + ".png")
		plt.show()
		plt.clf()
	
if __name__== "__main__":
	main()