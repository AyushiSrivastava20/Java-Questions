package practice1;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   // reverse number 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		String s = sc.nextLine();
		Integer val = Integer.parseInt(s);
		System.out.println("Number reversed"+ ReverseS(val));

	}

	private static int ReverseS(Integer val) {
		// TODO Auto-generated method stub
		if (val==0)
			return 0;
		int result=0;
		
		while(val!=0){
			result = result *10;
			result =result + val%10;
			val= val/10;
		}
		
		return result;
		
		
	}

}
