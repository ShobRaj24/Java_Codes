package Shob_RAj;
import java.util.*;
public class fibonacci {
	public static int fibo(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[]args)
	{
		int n,i;
		Scanner ob = new Scanner(System.in);
		System.out.println("ENter the number to obtain sequence:");
		n=ob.nextInt();
		System.out.println("\nFibonacci numbers:\n");
		for(i=0;i<n;i++)
		{
			System.out.print(fibo(i)+"\t");
		}
	}
}
