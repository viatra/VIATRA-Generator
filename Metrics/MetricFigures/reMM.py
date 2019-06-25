import csv
import numpy as np
import matplotlib.pyplot as plt
from os import listdir
import re

def main():
	#fileNames = ['statsNA', 'statsMPC', 'statsEDA']
	parentDir = '../ca.mcgill.ecse.dslreasoner.realistic.metrics/inputs/'
	dir = 'A0/models/run1/'

	rep = "viatrasolver.domain.sgraph"
	repWith = "hu.bme.mit.inf.yakindumm"

	allfiles = listdir(parentDir+dir)
	relFiles = []

	for file in allfiles :
		if file.endswith('1_1 - Copy.txt') :
			relFiles.append(file)

	for file in relFiles :
		f = open(parentDir + dir + file, 'r')
		y = f.read()
		print(y)
		print(f)
		print(f.read())
		x = f.read().replace(rep, repWith)
		print(x)
		f.close
			

	print(relFiles)

if __name__== "__main__":
	main()