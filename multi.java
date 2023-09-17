package Shob_RAj;
import java.util.*;
public class multi {
	/**
	 * @param a
	 * @param b
	 * @param n
	 * @param m
	 */
	public static void sum(int a[][],int b[][],int n,int m)
	{
		int c[][]= new int[3][3];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
					c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("After addition the matrix:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println("\n");
			
		}
		
	}
	public static void main(String[] args)
	{
		int a[][]= new int[3][3];
		int b[][]= new int[3][3];
		int i,j,n,m;
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter the no.of ROWS and COLUMNS");
		n=ob.nextInt();
		m=ob.nextInt();
		System.out.println("Enter the elements of 1st matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=ob.nextInt();
			}
		}
		System.out.println("Enter the elements of 2nd matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				b[i][j]=ob.nextInt();
			}
		}
		sum(a,b,n,m);
	}
}
