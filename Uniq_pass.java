package Shob_RAj;
import java.util.*;
public class Uniq_pass{
	public void Uniq() {
		String name;
		double phno;
		int rno;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name: ");
		name=scan.nextLine();
		System.out.println("Enter your mobile number: ");
		phno=scan.nextDouble();
		System.out.println("Enter your room number: ");
		rno=scan.nextInt();
		char sym[]= {'!','@','#','$','&','*','?','/',']'};
		String password;
		int sum=0;
		int temp=rno;
		int c;
		do {
			int rem=temp%10;
			temp=temp/10;
			sum+=rem;
		}while(temp!=0);
		//if(sum<10)
			//sum=sum+10;
		int len=name.length();
		if(len<10)
		{
		c=len;
		}
		else
		{
		c=len%10;
		}
		int last=(int)phno%10;
		password=""+name.charAt(0)+last+sum+sym[c]+name.charAt(name.length()-1);
		System.out.println("Password is "+password);
	}
	public static void main(String[] args) {
		Uniq_pass obj=new Uniq_pass();
		obj.Uniq();
	}
}
