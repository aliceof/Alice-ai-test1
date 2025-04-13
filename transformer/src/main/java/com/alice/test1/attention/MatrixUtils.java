package com.alice.test1.attention;

import java.util.Arrays;

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
        double[][] result=new double[input.length][input[0].length];
        for (int i=0;i<input.length;i++){
            double max= Arrays.stream(input[i]).max().orElse(0.0);
            double sum=0;
            for (int j=0;j<input[i].length;j++){
                result[i][j]=Math.exp(input[i][j]-max);
                sum+=result[i][j];
            }
            for (int j=0;j<input[i].length;j++){
                result[i][j]/=sum;
            }
        }
        return result;
    }
    public static double[][] scale(double[][] matrix,double factor){
        double[][] result=new double[matrix.length][matrix[0].length];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                result[i][j]=matrix[i][j]*factor;
            }
        }
        return result;
    }
    public static double[][] spilt(double[][] matrix,int start,int end){

    }
 }
