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
	metrics = ['EDA']
	numPlotLines = 50
	compilation = True
	showFigs = "01" # 00, 01, 10, 11
	testing = "false" #max, true, false, min
	#####END SELECTION

	colors = ['tab:blue', 'tab:orange', 'tab:green', 'tab:red', 'tab:purple', 'tab:brown', 'tab:pink', 'tab:gray', 'tab:olive', 'tab:cyan']
	lineStyles = ["--", ":", ":", ":", ":", ":"]
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
	
	csvLocation = '../ca.mcgill.ecse.dslreasoner.realistic.metrics/outputs/calculatedMetrics/'

	allMetVals = [[[] *  numMethods for i in range(numMethods)] for i in range(numSources)]
	allCDFs = [[] *  numSources for i in range(numSources)]
	theoryValues = []
		
	for metricName in metrics :
		print('Metric: ' + metricName)
		srcInd = 0
		globalMax = 0
		for sourceName in sources:
			print("  " + str(srcInd+1) + '/' + str(numSources) + ' : ' + sourceName)
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
				#find max Val for boundarries
				for row in reader :
					for val in row[3:] :
						if maxVal < float(val) :
							maxVal = float(val)
						if globalMax < float(val) :
							globalMax = float(val)
				
			with open(csvLocation + csvFileName + '.csv') as f:
				reader = csv.reader(f, delimiter=',')
				methodInd = 0
				lineNum = 0
				methodName = "Model"

				#We can do this because our metrics are all non-negative
				buffer = maxVal * 0.05		
				#technically, this has to be +inf
				highBound = maxVal + buffer
				#technically, this has to be -inf
				lowBound = 0-buffer
				for row in reader:

					if methodName != row[1] :
						methodInd += 1
						lineNum = 0
						methodName = row[1]

					if methodInd < numMethods and lineNum < numPlotLines:
						cdf, metVals = getArrays(row[3:], lowBound, highBound)
						
						line = plt.step( metVals, cdf,  color = colors[methodInd], linewidth = 2, linestyle = lineStyles[methodInd])
						if lineNum == 0 :
							plt.setp(line, label = methodName)
						lineNum += 1

			#INDIVIDUAL FIGURES
			plt.xlim(lowBound, highBound)
			plt.title(metricName + " measurement for " + sourceName)
			plt.xlabel("Metric Value")
			plt.ylabel("Cumulative Distribution Function")
			plt.legend()
			#plt.savefig(pathName)
			if showFigs[0] == "1" :
				plt.show()
			plt.clf()

			srcInd += 1

		
		#COMPILATION FIGURE
		if compilation :
			print('  Compilation for ' + metricName)
			buffer = globalMax * 0.05
			#technically, this has to be +inf
			highBound = globalMax + buffer
			#technically, this has to be -inf
			lowBound = 0-buffer

			for methodName in methods :

				plt.figure(figsize=(16, 9))
				#Make paths if inexistant
				dirPathName = 'outputs/_Cumulative'
				pathName = dirPathName + '/' + metricName + "_" + methodName+ ".png"
				createFiles(dirPathName, pathName)
				srcInd = 0
				for sourceName in sources:
					csvFileName = sourceName + '/' + metricName

					with open(csvLocation + csvFileName + '.csv') as f:
						reader = csv.reader(f, delimiter=',')
						lineNum = 0
						
						for row in reader:
							if methodName == row[1] and lineNum < numPlotLines:
								cdf, metVals = getArrays(row[3:], lowBound, highBound)
						
								line = plt.step( metVals, cdf,  lineWidth = 1, alpha = 0.75, color = colors[srcInd])
								if lineNum == 0 :
									plt.setp(line, label = sourceName)
								lineNum += 1
					srcInd += 1
								
				plt.xlim(lowBound, highBound)
				plt.title(metricName + " measurement for all sources from " + methodName)
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

def getArrays(rawIn, low, high) :
	rowVals = [float(i) for i in rawIn]
	numVals = len(rowVals)
						
	cdf = np.arange(0.0, 1.0, 1 / numVals) 
	if cdf.shape[0] == numVals :
		cdf = np.append(cdf, [1])
	cdf = np.append([0], cdf)
							
	metVals = [i for i in sorted(rowVals)]
	#ADJUST X LIMITS
	metVals = np.append([low], metVals)						
	metVals = np.append([metVals], [high])

	return cdf, metVals

	
if __name__== "__main__":
	main()