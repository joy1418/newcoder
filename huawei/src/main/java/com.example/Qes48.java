package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Qes48 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            String[] arr = str.split(" ");
            int num = Integer.parseInt(arr[0]);  //节点个数
            int headNum = Integer.parseInt(arr[1]);  //头节点的值
            int val = Integer.parseInt(arr[arr.length-1]); //要删除节点的值
            ListNode head = new ListNode(headNum,null);
            List<Integer> list = new ArrayList<>();
            list.add(headNum);
            for(int i=1;i<=num-1;i++){
                int num1 = Integer.parseInt(arr[2*i]);
                int num2 = Integer.parseInt(arr[2*i+1]);
                list.add(list.indexOf(num2)+1,num1);  //通过list列表操作

            }
            list.remove(list.indexOf(val));
            for(int i:list){
                System.out.print(i+" ");
            }
        }
    }
}

class ListNode{
    int val;
    ListNode next;
    public ListNode(){}
    public ListNode(int val,ListNode next){
        this.val =val;
        this.next = next;
    }
}