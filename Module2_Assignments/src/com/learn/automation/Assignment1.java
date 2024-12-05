package com.learn.automation;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintName();
		SumOfTwoNumbers(4,36);
		SwapTwoNumbers(10,20);
		PositiveNegative();
		GreatestOfThreeNumbers();
		NumberOfDaysInMonth();
		FindLeapYear();
		ShowMultiplicationTableOfNumber();
		CountTheNumberOfDigitsOfNumberUsingWhileLoop();
		ReverseTheNumberUsingWhileLoop();
		IsNumberPalindromeUsingWhileLoop();
		IsNumberPalindromeUsingRecursion();
		FindFactorialOfANumberUsingForLoop();
		FindFibonacciSeries();
	}
	
	private static void PrintName()
	{
		System.out.println("Hello");
		System.out.println("Aman");
	}
	
	private static void SumOfTwoNumbers(int a, int b)	
	{
		int sum = a + b;
		System.out.println("Expected Output:" + sum);
		
	}
	
	private static void SwapTwoNumbers(int a, int b)
	{
		int z = a;
		a = b;
		b = z;	 
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
	
	private static void PositiveNegative()
	{
	    Scanner scanner=new Scanner(System.in);  
	    System.out.println("Enter a positive or negative number: ");  
	    int num1 = scanner.nextInt();  
	    if (num1 > 0) {
	    	System.out.println("Number is positive number: " + num1); 
	    } else if (num1 < 0) {
	    	System.out.println("Number is negative number: " + num1); 
	    }
	    else {
	    	System.out.println("Number is Zero: " + num1);
	    }
	   //scanner.close();
	    
	}
	
	private static void GreatestOfThreeNumbers()
	{
	    Scanner sc=new Scanner(System.in);  
	    
	    System.out.println("Enter number1 to find greatest of 3: ");  
	    int numb1 = sc.nextInt();	    
	    
	    System.out.println("Enter number2 to find greatest of 3: ");  
	    int numb2 = sc.nextInt();  
	    
	    System.out.println("Enter number3 to find greatest of 3: ");  
	    int numb3 = sc.nextInt();  
	    
	    if ((numb1 > numb2) &&(numb1 > numb3)) {
	    	System.out.println("Number1 is greatest: ");  	    	
	    } else if ((numb2 > numb1) && (numb2 > numb3)) {
	    	System.out.println("Number2 is greatest: ");
	    }
	    else {
	    	System.out.println("Number3 is greatest: ");
	    }
	    	
	    //sc.close();
	}
	
	private static void NumberOfDaysInMonth()
	{
		System.out.println("Enter month [1-12] to find No. of days: ");
		Scanner scn = new Scanner(System.in);		
		int month = scn.nextInt();
		switch(month){
		case 1:
			System.out.println("Number of days in month "+ month +" are 31");
			break;
		case 2:
			System.out.println("Number of days in month "+ month +" are 28");
			break;
		case 3:
			System.out.println("Number of days in month "+ month +" are 31");
			break;
		case 4:
			System.out.println("Number of days in month "+ month +" are 30");
			break;
		case 5:
			System.out.println("Number of days in month "+ month +" are 31");
			break;
		case 6:
			System.out.println("Number of days in month "+ month +" are 30");
			break;
		case 7:
			System.out.println("Number of days in month "+ month +" are 31");
			break;
		case 8:
			System.out.println("Number of days in month "+ month +" are 31");
			break;
		case 9:
			System.out.println("Number of days in month "+ month +" are 30");
			break;
		case 10:
			System.out.println("Number of days in month "+ month +" are 31");
			break;
		case 11:
			System.out.println("Number of days in month "+ month +" are 30");
			break;
		case 12:
			System.out.println("Number of days in month "+ month +" are 31");
			break;
		default:
			System.out.println("Invalid month, please use 1 to 12");		
			
		}
	}
	
	private static void FindLeapYear()
	{
		System.out.println("Enter year [yyyy] to find leap year: ");
		Scanner scn = new Scanner(System.in);		
		int year = scn.nextInt();
		int remainder = year % 4;
		if(remainder == 0)
			System.out.println("Leap year");
		else
			System.out.println("Not a leap year");
			
	}
	
	private static void ShowMultiplicationTableOfNumber()
	{
		System.out.println("Enter a Number to multiply");
		Scanner scn = new Scanner(System.in);		
		int number1 = scn.nextInt();
		System.out.println("Enter times to see multiplication table");
		int times = scn.nextInt();
				
		for(int i=0; i<=times;i++)
		{
			System.out.println(number1 + "x" + i + " = " + number1 * i);
		}
	}
	
	//Count the number of digits of the number using while loop.
	private static void CountTheNumberOfDigitsOfNumberUsingWhileLoop()
	{
		System.out.println("Enter a Number to count digits using while: ");
		Scanner scn = new Scanner(System.in);		
		int number1 = scn.nextInt();
		
		//declare a variable to count number of digits
		int digit = 0;
		while(number1 != 0)
		{
			//pick last digit of the number and count one by one
			int pick_last = number1 % 10;
			digit++;
			number1 = number1 / 10;
		}

		//display number of digits
		System.out.print("Number of Digits = "+ digit);
		 
	}
	
	//Reverse the number using while loop.
	private static void ReverseTheNumberUsingWhileLoop()
	{
		int m, n, sum = 0;		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number to Revers it using while loop: ");
		int number1 = scn.nextInt();
			
		while(number1 > 0)
		{
			n = number1 % 10;
			sum = sum * 10 + n;
			number1 = number1 / 10;
		}

		//display number of digits
		System.out.print("Number of Digits = "+ sum);
			 
	}
	
	//Find if the number is Palindrome using while loop.
	private static void IsNumberPalindromeUsingWhileLoop()
	{
		int n, m, rev = 0, x;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number to find palindrome using while: ");
		n = s.nextInt();
		m = n;
		while(n > 0)
		{
			x = n % 10;
			rev = rev * 10 + x;
			n = n / 10;
		}
		if(rev == m)
		{
			System.out.println(" "+m+" is a palindrome number");
		}
		else
		{
			System.out.println(" "+m+" is not a palindrome number");
		}
			 
	}

	private static void IsNumberPalindromeUsingRecursion()
	{
		int num, reverse = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to find palindrome using recursion: ");
            num = s.nextInt();
        if (isPalindrome(num, reverse) == num)
            System.out.println (num + " is a Palindrome");
        else
            System.out.println (num + " is not a Palindrome");
	}
	
	//Recursive method to call itself until the condition is true
	private static int isPalindrome(int num, int rev)
    {
        if(num == 0)
            return rev;
            int rem = num % 10;
            rev = rev * 10 + rem;
            return isPalindrome(num / 10, rev);
    }

	private static void FindFactorialOfANumberUsingForLoop()
	{
		int n, fact = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number to find Factorial using For loop: ");
        n = s.nextInt();
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is "+fact);		
	}
	
	//Question what does range 1 - 50 means here?
	private static void FindFibonacciSeries()
	{
		int n, a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n to print fibonacci series: ");        
        n = s.nextInt();
                       	
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            if(a<=50)
            	System.out.print(a+" ");
            else
            	break;
            
        }      
	}
	
	
}


