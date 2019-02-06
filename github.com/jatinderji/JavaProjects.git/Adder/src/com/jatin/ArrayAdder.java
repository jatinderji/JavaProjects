package com.jatin;

import java.util.*;

public class ArrayAdder {
	
	public static void main(String[] args) {

		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		int n = sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		sc.close();
	System.out.println("Ans: "+sum);	
	}	
}
