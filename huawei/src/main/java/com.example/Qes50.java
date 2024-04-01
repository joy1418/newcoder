package com.example;

import java.util.Scanner;
import java.util.Stack;

public class Qes50 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();  //算术表达式
        System.out.println(cal(str,0,str.length()-1));
    }

    public static int cal(String str,int start,int end){
        Stack<Integer> stack = new Stack<>();
        char[] arr = str.toCharArray();
        int sum = 0;
        int num = 0;
        char opt = '+'; //
        for(int i=start;i<=end;i++){
            char cc = arr[i];
            if(Character.isDigit(cc)){
                num = num*10+cc-'0';
            }
            if(cc=='{'||cc=='['||cc=='('){
                int j = i;
                int count= 0;
                while (j<=end){
                    if(arr[j]=='{'||arr[j]=='['||arr[j]=='('){
                        count++;
                    }
                    if(arr[j]=='}'||arr[j]==']'||arr[j]==')'){
                        count--;
                    }
                    if(count==0){
                        break;
                    }
                    j++;
                }
                num =cal(str,i+1,j-1);
                i=j-1;

            }
            if(!Character.isDigit(cc)||i==end){
                switch (opt){
                    case '+':stack.push(num);break;
                    case '-':stack.push(-1*num);break;
                    case '*':stack.push(stack.pop()*num);break;
                    case '/':stack.push(stack.pop()/num);break;
                }
                opt=cc;
                num=0;
            }
        }
        while (!stack.isEmpty()){
            sum += stack.pop();
        }
        return sum;
    }
}
