package com.mec.practice1;

public class Count_Duplicate_Elements {

	public static void main(String[] args) {
	int[]a= {1,2,2,3,3,4,3,4,4,2,1};
	int count=0;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
			count++;
			break;}
		}
		
	}
	System.out.println(count);
	}
	
}
