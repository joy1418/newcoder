package com.example;

import java.util.Scanner;

public class Qes59 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String res = "-1";
        boolean flag = true;
        for(int i=0;i<str.length();i++){
            String s = str.substring(i,i+1);
            if(str.lastIndexOf(s)==str.indexOf(s)){
                System.out.println(s);
                flag = false;
                break;
            }
        }

        if(flag==true){
            System.out.println("-1");
        }
    }
}
