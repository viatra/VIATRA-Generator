clear;
clc;

matrix = load('-ascii', "output.txt");
hist(matrix,unique(matrix));
hold on;
[a,b] = hist(matrix,unique(matrix))
plot(b, a)
hold off;
sum(matrix)
average = sum(matrix) / length(matrix)