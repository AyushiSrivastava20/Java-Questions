package practice1;

import java.util.HashSet;

public class FirstDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,5,6,3,2,9,0};
		System.out.println("First duplicate"+findDuplicate(arr));
		

	}

	public static int findDuplicate(int[] arr) {
		// TODO Auto-generated method stub
		
		int min=-1;
		HashSet<Integer> result = new HashSet<>();
		
		for (int i =0;i<arr.length;i++){
			if (result.contains(arr[i]))
				min=arr[i];
			else
				result.add(arr[i]);
		}
		
		return min;
				
				
	}

}
