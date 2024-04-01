package com.example;

import java.util.*;

public class Qes94 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            String str1 = in.nextLine();
            int sum = Integer.parseInt(in.nextLine());
            String str2 = in.nextLine();
            String[] arr1=str1.split(" ");
            Map<String,Integer> map = new HashMap<>();
            List<String> list =  new ArrayList<>();
            for(String s:arr1){
                map.put(s,0);
                list.add(s);
            }
            String[] arr2 = str2.split(" ");
            int invalid =0;
            for(String s:arr2){
                if(!str1.contains(s)){
                    invalid++;
                }
                if(map.keySet().contains(s)){
                    map.put(s,map.get(s)+1);
                }
            }

            for(int i=0;i<list.size();i++){
                String key = list.get(i);
                sum = sum -map.get(key);
                System.out.println(key+" : "+map.get(key));
            }
            invalid = sum;
            System.out.println("Invalid : "+invalid);
        }
    }

}
