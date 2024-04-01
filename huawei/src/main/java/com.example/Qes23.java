package com.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qes23 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            Map<String,Integer> map = new HashMap<>();
            for(int i=0;i<str.length();i++){
                String ss = str.substring(i,i+1);
                map.put(ss,map.getOrDefault(ss,0)+1);
            }
            int min = Collections.min(map.values());
            for(String s:map.keySet()){
                if(map.get(s)==min){
                    str=str.replace(s,"");
                }
            }
            System.out.println(str);
        }
    }
}
