package com.alice.test1.attention;

public class MatrixUtils {
    public static double[][] dot(double[][] a,double[][]b){//a是query矩阵，b是转置矩阵
        int m=a.length,n=b[0].length,k=a[0].length;
        double[][] result=new double[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                for (int p=0;p<k;k++){
                    result[i][j]+=a[i][p]*b[p][j];//求a和b的内积
                }
            }
        }
        return result;
    }
    public static double[][] transpose(double[][] matrix){//matrix是key矩阵
        int rows=matrix.length,cols=matrix[0].length;
        double[][] transposed=new double[cols][rows];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                transposed[j][i]=matrix[i][j];
            }
        }
        return transposed;
    }
    public static double[][] softmax(double[][] input){

    }
}
