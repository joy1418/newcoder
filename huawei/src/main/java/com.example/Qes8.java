package com.example;

import java.util.*;

public class Qes8 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int line = in.nextInt();
            in.nextLine();
            Map<String,Integer> map = new TreeMap<>();
            for(int i=0;i<line;i++ ){
                String str = in.nextLine();
                String[] arr = str.split(" ");
                map.put(arr[0],map.getOrDefault(arr[0],0)+Integer.parseInt(arr[1]));
            }
            Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
            while (iterator.hasNext()){
                Map.Entry<String,Integer> entry = iterator.next();
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }

}
