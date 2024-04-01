package com.example;

import java.util.Scanner;

public class Qes85 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int length = str.length();
        int max = 0;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<=length;j++){
                String s = str.substring(i,j);
                if(isTure(s) && s.length()>max){
                    max = s.length();
                }
            }
        }
        System.out.println(max);
    }

    public static boolean isTure(String str){
        StringBuilder sb = new StringBuilder(str).reverse();
        if(str.equals(sb.toString())){
            return true;
        }else{
            return false;
        }
    }
}
