package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Qes68 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            int flag = Integer.parseInt(in.nextLine());
            List<HashMap<String,String>> list = new ArrayList<>();
            for(int i=0;i<num;i++){
                String str = in.nextLine();
                String[] arr = str.split(" ");
                HashMap<String,String> map = new HashMap<>();
                map.put("name",arr[0]);
                map.put("score",arr[1]);
                list.add(map);
            }
            list.sort((o1,o2)->{
                int score1 = Integer.parseInt(o1.get("score"));
                int score2 = Integer.parseInt(o2.get("score"));
                if(score1-score2!=0){
                    return flag==0?score2-score1:score1-score2;
                }
                return 0;
            });
            for(int i=0;i<list.size();i++){
                HashMap<String,String> tmp = list.get(i);
                System.out.println(tmp.get("name")+" "+tmp.get("score"));
            }
        }
    }
}
