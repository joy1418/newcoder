package com.example;

import java.util.Scanner;

public class Qes90 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr = str.split("\\.");
            String res = "YES";
            if(arr.length!=4){
                res="NO";
            }
            for(int i=0;i<arr.length;i++){
                String s = arr[i];
                if(s.length()==0||s==null){
                    res="NO";
                    break;
                }
                int num = Integer.parseInt(s);
                if(!s.equals(num+"")){
                    res="NO";
                    break;
                }
                if(num<0||num>255){
                    res="NO";
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
