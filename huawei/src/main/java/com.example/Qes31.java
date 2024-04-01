package com.example;

import java.util.Scanner;

public class Qes31 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            int len = str.length();
            StringBuilder sb = new StringBuilder();
            int flag = 0;  //多空格标识
            for(int i=0;i<len;i++){
                String ss = str.substring(i,i+1);
                if(ss.matches("[a-zA-Z]")){
                    sb.append(ss);
                    flag =0;
                }else {
                    if(flag==0){
                        sb.append(" ");
                        flag = 1;
                    }
                }
            }
            String[] arr = sb.toString().split(" ");
            for(int i=arr.length-1;i>=0;i--){
                if(i==0){
                    System.out.print(arr[i]);
                }else{
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
