package com.demo;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Collection<Object> c=new ArrayList<>();
       c.add(20);
       c.add(10);
       c.add(5);
       Collection<Object> a=new ArrayList<>();
       a.add(20);
       a.add("Pratik");
       a.add("Hemant");
       a.add(null);
       System.out.println(c.contains(10));
       System.out.println(c.remove(10));
       System.out.println(c);
       System.out.println(c.addAll(a));
       System.out.println(c.iterator());
    }
}
