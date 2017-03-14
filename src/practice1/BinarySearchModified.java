package practice1;

import java.util.Scanner;

public class BinarySearchModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,5,8,10,12,15,18,25,33};
		
		int thrs= 12;
		int res= binarySearch(thrs,arr);
		double median=0.0;
		if(res==-1)
			System.out.println("Threshold not found in array");
		else
		{
			System.out.println("Threshold at" + res);
			int res1[]=new int[arr.length-res];
			for(int i =res,j=0;i<arr.length;i++,j++){
				res1[j]=arr[i]; 
				
			}
				int middle=res1.length/2;
				
				if(res1.length%2==1)
					median=res1[middle];
				else
					median=(res1[middle-1]+res1[middle])/2;
				
			
		}
		
		System.out.println("median is"+ median);
		

	}

	private static int binarySearch(int val, int arr[]) {
		int l=0;
		int r=arr.length-1;
		
		while(l<=r){
			int m=l+(r-l)/2;
			
			if(arr[m]== val)
				return m;
			
			if (arr[m]<val)
				l=m+1;
			
			else
				r=m-1;	
		}
		
		return -1;
		
		
	}

}
