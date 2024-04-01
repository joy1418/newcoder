package com.example;

import java.util.Scanner;

public class Qes96 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String regx = "[0-9]";
            StringBuilder sb = new StringBuilder();
            boolean flag = false;
            for(int i=0;i<str.length();i++){
                String s = str.substring(i,i+1);
                if(s.matches(regx)){           //匹配到数字
                    if(flag){
                        sb.append(s);
                    }else{
                        sb.append("*");
                        sb.append(s);
                        flag=true;
                    }
                    if(i==str.length()-1){
                        sb.append("*");
                    }
                }else{
                    if(flag){
                        sb.append("*");
                        sb.append(s);
                        flag=false;
                    }else{
                        sb.append(s);
                        flag=false;
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}
