import csv
import numpy as np
import matplotlib.pyplot as plt
from os import listdir, mkdir, path

def main():
	#####SELECTION
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

	#"NA",'SQRTOT', 'SQRMAX'"MPC", "NDA", "NDC", "EDA", 'SQRMAX', 'SQRTOT', 'SQROCOOL', 'SQROSZ', 'SQROSZ2'
	metrics = ['SQRNUM']
	
	xyInverted = False
	compilation = True
	testing = "false" #max, true, false, min
	#####END SELECTION

	if testing == "max" :
		methods = ['Model', 'NHLattice 0', 'NHLattice 1', 'NHLattice 2', 'NHLattice 3']
	if testing == "true" :
		methods = ['Model', 'NHLattice 0', 'NHLattice 1']
	if testing == "false" :
		methods = ['Model', 'NHLattice']
	if testing == "min" :
		methods = ['Model']
	
	numSources = len(sources)
	numMethods =  len(methods)

	allSources = [[[] *  numMethods for i in range(numMethods)] for i in range(numSources)]
	allSourcesX = [[] *  numSources for i in range(numSources)]
		
	for metricName in metrics :
		print('Metric: ' + metricName)
		srcInd = 0
		for sourceName in sources:
			print("  " + str(srcInd) + '/' + str(numSources) + ' : ' + sourceName)
			csvLocation = '../ca.mcgill.ecse.dslreasoner.realistic.metrics/outputs/calculatedMetrics/'
			csvFileName = sourceName + '/' + metricName

			#Make paths if inexistant
			dirPathName = 'outputs/' + sourceName
			pathName = dirPathName + '/' + metricName + ".png"
			createFiles(dirPathName, pathName)

			#Manipulations
			plt.figure(figsize=(16, 9))
			with open(csvLocation + csvFileName + '.csv') as f:
				reader = csv.reader(f, delimiter=',')
				ind = 0
				for row in reader:
					if ind < numMethods :
						rowName = row[0] + row[1]
						rowVals = [float(i) for i in row[2:]]
						numVals = len(rowVals)
						rowXs = np.arange(0, 1, 1 / numVals) 
						allSources[srcInd][ind] = [i for i in rowVals]	
						#Operations
						if ind == 0 :
							toPrint = [i for i in sorted(rowVals)]
						else :
							toPrint = [i for _,i in sorted(zip(allSources[srcInd][0], rowVals))]
						if xyInverted :
							rowTemp = [i for i in rowXs]
							rowXs = [i for i in rowVals]
							rowVals = [i for i in rowTemp]
					
						#End Operations
						if ind == 0 :
							plt.plot(rowXs, toPrint, label = rowName, lineWidth = 3)
						else :
							plt.plot(rowXs, toPrint, label = rowName, alpha = 0.5)
						ind += 1			

			#INDIVIDUAL FIGURES
			#plt.title("Node Activity measurement w/ and w/o neighbourhood")
			plt.title(metricName + " measurement for " + sourceName)
			if xyInverted :
				plt.ylabel("Models")
				plt.xlabel("Metric Value")
			else :
				plt.xlabel("Models")
				plt.ylabel("Metric Value")
			plt.legend()
			#plt.savefig(pathName)
			#plt.show()
			plt.clf()

			srcInd += 1

		print('  Compilation for ' + metricName)
		#COMPILATION FIGURE
		if compilation :
			for j in range(numMethods) :

				plt.figure(figsize=(16, 9))
				#Make paths if inexistant
				dirPathName = 'outputs/_Cumulative'
				pathName = dirPathName + '/' + metricName + "_" + methods[j]+ ".png"
				createFiles(dirPathName, pathName)

				maxModels = 0
				maxMetVal = 0

				for i in range(numSources) :
					allSources[i][j].sort()

					###for normalizing number of models
					numModels = len(allSources[i][j])
					if numModels > maxModels :
						maxModels = numModels

					###for normalizing metric values
					#locMaxMetVal = max(allSources[i])
					#if locMaxMetVal > maxMetVal :
					#	maxMetVal = locMaxMetVal
		
				for i in range(numSources) :
					numModels = len(allSources[i][j])

					###normalize number of models to (max number of models, 1)
					#allSourcesX[i] = np.arange(0, maxModels, float(maxModels) / numModels) 
					allSourcesX[i] = np.arange(0, 1, 1 / numModels) 

					###normalize metric values to (max Metric Value, 1)
					#currentMax = max(allSources[i])
					#allSources[i] = [j * maxMetVal / currentMax for j in allSources[i]]
					#allSources[i] = [j / currentMax for j in allSources[i]]

					plt.plot(allSources[i][j], allSourcesX[i], label = sources[i], lineWidth = 3)
		
				plt.title(metricName + " measurement for all sources from " + methods[j])
				plt.ylabel("Empirical Distribution function")
				plt.xlabel("Metric Value")
				plt.legend()
				plt.savefig(pathName)
				plt.show()
				plt.clf()
		#END COMPILATION FIGURE
		print('END ' + metricName)
		print()



def createFiles(dirPathName, pathName) :
	if not path.exists(dirPathName) :
		mkdir(dirPathName)
	if not path.exists(pathName) :
		open(pathName, 'a').close()

	
if __name__== "__main__":
	main()