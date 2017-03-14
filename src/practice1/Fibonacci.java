package practice1;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter n");
		int n = sc.nextInt();
		int arr[]= new int[n];
		int n1=0;
		int n2=1;
		int n3=0;
		System.out.print(n1+" " +n2);
		arr[0]=n1; // to check if array satisfies fibonacci
		arr[1]=n2;
		int sum=n1+n2;
		
		for(int i=2;i<n;i++){
			n3=n1+n2;
			sum+=n3;
			System.out.print(" "+n3);
			arr[i]=n3;
			n1=n2;
			n2=n3;
			
		}
		System.out.println("\nsum of fibonacci is "+ sum);
		int arr1[]={0,1,1,2,3,5,8,15,21,34};
		// to check if fibonaacci is valid for given array
		
		for (int i=0; i<arr1.length-2;i++){
			n1=arr1[i];
			n2=arr1[i+1];
			n3=arr1[i+2];
			if(n3==(n1+n2)){
				continue;
			}
			else{
				System.out.println("\nInvalid");
				break;
			}
			
		}
		
		

	}

}
