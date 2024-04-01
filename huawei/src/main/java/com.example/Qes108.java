package com.example;

import java.util.Scanner;

public class Qes108 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr = str.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = a;
            System.out.println(fab(a,b,c));
        }
    }
    public static int fab(int a,int b,int c){
        int num = 0;
        if(a%b==0){
            num = a;
        }else{
            num = fab(a+c,b,c);  //在a的整数倍中寻找
        }

        return num;
    }

}
