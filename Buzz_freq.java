package Shob_RAj;

import java.util.*;

interface buzzy {
	public void checkbuzz(int num);
}

interface freq {
	public void checkfreq(int a[]);
}

public class Buzz_freq implements freq, buzzy {
	public void checkbuzz(int num) {
		if (((num % 10) == 7) || (num % 7 == 0)) {
			System.out.println("THe number " + num + " is buzz number");
		} else {
			System.out.println("THe number " + num + " is not buzz number");
		}
	}

	public void checkfreq(int a[]) {
		int i, j;
		int b[] = new int[10];
		for (i = 0; i < a.length - 1; i++) {
			for (j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int p = 0;
		
		do {
			int count = 1;
			int x = a[p];
			for (j = p + 1; j < a.length; j++)
			{
				if (a[p] == a[j]) 
				{
					count++;
				}
			}
			System.out.println(a[p] + ":" + count);
			p++;
			while (p<a.length) {
				if(x==a[p]) {
				p++;
				}else {
					break;
				}
			}
		} while (p < a.length);

	}

	public static void main(String[] args) {
		int num;
		int i;
		int arr[] = new int[10];
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the number to find buzz number:");
		num = ob.nextInt();
		Buzz_freq x = new Buzz_freq();
		x.checkbuzz(num);
		System.out.println("Enter the array numbers:");
		for (i = 0; i < arr.length; i++) {
			arr[i] = ob.nextInt();
		}
		x.checkfreq(arr);

	}

}
/*
 * for(i=0;i<a.length;i++) { b[i]=a[i]; } for(i=0;i<b.length;i++) {
 * for(j=i+1;j<b.length;j++) {
 * 
 * if(i!=j) { if(b[i]==b[j]){ b[j]=p--; count[i]++; }
 * 
 * } }
 * 
 * } for(int l=0;l<a.length;l++) { if(count[l]>0) {
 * System.out.println(a[l]+" frequency is "+ ++count[l]); } }
 */
