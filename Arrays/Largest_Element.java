package com.mec.practice1;

public class Largest_Element {

	public static void main(String[] args) {
		int[]j= {1,2,3,4,5,6};
		int max=j[0];
		for(int i=1;i<j.length;i++)
		{
			if(max<j[i])
				max=j[i];
		}
       System.out.println(max);
	}

}
