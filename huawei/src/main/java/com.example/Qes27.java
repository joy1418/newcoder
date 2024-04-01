package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Qes27 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            if(str!=null && !str.equals("")){
                String[] arr = str.split(" ");
                int len = arr.length;
                int num = Integer.parseInt(arr[0]);
                int index = Integer.parseInt(arr[len-1]);
                String key = arr[len-2];
                int count = 0;
                List<String> list = new ArrayList<>();
                for(int i=1;i<len-2;i++){
                    String s = arr[i];
                    if(isBrother(key,s)){
                        count++;
                        list.add(s);
                    }
                }
                Collections.sort(list);
                System.out.println(count);
                if(list.size()>index-1){
                    System.out.println(list.get(index-1));
                }
            }

        }
    }
    public static boolean isBrother(String s1,String s2){
        if(s1==null||s2==null||s1.equals("")||s2.equals("")){
            return false;
        }else{
            if(s1.length()!=s2.length()){
                return false;
            }else{
                if(s1.equals(s2)){
                    return false;
                }else{
                    StringBuilder sb1 = new StringBuilder();
                    StringBuilder sb2 = new StringBuilder();
                    List<String> list1 = new ArrayList<>();
                    List<String> list2 = new ArrayList<>();
                    for(int i=0;i<s1.length();i++){
                        list1.add(s1.substring(i,i+1));
                        list2.add(s2.substring(i,i+1));
                    }
                    Collections.sort(list1);
                    Collections.sort(list2);
                    for(int i=0;i<s1.length();i++){
                        sb1.append(list1.get(i));
                        sb2.append(list2.get(i));
                    }
                    if(sb1.toString().equals(sb2.toString())){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
        }
    }
}
