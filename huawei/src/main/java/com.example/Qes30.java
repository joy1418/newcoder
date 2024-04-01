package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Qes30 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr = str.split(" ");
            str=arr[0]+arr[1];
            List<String> list1 = new ArrayList<>(); //奇数列
            List<String> list2 = new ArrayList<>(); //偶数列
            for(int i=0;i<str.length();i++){
                if(i%2==0){
                    list2.add(str.substring(i,i+1));
                }else {
                    list1.add(str.substring(i,i+1));
                }
            }
            Collections.sort(list1);
            Collections.sort(list2);
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<list2.size();i++){
                if(i>list1.size()-1){
                    sb.append(list2.get(i));
                }else{
                    sb.append(list2.get(i)).append(list1.get(i));
                }
            }
            String newstr = sb.toString();
            System.out.println(trans(newstr));

        }
    }

    public static String trans(String s){
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        String[] arr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        for(int i=0;i<len;i++){
            String tmp = s.substring(i,i+1);
            if(tmp.matches("[0-9]")){
                if(tmp.equals("0")){
                    sb.append("0");
                }else{
                    String ss = Integer.toBinaryString(Integer.parseInt(tmp));
                    int ll = ss.length();
                    while (ll<4){
                        ss = "0"+ss;
                        ll++;
                    }
                    ss = new StringBuilder(ss).reverse().toString();
                    sb.append(Integer.toString(Integer.parseInt(ss,2),16).toUpperCase());
                }
            }else if(tmp.matches("[a-fA-F]")){
                String ss = tmp.toUpperCase();
                int cha = 0;
                for(int j=0;j< arr.length;j++){
                    if(ss.equals(arr[j])){
                        cha = j;
                    }
                }
                int ll = ss.length();
                while (ll<4){
                    ss = "0"+ss;
                    ll++;
                }
                ss = Integer.toBinaryString(cha);
                ss = new StringBuilder(ss).reverse().toString();
                sb.append(Integer.toString(Integer.parseInt(ss,2),16).toUpperCase());

            }else {
                sb.append(tmp);
            }
        }
        return sb.toString();
    }
}
