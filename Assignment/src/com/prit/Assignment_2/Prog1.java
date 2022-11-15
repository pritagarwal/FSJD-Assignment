package com.prit.Assignment_2;
import java.util.*;
public class Prog1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
	   
		for(int i=0;i<n;i++) {
			System.out.println("Enter the "+(i+1)+" Value:-");
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<n;i++) {
			if(arr[i] == arr[i-1]) {
				if(list.contains(arr[i])== false)
					 list.add(arr[i]);
				else
					continue;
			}
		}
		if(list.isEmpty())
			System.out.println("There are no such duplicates");
		else
		    System.out.println("The duplicates are :-"+ list);
		
	}

}
