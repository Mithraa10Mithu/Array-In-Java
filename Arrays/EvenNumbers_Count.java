package com.mec.practice1;

public class EvenNumbers_Count {

	public static void main(String[] args) {
		int[]a= {123,234,345,456,567,678};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				count++;
		}
      System.out.println(count);
	}

}
