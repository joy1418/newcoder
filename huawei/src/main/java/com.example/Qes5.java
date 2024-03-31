package com.example;

import java.util.Scanner;

public class Qes5 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char[] chars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while (in.hasNextLine()){
            String str = in.nextLine();
            str=str.substring(2).toUpperCase();
            int len = str.length();
            int sum = 0;
            int count=0;
            for(int i=len-1;i>=0;i--){
                char cc = str.charAt(i);
                for(int j=0;j<chars.length;j++){
                    if(cc==chars[j]){
                        sum+=Math.pow(16,count)*j;
                        count++;
                    }
                }
            }
            System.out.println(sum);
        }

    }
}
