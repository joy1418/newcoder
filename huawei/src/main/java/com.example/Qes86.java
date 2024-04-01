package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Qes86 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            String str = Integer.toBinaryString(a);
            int sum=0;
            List<Integer> list =  new ArrayList<>();

            for(int i=0;i<str.length();i++){
                if(str.substring(i,i+1).equals("1")){
                    sum++;
                }else{
                    list.add(sum);
                    sum=0;
                }
                if(i==str.length()-1){
                    list.add(sum);
                }
            }
            Collections.sort(list);
            System.out.println(list.get(list.size()-1));
        }
    }
}
