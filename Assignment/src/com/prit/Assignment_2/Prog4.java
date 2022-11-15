package com.prit.Assignment_2;
//Program for merge sort 
import java.util.Arrays;
public class Prog4 {
    public static void main(String[] args) {

        int[] arr = {5,4,9,2,5,1};
        System.out.println("Before sorting :-"+Arrays.toString(arr));
        mergeSort(arr,0,arr.length);
        System.out.println("After sorting :- "+Arrays.toString(arr));
    }

	public  static void mergeSort(int[] arr, int s, int e) {
		
		if(e-s == 1)
			 return ;
		int mid = s +(e-s)/2;
		
		mergeSort(arr,s,mid);
		mergeSort(arr,mid,e);
		
		merge(arr,s,mid,e);
		
		
	}

	public static void merge(int[] arr, int s, int m, int e) {
		
		int[]mix = new int[e-s];
		int i =s;
		int j =m;
		int k =0;
		
		while(i<m && j<e)
		{
			if(arr[i] <arr[j])
				mix[k++] = arr[i++];
			else
				mix[k++] = arr[j++];
		}
		while(i<m)
			mix[k++] = arr[i++];
		while(j<e)
			mix[k++] = arr[j++];
		
		for(int l =0;l<mix.length;l++)
		{
			arr[s+l] = mix[l];
		}
	}
	

}
