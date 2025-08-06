package com.arrays;

import java.util.Scanner;

public class ThreeDArrays {
    public static void main (String[] args) {
        // A 3D array is a array of 2D.

        Scanner sc = new Scanner(System.in);
        int a[][][] = new int[2][2][2];

        int block = 2;
        int row = 2;
        int column = 2;

        // User input
        for(int i=0;i<block;i++) {
            for(int j=0;j<row;j++) {
                for(int k=0; k<column; k++) {
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        //Display values
        for(int i=0;i<block;i++) {
            for(int j=0;j<row;j++) {
                for(int k=0; k<column; k++) {
                   System.out.print(a[i][j][k]+ " ");
                }
            }
            System.out.println("");
        }
    }
}
