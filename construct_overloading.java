package Shob_RAj;
import java.util.*;
class sort{
	public sort(int arr[],int n)
	{
		this(arr);
	     int i,j;   
        for (i = 0; i < n - 1; i++)
        {
            for (j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
	   }
        
        
	}
	public sort(int arr[])
	{
	
		int E[]=new int[10];
		int O[]=new int[10];
		int i,p=0,q=0;
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]%2)==0)
			{
				E[p++]=arr[i];
			}
			else
			{
				O[q++]=arr[i];
			}
		}
		System.out.println("\nOdd Numbers:");
		for(i=0;i<q;i++)
		{
			System.out.println(O[i]+" ");
		}
		
	}
}
public class construct_overloading {

	public static void main(String[]args)
	{
		int arr[]= {20,15,17,2,39,60,50,32};
		int i ;
		int n = arr.length;

		System.out.println("Before sorting");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		sort ob = new sort(arr,n);
		System.out.println("\nAfter sorting");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		
	}
}
