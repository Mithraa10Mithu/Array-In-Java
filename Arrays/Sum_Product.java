package com.mec.practice1;

public class Sum_Product {

	public static void main(String[] args) {
	int[]a= {2,4,6,8};
	int sum=0;
	int mul=1;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
		mul=mul*a[i];
	}
		System.out.println(sum);
        System.out.println(mul);
	}

}
