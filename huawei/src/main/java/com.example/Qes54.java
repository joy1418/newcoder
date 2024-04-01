package com.example;

import java.util.Scanner;
import java.util.Stack;

public class Qes54 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.replace("{","(");
        str = str.replace("[","(");
        str = str.replace("}",")");
        str = str.replace("]",")");
        System.out.println(cal(str));
    }

    public static int cal(String s){
        int sum=0;
        Stack<Integer> stack = new Stack<>();
        char opt='+';
        int num=0;
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            char cc = arr[i];
            if(Character.isDigit(cc)){
                num=num*10+arr[i]-'0';
            }
            if(cc=='('){
                int count=1;
                int j=i+1;
                while(count>0){
                    if(arr[j]=='(') count++;
                    if(arr[j]==')') count--;
                    j++;
                }
                num = cal(s.substring(i+1,j-1));
                i=j-1;
            }
            if(!Character.isDigit(cc)||i==s.length()-1){
                switch(opt){
                    case '+':stack.push(num);break;
                    case '-':stack.push(-1*num);break;
                    case '*':stack.push(stack.pop()*num);break;
                    case '/':stack.push(stack.pop()/num);break;

                }
                opt = cc;
                num=0;
            }
        }
        while(!stack.empty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
