package Shob_RAj;
import java.util.*;
public class Palindrome {
	public int n;
	public Palindrome(int n) {
		this.n=n;
		if(pali())
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not palindrome");
		}
		
	}
	public boolean pali() {
		int orginalnum=n;
		int reversednum=0;
		while(orginalnum!=0)
		{
			int rem=orginalnum%10;
			reversednum=reversednum*10+rem;
			orginalnum/=10;
		}
		return n==reversednum;
	}
	public static void main(String[]args) {
		int n;
		Scanner ob = new Scanner(System.in);
		while(true) {
		System.out.println("Enter the number:");
		n=ob.nextInt();
		Palindrome obj= new Palindrome(n);
		}
	}
}
