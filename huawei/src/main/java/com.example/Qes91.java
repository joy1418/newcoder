package com.example;

import java.util.Scanner;

public class Qes91 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr =str.split(" ");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            System.out.println(fab(n,m));
        }
    }

    public static int fab(int n,int m){
        int sum = 0;
        if(n<0||m<0){
            sum+=0;
        }
        else if(n==0||m==0){
            sum+=1;
        }else{
            sum=fab(n-1,m)+fab(n,m-1);
        }
        return sum;
    }
}
