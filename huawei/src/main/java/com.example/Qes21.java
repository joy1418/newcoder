package com.example;

import java.util.Scanner;

public class Qes21 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String regx = "[A-Z]{1}";
            String s1="1";
            String s2 = "abc";
            String s3 = "def";
            String s4 = "ghi";
            String s5="jkl";
            String s6 ="mno";
            String s7="pqrs";
            String s8="tuv";
            String s9="wxyz";
            String s10="0";
            for(int i=0;i<str.length();i++){
                String s = str.substring(i,i+1);
                if(s.matches(regx)){
                    if(s.equals("Z")){
                        System.out.print('a');
                    }else{
                        System.out.print((char)(s.charAt(0)+32+1));
                    }
                }else if(s1.contains(s)){
                    System.out.print(1);
                }else if(s2.contains(s)){
                    System.out.print(2);
                }else if(s3.contains(s)){
                    System.out.print(3);
                }else if(s4.contains(s)){
                    System.out.print(4);
                }else if(s5.contains(s)){
                    System.out.print(5);
                }else if(s6.contains(s)){
                    System.out.print(6);
                }else if(s7.contains(s)){
                    System.out.print(7);
                }else if(s8.contains(s)){
                    System.out.print(8);
                }else if(s9.contains(s)){
                    System.out.print(9);
                }else if(s10.contains(s)){
                    System.out.print(0);
                }else{
                    System.out.print(s);
                }
            }
        }
    }
}
