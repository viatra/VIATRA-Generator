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
	metrics = ['SQRCNT']
	
	compilation = True
	showFigs = "01" # 00, 01, 10, 11
	testing = "min" #max, true, false, min
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

	allMetVals = [[[] *  numMethods for i in range(numMethods)] for i in range(numSources)]
	allCDFs = [[] *  numSources for i in range(numSources)]
	theoryValues = []
		
	for metricName in metrics :
		print('Metric: ' + metricName)
		srcInd = 0
		for sourceName in sources:
			print("  " + str(srcInd+1) + '/' + str(numSources) + ' : ' + sourceName)
			csvLocation = '../ca.mcgill.ecse.dslreasoner.realistic.metrics/outputs/calculatedMetrics/'
			csvFileName = sourceName + '/' + metricName

			#Make paths if inexistant
			dirPathName = 'outputs/' + sourceName
			pathName = dirPathName + '/' + metricName + ".png"
			createFiles(dirPathName, pathName)

			#Manipulations
			plt.figure(figsize=(16, 9))
			maxVal = 0
			buffer = 0
			with open(csvLocation + csvFileName + '.csv') as f:
				reader = csv.reader(f, delimiter=',')
				ind = 0
				for row in reader:
					if ind < numMethods :
						rowName = row[0] + row[1]
						rowVals = [float(i) for i in row[2:]]
						#rowVals = [1,2,2,3,4]
						numVals = len(rowVals)
						cdf = np.arange(0, 1, 1 / numVals) 
						cdf = np.append([0], cdf)
						cdf = np.append(cdf, [1])
						allCDFs[srcInd] = [i for i in cdf]	
						#Operations
						if ind == 0 :
							
							metVals = [i for i in sorted(rowVals)]
							theoryValues = [i for i in rowVals]
						else :
							metVals = [i for _,i in sorted(zip(theoryValues, rowVals))]
						
						allMetVals[srcInd][ind] = [i for i in metVals]	
						
						#ADJUST X LIMITS
						#We can do this because our metrics are all non-negative
						maxVal = metVals[numVals-1]
						buffer = float(maxVal) * 0.05
						#technically, this has to be -inf
						metVals = np.append([0-buffer], metVals)
						#technically, this has to be +inf
						metVals = np.append(metVals, [maxVal + buffer])

						line = plt.step( metVals, cdf, label = rowName)
						if ind == 0 :
							plt.setp(line, linewidth = 3)
						else:
							plt.setp(line, alpha = 0.5)
						ind += 1			

			#INDIVIDUAL FIGURES
			plt.xlim(0-buffer, maxVal+buffer)
			plt.title(metricName + " measurement for " + sourceName)
			plt.xlabel("Metric Value")
			plt.ylabel("Cumulative Distribution Function")
			plt.legend()
			#plt.savefig(pathName)
			if showFigs[0] == "1" :
				plt.show()
			plt.clf()

			srcInd += 1

		print('  Compilation for ' + metricName)
		#COMPILATION FIGURE
		if compilation :
			maxVal = 0
			buffer = 0
			for j in range(numMethods) :

				plt.figure(figsize=(16, 9))
				#Make paths if inexistant
				dirPathName = 'outputs/_Cumulative'
				pathName = dirPathName + '/' + metricName + "_" + methods[j]+ ".png"
				createFiles(dirPathName, pathName)

				#find the max value
				for i in range(numSources) :
					numVals = len(allMetVals[i][j])
					if allMetVals[i][j][numVals-1] > maxVal :
						maxVal = allMetVals[i][j][numVals-1]
		
				for i in range(numSources) :
					#ADJUST X LIMITS
					buffer = float(maxVal) * 0.05
					#technically, this has to be -inf
					allMetVals[i][j] = np.append([0-buffer], allMetVals[i][j])
					#technically, this has to be +inf
					allMetVals[i][j] = np.append(allMetVals[i][j], [maxVal + buffer])


					plt.step(allMetVals[i][j], allCDFs[i], label = sources[i], lineWidth = 3, alpha = 0.75)
		
				plt.xlim(0-buffer, maxVal+buffer)
				plt.title(metricName + " measurement for all sources from " + methods[j])
				plt.ylabel("Cumulative Distribution function")
				plt.xlabel("Metric Value")
				plt.legend()
				#plt.savefig(pathName)
				if showFigs[1] == "1" :
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