package com.example;

import java.util.*;
import java.util.stream.Collectors;

public class Qes3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int num = in.nextInt();
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<num;i++){
                set.add(in.nextInt());
            }
            Iterator<Integer> iterator=set.iterator();
            /*set.stream().sorted();  //stream方式
            while (iterator.hasNext()){
                int tmp = iterator.next();
                System.out.println(tmp);
            }*/
            List<Integer> list = new ArrayList<>();
            while (iterator.hasNext()){
                int tmp = iterator.next();
                list.add(tmp);
            }
            Collections.sort(list);
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }


        }
    }
}
