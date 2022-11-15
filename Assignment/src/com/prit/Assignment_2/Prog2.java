package com.prit.Assignment_2;
import java.util.*;
public class Prog2 {
    public static void main(String[] args) {

        int[] arr = {5,4,9,2,5,1};
        System.out.println("Before sorting :-"+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("After sorting :- "+Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            int p = Part(arr,start,end);
            quickSort(arr,start,p-1);
            quickSort(arr,p+1,end);
        }
    }

    public static int  Part(int[] arr,int start, int end){

        int pivot = arr[start];
        int s = start;
        int e = end;

        while(s<e){

            while(s<=end && arr[s]<=pivot)
                s++;
            while(e>=start && arr[e]>pivot)
                e--;

            if (s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
            }
        }

        int temp = arr[start];
        arr[start] = arr[e];
        arr[e] = temp;
        return e;
    }
}
