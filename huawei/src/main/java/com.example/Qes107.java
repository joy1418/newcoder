package com.example;

import java.util.Scanner;

public class Qes107 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double d = in.nextDouble();

        double left = Math.min(-1.0,d);
        double right = Math.max(1.0,d);
        while(Math.abs(right-left)>0.0001){
            double mid = (left+right)/2;   //二分查找
            if(Math.pow(mid,3)<d){
                left = mid;
            }else{
                right = mid;
            }
        }
        System.out.println(String.format("%.1f",right));
    }
}
