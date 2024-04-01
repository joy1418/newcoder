package com.example;

import java.util.Scanner;

public class Qes69 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int[][] a = new int[x][y];
        int[][] b = new int[y][z];
        int[][] c = new int[x][z];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<y;i++){
            for(int j=0;j<z;j++){
                b[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<z;j++){
                for(int k=0;k<y;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<x;i++){
            for(int j=0;j<z;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
