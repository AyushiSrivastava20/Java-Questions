package practice1;

import java.util.Scanner;

public class BinnarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size array of numbers");
		int n = sc.nextInt();
		System.out.println("Enter the array of numbers sorted");
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i]= sc.nextInt();	
		}
		
		System.out.println("Enter the number u want to search");
		int val = sc.nextInt();
		int res= binarySearch(val,arr);
		
		if(res==-1)
			System.out.println("Not found");
		else
			System.out.println("Found " + val + " at " +res );
		

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
