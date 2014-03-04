package com.euler.project.pH;

public class Problem2 {
	
	public void sumOfFibonacci()
	{
		int sum=2;
		int fibLimit = 4000000;
		int num1 = 1;
		int num2 = 2;
		int currNum;
		while(true)
		{
			currNum = num1+num2;
			num1    = num2;
			num2    = currNum;
			if(currNum%2==0)
				sum+=currNum;
			if(currNum>=fibLimit)
				break;
		}
		System.out.println(sum);
	}

}
