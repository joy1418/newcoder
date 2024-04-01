package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qes36 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            String all="abcdefghijklmnopqrstuvwxyz";  //字母表
            StringBuilder sb = new StringBuilder();
            List<String> list = new ArrayList<>();
            for(int i=0;i<str1.length();i++){
                String s = str1.substring(i,i+1);
                if(list.contains(s)){
                    continue;
                }else{
                    sb.append(s);
                    list.add(s);
                }
            }
            for(int i=0;i<26;i++){
                String tmp = all.substring(i,i+1);
                if(!list.contains(tmp)){
                    sb.append(tmp);
                }
            }
            String newStr = sb.toString();

            for(int i=0;i<str2.length();i++){
                String ss = str2.substring(i,i+1);
                int index = all.indexOf(ss);

                System.out.print(newStr.charAt(index));
            }
        }
    }
}
