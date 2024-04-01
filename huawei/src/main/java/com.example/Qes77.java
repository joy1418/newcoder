package com.example;

import java.util.*;

public class Qes77 {

    static List<String> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());  //火车数
            String str = in.nextLine();
            String[] nums = str.split(" ");
            Stack<String> stack = new Stack<>();
            traninout(nums,0,stack,"",0);
            Collections.sort(list);
            for(String s:list){
                System.out.println(s);
            }
        }
    }

    /*
     * nums  火车列表
     * innum 进站次数
     * stack  栈
     * str   出站序列
     * outnum  出站次数
     */
    public static void traninout(String[] nums,int in,Stack<String> stack,String str,int out){
        if(out== nums.length){  //全部出站，将出站顺序放入list
            list.add(str);
        }
        if(in< nums.length){  //可入栈
            stack.push(nums[in]);
            traninout(nums,in+1,stack,str,out);
            stack.pop();  //恢复现场
        }
        if(!stack.isEmpty()){  //可出站
            String tmp = stack.pop();
            traninout(nums,in,stack,str+tmp+" ",out+1);
            stack.push(tmp);  //恢复现场
        }
    }
}
