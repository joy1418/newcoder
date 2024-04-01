package com.example;

import java.util.Scanner;

public class Qes49 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());

            Node headNode = new Node();
            Node p = headNode;
            String str = in.nextLine();
            int a = Integer.parseInt(in.nextLine());
            String[] arr = str.split(" ");
            for(String s:arr){
                Node node = new Node();
                node.setKey(Integer.parseInt(s));
                p.setNext(node);
                p=node;
            }
            Node p1 = null;
            for(int i=0;i<=num-a;i++ ){
                p1 = headNode.getNext();
                headNode = p1;
            }
            System.out.println(p1.getKey());
        }
    }

}

class Node{
    private int key;
    private Node next;

    public void setKey(int key){
        this.key = key;
    }
    public int getKey(){
        return this.key;
    }

    public void setNext(Node next){
        this.next= next;
    }
    public Node getNext(){
        return next;
    }

    public Node(){}
    public Node(int key,Node next){
        this.key = key;
        this.next =next;
    }
}
