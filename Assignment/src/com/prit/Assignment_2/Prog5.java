package com.prit.Assignment_2;
import java.util.*;
public class Prog5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+" value :-");
			arr[i] = sc.nextInt();
		}
		System.out.println("Array before sorting :- "+Arrays.toString(arr));
		
		int t=0;
		int min = 0;
		
		for(int i=0;i<n-1;i++) {
			min = i;
			for(int j =i+1;j<n;j++) {
				if(arr[min]>arr[j])
					min = j;
			}
			t = arr[i];
			arr[i] = arr[min];
			arr[min] = t;
		}
		System.out.println("Array after sorting :-  "+Arrays.toString(arr));
		
	}
}
