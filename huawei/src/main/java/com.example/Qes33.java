package com.example;

import java.util.Scanner;

public class Qes33 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String ip = in.nextLine();
            String num = in.nextLine();
            String[] arr = ip.split("\\.");
            String newstr = toBinary(arr[0])+toBinary(arr[1])+toBinary(arr[2])+toBinary(arr[3]);
            System.out.println(Long.parseLong(newstr,2));
            String ss = Long.toBinaryString(Long.parseLong(num));
            int len = ss.length();
            while (len<32){
                len++;
                ss = "0"+ss;
            }
            for(int i=0;i<4;i++){
                String tmp = ss.substring(8*i,8*(i+1));
                int n = Integer.parseInt(tmp,2);
                if(i==3){
                    System.out.print(n);
                }else{
                    System.out.print(n+".");
                }
            }
        }
    }

    public static String toBinary(String s){
        String ss = Integer.toBinaryString(Integer.parseInt(s));
        int len =ss.length();
        while (len<8){
            len++;
            ss = "0"+ss;
        }
        return ss;
    }


}
