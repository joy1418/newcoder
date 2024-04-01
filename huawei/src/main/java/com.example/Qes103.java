package com.example;

import java.util.Scanner;

public class Qes103 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            int[] arr = new int[num];
            for(int i=0;i<num;i++){
                arr[i]=in.nextInt();
            }
            int[] bushu = new int[num];

            for(int i=0;i<num;i++){
                bushu[i]=1;
                for(int j=0;j<i;j++){
                    if(arr[i] > arr[j]){
                        bushu[i] = Math.max(bushu[j]+1,bushu[i]);
                    }
                }
            }
            int max = 0;
            for(int i=0;i<num;i++){
                max=Math.max(max,bushu[i]);
            }
            System.out.println(max);
        }
    }
}
