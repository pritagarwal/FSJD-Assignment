package com.prit.Assignment_2;
import java.util.*;
public class Prog6 {

	public static void main(String[] args) {
       int[]a = {1,3,2};
       int[]b = {3,2};
       
       //sorting both the array
       Arrays.sort(a);
       Arrays.sort(b);
       
       int l1 = a.length;
       int l2 = b.length;
     
       
       if(l1>=l2)
       {
    	  if (checkForSubset(a,b))
    	  {
    		  System.out.println("B is Subset of A");
    	  }
    	  else 
    		  System.out.println("B is Not a Subset of A");
    	   
       }
    	    
       else
       {
     	  if (checkForSubset(b,a))
     	  {
     		  System.out.println("A is Subset of B");
     	  }
     	 else 
   		  System.out.println("A is Not a Subset of B");
     	  
       }
   
	}
	
	public static boolean checkForSubset(int[] a, int[] b) {
		
		int l1 = a.length;
	    int l2 = b.length;
	    
	    int p1=0;//pointer to array a
	    int p2=0;//pointer to array b
	    
	    while(p1<l1 && p2 <l2) 
	    {
	    	if(b[p2] == a[p1])//If both element same increment both pointer
	    	{
	    		p1++;
	    		p2++;
	    	}
	    	else if(b[p2]>a[p1])  //If p2 is greater there is a chance of 
	    		                  //getting in next index in A array
	    	{
	    		p1++;
	    	}
	    	else             //If element of b is smaller than there is no
	    		            //possibility of it to be in a as both array are sorted
	    	{
	    		return false;
	    	}
	    	
	    	
	    }
	    
	    if(p2<l2)       //If still element left in B then its not a subset of A       
		return false;
	   
	    return true; 	
	}
}
