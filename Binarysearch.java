package Shob_RAj;
import java.util.*;
public class Binarysearch {
	public static void binary(int arr[],int low,int high,int search)
	{
		int mid;
		mid=(low+high)/2;
		if(arr[mid]==search)
		{
			System.out.println("Element found at position :"+ ++mid);
		}
		else if(arr[mid]>search) {
			binary(arr,low,mid-1,search);
		}
		else
		{
			binary(arr,mid+1,high,search);
		}
	}
	public static void main(String[]args)
	{
		int arr[]= {10,15,18,23,36,46,70,89,93,99};
		int n;
		int search=89
				;
		n=arr.length;
		binary(arr,0,n-1,search);
	}
}
