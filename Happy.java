package Shob_RAj;

import java.util.*;

interface A {
	interface B {
		public void checkhappy();
	}
}

public class Happy implements A {
	public void checkhappy() {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter an +ve and non zero ele");
		num = scan.nextInt();
		int temp = num, rem, sum = 0;
		do {
			while (temp != 0) {
				rem = temp % 10;
				sum = sum + (rem * rem);
				temp = temp / 10;
			}
			temp = sum;
			sum = 0;
		} while (temp > 9);
		if (temp == 1) {
			System.out.println(num + "is happy number");
		} else {
			System.out.println(num + "is not a happy number");
		}
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Happy obj = new Happy();
		obj.checkhappy();
	}
}
