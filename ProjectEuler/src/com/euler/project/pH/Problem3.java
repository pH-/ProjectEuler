package com.euler.project.pH;

public class Problem3 {
	
	public void primeFactor()
	{
		long limit = 600851475143l;
		long n = limit;
		long max = 0l;
		for(long i=3; i<limit/i; i=i+2)
		{
			while(n%i==0)
			{
				max = i;
				n = n/i;
			}
		}
		System.out.println(n);
		System.out.println(max);
	}
}
