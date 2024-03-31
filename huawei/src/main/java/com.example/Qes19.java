package com.example;

import java.util.*;

public class Qes19 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        while (in.hasNextLine()){
            String str = in.nextLine();
            if(str.equals("0")){  //退出循环
                break;
            }
            str = str.substring(str.lastIndexOf("\\")+1);
            String[] arr = str.split(" ");
            int len = arr[0].length();
            if(len>16){
                str = arr[0].substring(len-16,len)+" "+arr[1];
            }
            if(list.contains(str)){
                map.put(str,map.getOrDefault(str,0)+1);
            }else{
                list.add(str);
                map.put(str,1);
            }
        }
        int start=0;
        if(list.size()>8){
            start=list.size()-8;
        }
        for(int i=start;i<list.size();i++){
            String ss = list.get(i);
            System.out.print(ss+" ");
            System.out.println(map.get(ss));
        }
    }
}
