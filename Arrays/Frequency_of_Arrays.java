package com.mec.practice1;

import java.util.ArrayList;
import java.util.List;

public class Frequency_of_Arrays {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();// list l will store integer data
		int[]a= {1,1,2,3,4,5,2,1};
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			
			
			if(l.indexOf(a[i]) !=-1) continue;
			else l.add(a[i]);
			
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {
					count++;
					l.add(a[i]);
				}
			}
			System.out.println(a[i]+" "+count);
		}
	}

}
