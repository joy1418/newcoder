package com.example;

import java.util.*;

public class Qes41 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            int[] weightArr = new int[num];  //重量种类
            int[] countsArr = new int[num];  //重量个数
            for(int i=0;i<num;i++){
                weightArr[i]=in.nextInt();
            }
            for(int i=0;i<num;i++){
                countsArr[i]=in.nextInt();
            }
            Set<Integer> set = new HashSet<>();
            List<Integer> list = new ArrayList<>();  //存储所有砝码
            for(int i=0;i<num;i++){
                int weight = weightArr[i];
                int count = countsArr[i];
                while(count>0){
                    list.add(weight);
                    count--;
                }
            }
            set.add(0);  //重量为0
            for(int i=0;i<list.size();i++){
                List<Integer> tmpList = new ArrayList<>();
                for(int ii:set){
                    tmpList.add(list.get(i)+ii);   //遍历砝码列表，每次遍历都加set集合每个值
                }
                for(int val:tmpList){
                    set.add(val);
                }
            }
            System.out.println(set.size());
        }
    }
}
