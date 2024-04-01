package com.example;

import java.util.Scanner;

public class Qes40 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            int length = str.length();
            int[] arr = {0,0,0,0};
            for(int i=0;i<length;i++){
                String s = str.substring(i,i+1);
                if(s.matches("[a-zA-Z]")){
                    arr[0]+=1;
                }else if(s.equals(" ")){
                    arr[1]+=1;
                }else if(s.matches("[0-9]")){
                    arr[2]+=1;
                }else{
                    arr[3]+=1;
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
