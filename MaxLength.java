package com.task;

import java.util.Arrays;

public class MaxLength {
	public static void maxlength(int[] arr) {
		int max = 0,key = 0,value = 0;
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0;j<arr.length-1;j++) {
				if(arr[j+1]-arr[i]>=3) {
					if(max<arr[j+1]-arr[i]) {
						max = arr[j+1]-arr[i];
						key = arr[i];
						value = arr[j+1];
					}
				}
			}
		}
		System.out.println("The pair is ("+key+","+value+")" +"\n"+"maximum length of index Jumping is possible "+max );
	}
	public static void main (String[] args) {
		int[] arr = new int[] {4, 5, 7, 3, 10, 2};
		Arrays.sort(arr);
		maxlength(arr);
	}
}
