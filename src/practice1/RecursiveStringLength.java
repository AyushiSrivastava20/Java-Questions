package practice1;

import java.util.*;

public class RecursiveStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to find the length of string recursively
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = sc.nextLine();
		System.out.println("length is "+StringLen1(s));
		

	}
	
	public static  int StringLen1(String s){
		
		if(s==null)
			return 0;
		else
			return StringLen1(s.substring(1)) +1;
		
		
		
	}

}
