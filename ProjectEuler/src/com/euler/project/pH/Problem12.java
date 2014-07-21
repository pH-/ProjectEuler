package com.euler.project.pH;

public class Problem12 {
	
	public void getTriangular()
	{
		int count=0;
		int i=0;
		while(count<500)
		{
			++i;
			count = getFactorCount(i*(i+1)/2);
		}
		System.out.println(i*(i+1)/2);
	}
	
	private int getFactorCount(int a)
	{
		int count=1;
		for(int i=1; i<a/i; ++i)
		{
			if(a%i==0)
				count+=2;
		}
		
		return count;
	}

}
