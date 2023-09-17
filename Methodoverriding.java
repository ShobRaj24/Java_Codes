package Shob_RAj;


import java.util.Scanner;

class Number {
    
    public boolean isAutomorphic(int number) {
        int square = number * number;
        
        String numberStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        
        return squareStr.endsWith(numberStr);
    }
    
    public void Fibonacci(int limit) {
        int num1 = 0, num2 = 1;
        
        System.out.print("Fibonacci Series up to " + limit + ": ");
        System.out.print(num1 + " " + num2 + " ");
        
        while (num2 < limit) {
            int nextNum = num1 + num2;
            System.out.print(nextNum + " ");
            
            num1 = num2;
            num2 = nextNum;
        }
        
        System.out.println();
    }
}

public class Methodoverriding {
    
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        Number x = new Number();
        
        System.out.print("Enter a number to check automorphic number: ");
        int number = ob.nextInt();
        
        if (x.isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
        
        System.out.print("\nEnter the limit to print Fibonacci series: ");
        int limit = ob.nextInt();
        
        x.Fibonacci(limit);
    }
}
