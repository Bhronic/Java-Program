package com.abc;
/** This class is a user-defined class that contains one methods cube.*/
public class StaticMethodeExmple{

	/** The cube method prints cube of the given number */
	public static int  cube(int n){System.out.println(n*n*n);
			return n*n*n;
	}

	public static void main(String args[]){
		System.out.println(" cube : "+cube(6));
	}
}