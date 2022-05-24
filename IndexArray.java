package com.task;

import java.util.Scanner;

public class IndexArray {

	public static void indexarray(int[] arr) {
		int count = 0,key = 0,value = 0;
		for(int i = 0;i<arr.length;i++) {
			for(int j = 1;j<arr.length;j++) {
				if(arr[j]>arr[i]) {
					if(arr[i] == (arr[j] + 1) || arr[j] == (arr[i] + 1) ){
						
				         key = arr[i];
				         value = arr[j];
				         System.out.println("number of similary pairs possible ("+key+","+value+")");
							count++;
						}
				}
			}
		}
		System.out.println("The total numbers  of pairs :" +count);
	}

	public static void main(String[] args) {

		int size;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Size:");
			size = sc.nextInt();

			int[] arr = new int[size];
			System.out.println("Enter the number:");
			for(int i = 0;i<arr.length;i++) {

				arr[i]=sc.nextInt();

			}
			indexarray(arr);
		}
	}
}
