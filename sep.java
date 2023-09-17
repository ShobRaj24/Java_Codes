package Shob_RAj;
import java.util.*;
public class sep {
	public static void Transpose(int b[][],int m,int n) {
		int c[][]= new int[10][10];
		int i,j;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				c[j][i]=b[i][j];
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
	public static void Separate(int a[])
	{
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
		
	}
	public static void main(String[]args) {
		int a[]= new int[10];
		int b[][]= new int[10][10];
		int i,j,m,n;
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter the elements to separate");
		for(i=0;i<10;i++)
		{
			a[i]=ob.nextInt();
		}
		Separate(a);
		System.out.println("Enter the no of ROWS and COLUMNS of matrix to find Transpose:");
		m=ob.nextInt();
		n=ob.nextInt();
		System.out.println("Enter the matrix to find transpose");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				b[i][j]=ob.nextInt();
			}
		}
		Transpose(b,m,n);
		
	}
	
}
