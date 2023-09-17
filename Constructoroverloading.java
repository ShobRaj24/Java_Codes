package Shob_RAj;
import java.util.*;
public class Constructoroverloading
{
    public Constructoroverloading(int a[],int ele,int n){
      int i;
      int pos=-1;
      for(i=0;i<n;i++)
      {
          if(a[i]==ele)
          {
              pos=i+1;
              System.out.println("Element found at "+pos);
          }
          
          
      }
      if(pos<0)
    	  System.out.println("Element not found ");
      
      
    }
    public Constructoroverloading(int year){
    	if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
    	{
    		System.out.println(year+" is a leap year");
    	}
    	else {
    		System.out.println(year+" is not a leap year");
    	}

    }
	public static void main(String[] args) {
	      int arr[]={10,20,30,40,50,60,45,76,89,18,99};
	      int ele;
	      int n;
	      int year;
	      Scanner ob=new Scanner(System.in);
	      System.out.println("Enter the searching element:");
	      ele=ob.nextInt();
	      n=arr.length;
	      Constructoroverloading obj1= new Constructoroverloading(arr,ele,n);
	      System.out.println("Enter the year:");
	      year=ob.nextInt();
	      
	      Constructoroverloading obj2= new Constructoroverloading(year);
}
}