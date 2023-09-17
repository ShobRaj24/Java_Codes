package Shob_RAj;
import java.util.*;
public class Insertelement {
	public static int[] insert(int arr[],int n,int ele,int pos)
	{
		int i,j;
		int newarr[] = new int[n + 1];
		for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = ele;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
		
	}
	public static void main(String[]args)
	{
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		int n=arr.length;
		int i;
		int ele;
		int pos;
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the element to insert:");
		ele=ob.nextInt();
		System.out.println("Enter the postion to insert element:");
		pos=ob.nextInt();
		System.out.println("Original array:\n");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}

		arr=insert(arr,n,ele,pos);
		System.out.println("\nArray after insertion:\n");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}
