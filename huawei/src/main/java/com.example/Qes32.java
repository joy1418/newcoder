package com.example;

import java.util.Scanner;

public class Qes32 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            int max = 0;
            for(int i=0;i<str.length();i++){
                //中心扩散法,只有两种类型
                //ABA型
                int len1 = longest(str,i,i);
                //ABBA型
                int len2 = longest(str,i,i+1);
                max = Math.max(max,len1>len2?len1:len2);
            }
            System.out.println(max);
        }
    }

    public static int longest(String s,int left,int right){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
