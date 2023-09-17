package Shob_RAj;
import java.util.*;
public class Lexico {

	public static void main(String []args)
	{
		String[] name=new String[5];
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the 5 Strings:");
		for(int i=0;i<5;i++)
		{
			name[i]=ob.nextLine();
		}
		System.out.println("Before Sorting:");  
	      for(int i = 0; i < 5; i++) {  
	         System.out.println(name[i]);  
	      }  
		/*   for(int i = 0; i < 4; ++i) {  
		         for (int j = i + 1; j < 5; ++j) {  
		            if (name[i].compareTo(name[j]) > 0) {  
		               String temp = name[i];  
		               name[i] = name[j];  
		               name[j] = temp;  
		            }  
		         }  
		   }*/
	      Arrays.sort(name);
		   System.out.println("\nAfter performing lexicographical order: ");  
		      for(int i = 0; i < 5; i++) {  
		         System.out.println(name[i]);  
		      }  

	}
}
