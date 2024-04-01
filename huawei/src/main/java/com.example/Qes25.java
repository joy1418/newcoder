package com.example;

import java.util.*;

public class Qes25 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            String[] arr1 = str1.split(" ");
            int num1 = Integer.parseInt(arr1[0]);
            String[] nums1 = new String[num1];
            for(int i=0;i<num1;i++){
                nums1[i]=arr1[i+1];
            }
            String[] arr2 = str2.split(" ");
            int num2 = Integer.parseInt(arr2[0]);
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<num2;i++){
                if(!list.contains(Integer.parseInt(arr2[i+1]))){
                    list.add(Integer.parseInt(arr2[i+1]));
                }
            }
            Collections.sort(list);
            int count=0;
            List<Map<String,String>> keyList = new ArrayList<Map<String,String>>();
            for(int i=0;i<list.size();i++){
                String key = list.get(i)+"";
                Map<String,String> map = new HashMap<>();
                for(int j=0;j<num1;j++){
                    String ss = nums1[j];
                    if(ss.contains(key)){
                        count++;
                        map.put(key,map.getOrDefault(key,"")+j+" "+ss+" ");
                    }
                }
                if(map.size()>0){
                    keyList.add(map);
                }
            }
            StringBuilder sb = new StringBuilder();
            for(Map<String,String> m:keyList){
                for(int ii:list){
                    if(m.containsKey(ii+"")){
                        String val = m.get(ii+"");
                        val = val.trim();
                        String[] valarr = val.split(" ");
                        sb.append(ii+" ").append(valarr.length/2+" ").append(val);
                        count++;
                    }
                }
                sb.append(" ");
            }
            int sum = count*2;
            System.out.println(sum+" "+sb.toString().trim());

        }
    }
}
