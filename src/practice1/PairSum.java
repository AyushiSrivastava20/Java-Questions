package practice1;

import java.util.Arrays;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {7, 4, 10, -6, -2, 13, 2, 0, 17, 9, 6, 15, -4};
		int tar=13;
		
		Arrays.sort(arr);
		
		int l=0, r=arr.length-1;
		while(l<r){
			if(arr[l]+arr[r]==tar){
				System.out.println("(" +arr[l]+ ","+ arr[r] + ")" );
				l++;
				r--;
			}
			else if (arr[l]+arr[r]<tar)
				l++;
			else
				r--;
				
		}
		
	}

	

}
