package com.example;

import java.util.Scanner;

public class Qes97 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count1=0;
        int count2 = 0;
        int sum=0;
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            int num = Integer.parseInt(in.nextLine());
            String str = in.nextLine();
            String[] arr = str.split(" ");
            for(int i=0;i<arr.length;i++){
                String s = arr[i];
                if(Integer.parseInt(s)<0){
                    count1++;
                }else if(Integer.parseInt(s)>0){
                    count2++;
                    sum+=Integer.parseInt(s);
                }
            }

        }
        double d=0.0;
        if(count2!=0){
            d = sum*1.0/count2;
        }
        System.out.print(count1+" "+String.format("%.1f",d));
    }
}
