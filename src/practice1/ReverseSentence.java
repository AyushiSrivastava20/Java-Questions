package practice1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter line");
		String s = sc.nextLine();
		System.out.println(s);
		String[] inp = s.split(" ");
		
		
		for(int i=0, j=inp.length-1; i<inp.length/2; i++, j--){
			
			char[] str = inp[i].toCharArray();
			char[] str1= reverse(str);
			inp[i] = new String(str1);
			
			char[] strq = inp[j].toCharArray();
			char[] strq1= reverse(strq);
			inp[j] = new String(strq1);
			
			String c = inp[j];
			inp[j]=inp[i];
			inp[i]=c;
			
		}
		
		
		System.out.println(Arrays.toString(inp).toString());
		

	}
	
	public static char[] reverse(char[] inp){
		for(int i=0, j = inp.length-1; i<inp.length/2; i++, j--){
			char c = inp[i];
			inp[i]=inp[j];
			inp[j]=c;	
			
		}
		
		return inp;
		
		
	}

}
