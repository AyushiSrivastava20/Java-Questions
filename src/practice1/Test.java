package practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	  public static int singleNumber(int[] nums) {
		     
          int result=nums[0];
          for(int i=1;i<nums.length;i++)
          {
              result= result^nums[i];  
          }
          return result;
      }
	  
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			int [] nums = {1,2,2,3,3};
			
			System.out.println("Number reversed"+ singleNumber(nums));

		}
	    

}
