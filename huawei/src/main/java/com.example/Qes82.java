package com.example;

import java.util.Scanner;

public class Qes82 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr=str.split("/");
            int a = Integer.parseInt(arr[0]);
            int b= Integer.parseInt(arr[1]);
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<a;i++){
                sb.append(1+"/"+b+"+");   //取巧输出
            }
            String ss = sb.toString();
            System.out.println(sb.substring(0,ss.length()-1));
        }
    }
}
