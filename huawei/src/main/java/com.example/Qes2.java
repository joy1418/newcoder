package com.example;

import java.util.Scanner;

public class Qes2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            str1=str1.toLowerCase();
            str2=str2.toLowerCase();
            int count=0;
            for(int i=0;i<str1.length();i++){
                if(str1.substring(i,i+1).equals(str2)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
