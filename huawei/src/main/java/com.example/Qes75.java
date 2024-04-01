package com.example;

import java.util.Scanner;

public class Qes75 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        String s1 = str1.length()<str2.length()?str1:str2;//短字符串
        String s2 = str1.length()<str2.length()?str2:str1; //长字符串
        int max = 0;
        for(int i=0;i<s1.length();i++){
            for(int j=s1.length();j>i;j--){
                String tmp = s1.substring(i,j);
                if(s2.contains(tmp)){
                    max= j-i>max?j-i:max;
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
