package com.task;



import java.util.ArrayList;
import java.util.Scanner;

public class SubArray {
	
	public static void subarray(int[] arr,ArrayList<Integer> al) {
		
		
		
		
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size: ");
			int n = sc.nextInt();
			if(n<2) {
				System.out.println("Array length should be greater than 2: "+n);
			}
			int[] arr = new int[n];
			System.out.println("Enter the Elements: ");
			for(int i = 0;i<arr.length;i++) {
				
				arr[i]=sc.nextInt();
				//System.out.println(arr[i]);
			}
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(int i = 1; i<100;i++) {
				int sum = i*i;
				al.add(sum);
				System.out.println(sum);
			}
		subarray(arr,al);
		}
	}

}
