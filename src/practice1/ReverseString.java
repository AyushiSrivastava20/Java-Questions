package practice1;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s = sc.nextLine();
		char[] inp = s.toCharArray();
		reverse(inp);

	}
	
	public static char[] reverse(char[] inp){
		for(int i=0, j = inp.length-1; i<inp.length/2; i++, j--){
			char c = inp[i];
			inp[i]=inp[j];
			inp[j]=c;	
			
		}
		System.out.println(inp);
		return inp;
		
		
	}

}
