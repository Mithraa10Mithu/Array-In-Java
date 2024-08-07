package com.mec.practice1;

public class Concat_Arrays {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		int[]b= {7,8,9,0};
		int[]c= new int[a.length+b.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			c[index++]=a[i];
		}
        for(int i=0;i<b.length;i++) {
        	c[index++]=b[i];
        }
        for(int i=0;i<c.length;i++) {
        	System.out.println(c[i]);
        }
	}

}
