package com.example;

import java.util.Scanner;

public class Qes37 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            System.out.println(fab(num));
        }
    }

    public static int fab(int num){
        if(num==1||num==2){
            return 1;
        }
        if(num>2){
            return fab(num-1)+fab(num-2);
        }
        return 0;
    }
}
