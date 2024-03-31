package com.example;

import java.util.Scanner;

public class Qes17 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr = str.split(";");
            int width = 0;
            int height = 0;
            for(int i=0;i<arr.length;i++){
                String ss = arr[i];
                if(ss.matches("[AWSD]{1}[0-9]{1,2}")){
                    char cc = ss.charAt(0);
                    int n = Integer.parseInt(ss.substring(1));
                    switch (cc){
                        case 'A':width-=n;break;
                        case 'W':height+=n;break;
                        case 'D':width+=n;break;
                        case 'S':height-=n;break;
                        default:break;
                    }
                }
            }
            System.out.println(+width+","+height);
        }
    }
}
