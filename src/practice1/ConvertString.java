package practice1;
import java.util.*;

public class ConvertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();
		if(s==null || s.isEmpty()){
			System.out.println("string cant be empty");
			
		}
			
		double ls =0.0;
		
		if(s.contains(" ") & s.contains("/")){
			String [] inp = s.split(" ");
			String [] deno = inp[1].split("/");
			double frac= Double.parseDouble(deno[0]) / Double.parseDouble(deno[1]);
			ls = Double.parseDouble(inp[0])+ frac;
			
		}
		else if(s.contains("/")){
			String [] inp = s.split("/");
			ls = Double.parseDouble(inp[0]) / Double.parseDouble(inp[1]);
			
		}
		
		else{
		ls= Double.parseDouble(s);
		}
		
		System.out.println(ls);
		

	}

}
