package Shob_RAj;
import java.util.*;
public class Findprime {
	public static void prime(int a[],int n)
	{
		int i,p;
		p=0;
		int pr[]=new int[20];
		int count=0;
		for(i=0;i<n;i++) 
		{
			if(a[i]>1)
			{
				int m=a[i];
				for(int j=2;j<m;j++)
				{
					if((a[i]%j)==0)
					{
						count=1;
					}
					
				}
				if(count!=1)
				{
				
					pr[p++]=a[i];
				}

			}

		}
		System.out.println("Array Numbers:");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println("\nprime numbers:");
		for(i=0;i<p;i++)
		{
			System.out.print(pr[i]+"\t");
		}
	}
	public static void main(String[]args)
	{
		int arr[]= {2,3,10,37,17,15,16,18,19,75,77,89,88,93,96,100};
		int n;
		n=arr.length;
		prime(arr,n);
	}
}
