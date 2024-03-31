package com.example;

import java.util.*;

public class Qes20 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            int flag = 0;
            if(str.length()<=8){
                flag = 1;
                //System.out.println("NG");
            }else{
                Set<Character> set = new HashSet<>();
                for(int i=0;i<str.length();i++){
                    String s = str.substring(i,i+1);
                    if(s.matches("[a-z]")){
                        set.add('a');
                    }else if(s.matches("[A-Z]")){
                        set.add('b');
                    }else if(s.matches("[0-9]")){
                        set.add('c');
                    }else{
                        set.add('d');
                    }
                }
                if(set.size()<3){
                    flag=1;
                    //System.out.println("NG");
                }else{
                    List<String> list = new ArrayList<>();
                    for(int i=0;i<str.length()-2;i++){
                        String tmp = str.substring(i,i+3);
                        if(list.contains(tmp)){
                            //System.out.println("NG");
                            flag=1;
                        }else{
                            list.add(tmp);
                        }
                    }
                }
            }
            //System.out.println(str);
            if(flag==0){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }

}
