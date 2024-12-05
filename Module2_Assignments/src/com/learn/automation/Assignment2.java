package com.learn.automation;
import java.util.ArrayList;
import java.util.Arrays;



public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		////Arrays
		int[] array = {1,2,3,4,8,9,14};		
		SumOfValuesOfanArray(array);
		AverageOfValuesOfanArray(array);
		PrintOddEvenNumberinArray(array);
		FindMissingNumberFromArray(array);
		FindGreatestSmallestinArray(array);
		FindDuplicateElementsinArray();
		
		//// Two Dimensional Arrays
		AverageScoreOfTwoStudents();
		AddTwoMatricesUsing2DimensionalArray();
		 
		
		////Strings
		CompareTwoStringsIgnoreCase();
		ConcatenateTwoStrings();
		GetTheLengthOfString();
		SubstingOfStringAtGivenPositions();
		ConvertAllCharactersInStringToUPPERCASE();
		ConvertAllCharactersInStringTolowercase();
		ReverseStringUsingStringBuilder();
		ReverseStringUsingLoop();
		CountCharOccurrenceInString();
		CountWordsInSentence();
		ConvertIntegerToString();
		ConvertStringToInteger();
		RemoveWhiteSpacesInString();
		IsStringPalindrome("level");
		
	}
	
	//Arrays
	private static void SumOfValuesOfanArray(int[] arr)
	{
		int sum =0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Sum of array elements is = "+sum);
	}
	
	private static void AverageOfValuesOfanArray(int[] arr)
	{
		double  sum =0;
		int noOfElements = arr.length;
		double  average;
		for(int i=0;i<noOfElements;i++)
		{
			sum+=arr[i];
		}
		average = sum/noOfElements;
		System.out.println("Average of array elements is = "+ average);
		//System.out.format("The average is: %.3f", average);
	}
	
	private static void PrintOddEvenNumberinArray(int[] arr)
	{		
		int noOfElements = arr.length;
		
		ArrayList<String> arrOddNumbers = new ArrayList<String>();
		ArrayList<String> arrEvenNumbers = new ArrayList<String>();
		 
				
		
		for(int i=0;i<noOfElements;i++){
			if((arr[i]%2)==0){
				arrEvenNumbers.add(String.valueOf(arr[i])); 
			}
			else {
				arrOddNumbers.add(String.valueOf(arr[i])); 
			}	
			
		}		
	
		System.out.println("Even Numbers are: ");
		for(String s: arrEvenNumbers )
		{	
			System.out.println(s);
		}
		System.out.println("Odd Numbers are: ");
		for(String s: arrOddNumbers )
		{	
			System.out.println(s);
		}
		
	}

	private static void FindMissingNumberFromArray(int[] arr)
	{			
		int arr_new[] = new int[arr.length-1];			
		int j=3;
		 
		//Remove the element at index 3
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
         
        
        //Find the missing element from array        
        for(int i=0; i<arr.length;i++)  
        {
        	boolean found = false;
        	for(int k=0;k<arr_new.length;k++)        	
        	{        		
        		if(arr[i]==arr_new[k])
        		{    
        			found = true;
        			continue; 			  			
        		}        		
        	}        	        	
        	if(!found)
        		System.out.println("Missing number is: "+arr[i]);       		       	
        }		
	}

	private static void FindGreatestSmallestinArray(int[] arr) 
	{		
		Arrays.sort(arr);		
		System.out.println("The smallest number in array is: " + arr[0]);
		System.out.println("The greatest number in array is: " + arr[arr.length-1]);
	}

	private static void FindDuplicateElementsinArray() 
	{
		int[] arr = {1,2,3,3,4,8,8,9,14};
		Arrays.sort(arr);			
		int current =0;
		int next = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			current=arr[i];			
			next=arr[i+1];
			
			if(current==next)
			{
				System.out.println("The duplicates in array are: " + arr[i]);
			}	
		}		
	}

	//Two Dimensional Arrays
	private static void AverageScoreOfTwoStudents()
	{
		int[][] mdArray = {
						   {76,78,88},
						   {86,99,78}		
						  };
		int rows = mdArray.length;
		int sum = 0;
		for(int i=0;i<rows;i++)
		{
			int cols = mdArray[i].length;
			for(int j=0;j<cols;j++)
			{
				sum += mdArray[i][j];
			}		
			System.out.println("Average score of Student "+(i+1)+" is: "+ sum/3);
			sum = 0;
		}	
	}

	private static void AddTwoMatricesUsing2DimensionalArray()
	{
		int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
	}

	//Strings
	private static void CompareTwoStringsIgnoreCase()
	{
		String one = "THIS IS STRING ONE";
		String two = "this is string one";
		if(one.compareToIgnoreCase(two)==0)		
			System.out.println("String one and two are equal ignoring case");
		else
			System.out.println("String one and two are not equal ignoring case");
	}
	
	private static void ConcatenateTwoStrings()
	{
		String one = "Hello, ";
		String two = "Welcome to Java course.";		 	
		System.out.println(one.concat(two));
		 
	}
	
	private static void GetTheLengthOfString()
	{
		String one = "Hello, How are you doing today?";				 	
		System.out.println("The number of character in string one is: "+one.length());		 
	}
	
	private static void SubstingOfStringAtGivenPositions()
	{
		String one = "Hello, How are you doing today?";				 	
		System.out.println("The substing of a string at 2 positions is: " + one.substring(7, 18));		 
	}
	
	private static void ConvertAllCharactersInStringToUPPERCASE()
	{
		String one = "Hello, How are you doing today?";				 	
		System.out.println("Converted to uppercase: " + one.toUpperCase());		 
	}
	
	private static void ConvertAllCharactersInStringTolowercase()
	{
		String one = "Hello, How are you doing today?";				 	
		System.out.println("Converted to uppercase: " + one.toLowerCase());		 
	}
	
	private static void ReverseStringUsingStringBuilder()
	{
		String s = "Hello, How are you doing today?";		
		System.out.println("Reverse of string using StringBuilder() :   "+ new StringBuilder().append(s).reverse());
	}
	
	private static void ReverseStringUsingLoop()
	{
		String s = "Hello, How are you doing today?";	
		int sLength = s.length();
		char[] arr = s.toCharArray();
		String ss = "";
		for(int i= sLength-1; i>=0;i--)
		{			
			ss += arr[i];			
		}
		System.out.println("Reverse of string using Loop :   " + ss);
	}	
	
	private static void CountCharOccurrenceInString()
	{
		String str = "Hello, How are you doing";
		char c = 'H';
		int count = 0;
	    
	    for(int i=0; i < str.length(); i++)
	    {    if(str.charAt(i) == c)
	            count++;
	    }	    
	    System.out.println("Character H is present : " + count + " times in string");		
	}
	
	private static void CountWordsInSentence()
	{
		String str = "Hello, How are you doing";
		int countWords = str.split("\\s").length;		
	    System.out.println("Number of words in sentence: " + countWords);		
	}
	
	private static void ConvertIntegerToString()
	{
		int numb1 = 123213;
		System.out.println("Interger converted to sting using Integer.toString(numb1): "+Integer.toString(numb1));	
	}
	
	private static void ConvertStringToInteger()
	{
		String str = "254";
		System.out.println("String converted to integer using Integer.parseInt(str): "+ Integer.parseInt(str));	
	}
	
	private static void RemoveWhiteSpacesInString()
	{
		String str = "Hello how are you doing?";
		System.out.println("White spaces removed from String: "+ str.replaceAll("\\s+",""));	
	}
	
	private static void IsStringPalindrome(String s)
	{
		// Convert string to lowercase for 
        // case-insensitive comparison
		
        s = s.toLowerCase();

        // Reverse the string
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        // Compare the original string with 
        // the reversed string
        if(s.equals(rev))
        	System.out.println("String "+s+" is Palindrome.");
        else
        	System.out.println("String "+s+" is not a Palindrome.");
	}
	
}
