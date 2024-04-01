package com.example;

import java.util.Scanner;

public class Qes55 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num = in.nextInt();
            int count=0;
            for(int i=1;i<=num;i++){
                if(i%7==0){
                    count++;
                }else{
                    String s = i+"";
                    if(s.contains("7")){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
