package com.example;

import java.util.Scanner;

public class Qes84 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str= in.nextLine();
            String regx="[A-Z]";
            int sum = 0;
            for(int i=0;i<str.length();i++){
                if(str.substring(i,i+1).matches(regx)){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
