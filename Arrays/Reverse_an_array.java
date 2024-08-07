package com.mec.practice1;
import java.util.Arrays;
public class Reverse_an_array {

	public static void main(String[] args) {
		String s="java is easy";
		String s2="";
		for(int i= s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
     System.out.println(s);
     System.out.println(s2);
	}

}
