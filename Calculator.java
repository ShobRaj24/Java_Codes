package Shob_RAj;
import java.util.*;
public class Calculator 
{
	public static void main(String[] args) 
	{
		int op1,op2;
		char ch;
		double ans=0;
		Scanner ob = new Scanner(System.in);
		while(true)
		{
		System.out.println("1.Addition\n2.Subtracton\n3.Multiplication\n4.Division\n5.Exit\nChoose the opertaion to perform");
		ch= ob.next().charAt(0);
		System.out.println("Enter the operands\n");
		op1=ob.nextInt();
		op2=ob.nextInt();
		switch(ch)
		{
		case '+':ans=op1+op2;
				break;
		case '-':ans=op1-op2;
				break;
		case '*':ans=op1*op2;
				break;
		case '/':ans=op1/op2;
				break;
		case 5 :
			System.exit(0);
		default:System.out.println("Invalid Input");
		
		}
		System.out.println("Result ="+ans);
	}}

}