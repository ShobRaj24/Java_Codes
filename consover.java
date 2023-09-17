package Shob_RAj;
import java.util.*;
public class consover {
	int[] arr;
	public consover(int arr[])
	{
		this.arr=arr;
		System.out.println("Negative Elements:");
        for (int num : arr) {
            if (num < 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
	}
	public consover(int arr[],int n)
	{
		float sum=0;
		float avg=0;
		int i;
		this.arr=arr;
		for(i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		avg=sum/(n);
		System.out.println("Sum="+sum);
		System.out.println("Average="+avg);
	}
	public static void main(String[]args)
	{
		int arr[]= {12,10,15,8,24,-5,-78,28,19,16,-8,74,-23};
		int n;
		n=arr.length;
		consover obj1=new consover(arr);
		consover obj2=new consover(arr,n);
		
	}
}
