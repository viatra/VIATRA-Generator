package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app;

import java.util.ArrayList;
import java.util.List;

import weka.core.matrix.LinearRegression;
import weka.core.matrix.Matrix;

public class Test {
	public static void main(String[] args) {
		linearRegressionTest();
	}
	
	public static void linearRegressionTest() {
		double[][] x = {{1,1,2,3}, {1,2,3,4}, {1,3,5,7}, {1,1,5,7}}; 
		double[] y = {10, 13, 19, 17};
		double[] valueToPredict = {1,1,1,1}; 
		Matrix m = new Matrix(x);
		Matrix n = new Matrix(y, y.length);
		
		LinearRegression regression = new LinearRegression(m, n, 0);
		double[] coef = regression.getCoefficients();
	
		//predict
		double a = 0;
		for(int i = 0; i < coef.length; i++) {
			a += coef[i] * valueToPredict[i];
		}
		System.out.println(a);
	}
}
