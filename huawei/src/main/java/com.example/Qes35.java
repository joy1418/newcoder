package com.example;

import java.util.Scanner;

public class Qes35 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            int[][] nums = new int[num][];
            int val = 1;
            for(int i=0;i<num;i++){
                nums[i] = new int[num-i];
                for(int j=0;j<i+1;j++){
                    nums[i-j][j]=val;
                    val++;
                }
            }
            for(int[] a:nums){
                for(int aa:a){
                    System.out.print(aa+" ");
                }
                System.out.println();
            }
        }
    }
}
