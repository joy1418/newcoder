package com.example;

import java.util.Scanner;

public class Qes6 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int num = in.nextInt();
            if(num>1){
                while (num%2==0){

                        System.out.print(2+" ");
                        num=num/2;

                }
                for(int i=3;i<Math.sqrt(num);i+=2){
                    while (num%i==0){
                        System.out.print(i+" ");
                        num=num/i;
                    }
                }
                if(num>2){
                    System.out.print(num);
                }
            }
        }
    }
}
