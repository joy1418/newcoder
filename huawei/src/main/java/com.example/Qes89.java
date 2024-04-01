package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Qes89 {
    static Map<String, Integer> map = new HashMap<>();

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        map.put("2", 2);
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 7);
        map.put("8", 8);
        map.put("9", 9);
        map.put("10", 10);
        map.put("J", 11);
        map.put("Q", 12);
        map.put("K", 13);
        map.put("A", 1);

        String str = in.nextLine();
        if (str.contains("joker") || str.contains("JOKER")) {
            System.out.println("ERROR");
        } else {
            if(!dfs(str.split(" "),0,"",0)){
                System.out.println("NONE");
            }
        }
    }

    public static boolean dfs(String[] nums, int sum, String exp, int index) {
        for (int i = 0; i < nums.length; i++) {
            String tmp = nums[i];
            if (!tmp.equals("")) {
                nums[i] ="";
                int a = map.get(tmp);
                if (index == 0) { //第一张牌
                    if(dfs(nums,a,exp+tmp,index+1)){
                        return true;
                    }
                } else {
                    if(dfs(nums,sum+a,exp+"+"+tmp,index+1)||dfs(nums,sum-a,exp+"-"+tmp,index+1)||
                            dfs(nums,sum*a,exp+"*"+tmp,index+1)||dfs(nums,sum/a,exp+"/"+tmp,index+1)){
                        return true;
                    }
                }
                nums[i] = tmp;//恢复现场
            }

        }
        if (sum == 24 && index == nums.length) {
            System.out.println(exp);
            return true;
        }
        return false;
    }
}
