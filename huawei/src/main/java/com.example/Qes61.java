package com.example;

import java.util.Scanner;

public class Qes61 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr = str.split(" ");
            int m = Integer.parseInt(arr[0]);
            int n = Integer.parseInt(arr[1]);
            System.out.println(fab(m,n));
        }
    }

    public static int fab(int m,int n){
        int sum = 0;
        if(m==0||n==1||m==1){
            sum += 1;
            return sum;
        }else if (n>m){      //盘子多于苹果,n-m多余空盘子不影响结果
            return fab(m,m);
        }else{
            return fab(m,n-1)+fab(m-n,n);  //至少一个空盘+每盘至少一个
        }

    }
}
