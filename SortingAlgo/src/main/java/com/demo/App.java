package com.demo;

import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
        int a[]= {5,7,2,3};
        for(int i=0;i<a.length-1;i++) {
        	int small=i;
        	for(int j=i+1;j<a.length;j++) {
        		if(a[small]>a[j]) {
        			small=j;
        		}
        	}
        	int temp=a[i];
        	a[i]=a[small];
        	a[small]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
