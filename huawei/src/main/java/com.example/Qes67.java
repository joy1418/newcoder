package com.example;

import java.util.Scanner;

public class Qes67 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] nums = str.split(" ");
        System.out.println(dfss(nums,0.0,"",0)?"true":"false");
    }

    public static boolean dfss(String[] nums,double sum,String exp,int index){
        for(int i=0;i<nums.length;i++){
            String tmp = nums[i];
            if(!tmp.equals("")){
                nums[i] ="";
                int a = Integer.parseInt(tmp);
                if(index==0){
                    if(dfss(nums,a,exp+tmp,index+1)){
                        return true;
                    }
                }else{
                    if(dfss(nums,sum+a,exp+"+"+tmp,index+1)||dfss(nums,sum-a,exp+"-"+tmp,index+1)||
                            dfss(nums,sum*a,exp+"*"+tmp,index+1)||dfss(nums,sum/a,exp+"/"+tmp,index+1)){
                        return true;
                    }
                }
                nums[i]=tmp;
            }
            if(sum==24&&index==nums.length){
                // System.out.println(exp);
                return true;
            }
        }
        return false;
    }
}
