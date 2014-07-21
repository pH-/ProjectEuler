package com.euler.project.pH;

public class Problem9 {
	
	public void getPythagoreanTriplet()
	{
		for(int i=1; i<=1000; ++i)
		{
			for(int j=1; j<=1000; ++j)
			{
				int k = 1000-(i+j);
				if(k>0 && i*i+j*j == k*k)
				{
					System.out.println(i*j*k);
					return;
				}
				
					
			}
		}
	}

}
