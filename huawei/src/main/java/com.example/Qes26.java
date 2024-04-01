package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Qes26 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            String str = in.nextLine();
            if(str!=null && !str.equals("")){
                List<Character> list = new ArrayList<>();
                for(Character cc:str.toCharArray()){
                    if(Character.isLetter(cc)){
                        list.add(cc);
                    }
                }
                list.sort(new Comparator<Character>() {
                    @Override
                    public int compare(Character o1, Character o2) {
                        return Character.toLowerCase(o1)-Character.toLowerCase(o2);
                    }
                });
                StringBuilder sb =  new StringBuilder();
                for(int i=0,j=0;i<str.length();i++){
                    String ss = str.substring(i,i+1);
                    if(Character.isLetter(ss.charAt(0))){
                        sb.append(list.get(j++));
                    }else{
                        sb.append(ss);
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }
}
