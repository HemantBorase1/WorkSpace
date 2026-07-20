package com.DSA;



public class App 
{
    public static void main( String[] args )
    {
        MyCircularLinkedList l=new MyCircularLinkedList();
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.addLast(40);
       
       
        System.out.println(l.first());
        System.out.println(l.last());
        System.out.println(l);
        l.insert(2, 100);
        System.out.println(l);
    }
}
