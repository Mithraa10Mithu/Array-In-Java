package com.mec.practice1;

public class Sum_Average {

	public static void main(String[] args) {
	int[]b= {10,20,30,40,50,60};
	int sum=0;
	int avg=0;
	for(int i=0;i<b.length;i++) {
		sum+=b[i];
		avg=sum/b.length;
	}
    System.out.println(sum);
    System.out.println(avg);
	}

}
