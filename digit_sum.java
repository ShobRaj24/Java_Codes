package Shob_RAj;

import java.util.Scanner;

public class digit_sum {
	static int count=0;
	public static void sum(int n) {
		int sum=0;
		int rem=0;
		int temp=n;
		while(temp!=0) {
			rem=temp%10;
			sum+=rem;
			temp=temp/10;
		}
		
		if(sum>10) {
			count(sum);
			sum(sum);
		}
		else {
			count(sum);
			System.out.println(" Final Answer="+sum);
		}
		
	}
	public static void count(int sum) {
		count++;
		System.out.println("step"+count+":"+sum);
	}
	public static void main(String[]args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the two digit number");
		int n =ob.nextInt();
		sum(n);
		
	}
}
