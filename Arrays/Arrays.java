package com.mec.practice1;

public class Arrays {

	public static void main(String[] args) {
		int[]a= {2,5,6,7,8,9};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
			count++;
		}
		System.out.println(count);

	}

}
