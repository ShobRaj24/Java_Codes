package Shob_RAj;
import java.util.*;
class Transpose
{
	
	int arr[][]= new int[10][10];
	int i,j,m,n;
	Scanner ob = new Scanner(System.in);
	public void func()
	{
		
		
		System.out.println("Enter the no of ROWS and COLUMNS of matrix to find Transpose:");
		m=ob.nextInt();
		n=ob.nextInt();
		System.out.println("Enter the matrix to find transpose");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=ob.nextInt();
				
			}
		}
		System.out.println("Original matrix:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
			
		}
		int c[][]= new int[10][10];
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				c[j][i]=arr[i][j];
			}
		}
		System.out.println("Transpose:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println("\n");
			
		}
	
	}
}
public class Trans extends Transpose
{
	public void func()
	{
		
		int a[]= new int[10];
		System.out.println("Enter the elements to separate");
		for(i=0;i<10;i++)
		{
			a[i]=ob.nextInt();
		}
		int E[]=new int[10];
		int O[]=new int[10];
		int i,p=0,q=0;
		for(i=0;i<10;i++)
		{
			if((a[i]%2)==0)
			{
				E[p++]=a[i];
			}
			else
			{
				O[q++]=a[i];
			}
		}
		System.out.println("Even Numbers:");
		for(i=0;i<p;i++)
		{
			System.out.println(E[i]+" ");
		}
		System.out.println("Odd Numbers:");
		for(i=0;i<q;i++)
		{
			System.out.println(O[i]+" ");
		}
		super.func();
	}

	public static void main(String[]args)
	{
		//Transpose obj1= new Transpose();
		Trans obj2= new Trans();
		//obj1.func();
		obj2.func();
		
	}
}

	


