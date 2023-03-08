package com.java;

public class ArraySum {

	public static void main(String[] args) {
		
int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

int sum=0;

for(int j=0; j<a.length; j++) {
	sum=sum+a[j];
}
System.out.println("Sum of array elements:"+sum);
	}

}
