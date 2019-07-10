import csv
import numpy as np
import matplotlib.pyplot as plt
from os import listdir, mkdir, path

def main():
	#fileNames = ['statsNA', 'statsMPC', 'statsEDA']
	sources = [
			'A0'
			, 'A20'
			, 'Human'
			, 'RandomEMF-WF+7'
			, 'RandomEMF30'
			, 'VS-i'
			, 'VS-WF+All5'
			, 'VS-WF+All6'
			, 'VS-WF+All7'
			, 'VS+i'
			]
	metrics = ['SQRtot']
	
	for metricName in metrics :
		for sourceName in sources:
		
			csvLocation = '../ca.mcgill.ecse.dslreasoner.realistic.metrics/outputs/calculatedMetrics/'
			csvFileName = sourceName + '/' + metricName
			with open(csvLocation + csvFileName + '.csv') as f:
				reader = csv.reader(f, delimiter=',')
				ind = 0
				for row in reader:
					rowName = row[0] + row[1]
					for i in row[2:] :
						#print(i)
						float(i)
					rowVals = [float(i) for i in row[2:]]
					if ind == 0 :
						plt.plot(rowVals, label = rowName, lineWidth = 3)
					else :
						plt.plot(rowVals, label = rowName, alpha = 0.5)
					ind += 1

			#Make paths if inexistant
			dirPathName = 'outputs/' + sourceName
			pathName = 'outputs/' + csvFileName + ".png"
			if not path.exists(dirPathName) :
				mkdir(dirPathName)
			if not path.exists(pathName) :
				open(pathName, 'a').close()
		
			#plt.title("Node Activity measurement w/ and w/o neighbourhood")
			plt.title(metricName + " measurement for " + sourceName)
			plt.ylabel("Metric value")
			plt.xlabel("Different models")
		#	plt.ylim(bottom=0, top=5)
			plt.legend()
			plt.savefig(pathName)
			plt.show()
			plt.clf()
		#ADD COMPILATION OF SOURCES FOR A GIVEN METRIC HERE!!!!

	
if __name__== "__main__":
	main()