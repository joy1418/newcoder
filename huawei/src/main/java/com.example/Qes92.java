package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qes92 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            int max = 0;
            List<String> list = new ArrayList<>();
            for(int i=0;i<str.length();i++){
                for(int j=i;j<=str.length();j++){
                    String ss = str.substring(i,j);
                    if(isDigit(ss)&&ss.length()>=max){
                        max = ss.length();
                        list.add(ss);
                    }
                }
            }
            for(int i=0;i<list.size();i++){
                if(list.get(i).length()==max){
                    System.out.print(list.get(i));
                }
            }
            System.out.println(","+max);
        }
    }

    public static boolean isDigit(String s){
        boolean flag= false;
        if(s.matches("[0-9]+")){
            flag = true;
        }
        return flag;
    }
}
