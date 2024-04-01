package com.example;

import java.util.Scanner;

public class Qes22 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            if(str!=null && !str.equals("")&&!str.equals("0")) {
                System.out.println(fab(Integer.parseInt(str)));
            }
        }
    }
    public static int fab(int num){
        if(num==0||num==1){
            return 0;
        }
        if(num>=2){
            return 1+fab(num-2);
        }else {
            return 0;
        }

    }
}
