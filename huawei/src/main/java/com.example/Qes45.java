package com.example;

import java.util.*;

public class Qes45 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            for(int i=0;i<num;i++){
                String str = in.nextLine();
                Map<String,Integer> map = new HashMap<>();
                str = str.toLowerCase();
                for(int j=0;j<str.length();j++){
                    String s = str.substring(j,j+1);
                    if(map.containsKey(s)){
                        map.put(s,map.get(s)+1);
                    }else{
                        map.put(s,1);
                    }
                }
                List<Integer> list = new ArrayList<>();
                for(String ss:map.keySet()){
                    list.add(map.get(ss));
                }
                Collections.sort(list,Collections.reverseOrder());
                int sum = 0;
                int nn = 26;
                for(Integer ii:list){
                    sum = sum+nn*ii;
                    nn--;
                }
                System.out.println(sum);
            }
        }
    }
}
