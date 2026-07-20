package com.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyLinkedList list=new MyLinkedList();
        list.addlast(10);
        list.addlast(20);
        list.addlast(100);
        list.addfirst(40);
        list.insert(2, 151);
        System.out.println(list);
        System.out.println(list.remove(3));
        System.out.println(list);
    }
}
