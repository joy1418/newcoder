package com.example;

import java.util.Scanner;

public class Qes38 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()){
            double h = in.nextDouble();
            double sum = h;
            double tmp = h/2;
            for(int i=1;i<5;i++){
                sum = tmp*2 +sum;
                tmp = tmp/2;
            }
            System.out.println(sum);
            System.out.println(tmp);
        }
    }
}
