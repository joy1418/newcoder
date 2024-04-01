package com.example;

import java.util.Scanner;

public class Qes29 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str1 =in.nextLine();
            String str2 = in.nextLine();
            System.out.println(encode(str1));
            System.out.println(decode(str2));
        }
    }

    public static String encode(String s){
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i=0;i<len;i++){
            String tmp = s.substring(i,i+1);
            if(tmp.matches("[A-Z]")){
                if(tmp.equals("Z")){
                    sb.append("a");
                }else{
                    sb.append((char)(tmp.charAt(0)+32+1));
                }
            }else if(tmp.matches("[a-z]")){
                if(tmp.equals("z")){
                    sb.append("A");
                }else{
                    sb.append((char)(tmp.charAt(0)-32+1));
                }
            }else if(tmp.matches("[0-9]")){
                if(tmp.equals("9")){
                    sb.append("0");
                }else{
                    sb.append((char)(tmp.charAt(0)+1));
                }
            }else {
                sb.append(tmp);
            }
        }
        return sb.toString();
    }

    public static String decode(String s){
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for(int i=0;i<len;i++){
            String ss = s.substring(i,i+1);
            if(ss.matches("[A-Z]")){
                if(ss.equals("A")){
                    sb.append("z");
                }else{
                    sb.append((char)(ss.charAt(0)+32-1));
                }
            }else if(ss.matches("[a-z]")){
                if(ss.equals("z")){
                    sb.append("A");
                }else{
                    sb.append((char)(ss.charAt(0)-32-1));
                }
            }else if(ss.matches("[0-9]")){
                if(ss.equals("0")){
                    sb.append("9");
                }else{
                    sb.append((char)(ss.charAt(0)-1));
                }
            }else {
                sb.append(ss);
            }
        }
        return sb.toString();
    }
}
