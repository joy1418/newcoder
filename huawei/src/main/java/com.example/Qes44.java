package com.example;

import java.util.Scanner;

public class Qes44 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        int[][] board = new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][i] = in.nextInt();
            }
        }
        sodoku(board);
        for(int i=0;i<9;i++){
            for(int j=0;j<8;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println(board[i][8]);
        }
    }

    public static boolean sodoku(int[][] board){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]==0){
                    for(int k=1;k<=9;k++){
                        if(isLegal(board,i,j,k)){
                            board[i][j]=k;
                            if(sodoku(board)){
                                return true;
                            }
                            board[i][j]=0;//回溯
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    //九宫格是否合法
    public static boolean isLegal(int[][] board,int row,int col,int val){
        for(int i=0;i<9;i++){
            if(board[row][i]==val){  //同行是否重复
                return false;
            }
            if(board[i][col]==val){ //同列是否重复
                return false;
            }
        }
        int startRow = row/3*3; //属于第几个九宫格
        int startCol = col/3*3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(board[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
}
