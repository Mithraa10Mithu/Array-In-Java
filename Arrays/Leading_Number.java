package com.mec.practice1;

public class Leading_Number {

	public static void main(String[] args) {
		int[]a= {2,5,6,3,9,4,7};
		int count=0;
		for(int i=1;i<a.length-2;i++) {
			for(int j=i-1;j<a.length;j++) {
				if(a[i]>a[j])
					count++;
			}
		}
		System.out.println(count);
	}

}
