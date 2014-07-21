package com.euler.project.pH;

public class Problem7 {
	public void getnthprime()
	{
		long limit = getLimit(10001);
		System.out.println(limit);
		int[] primes = new int[10001];
		int[] nums   = new int[(int)limit];
		int p=0;
		for(int i=2; i<limit; ++i )
		{
			nums[i]=1;
		}
		for(int i=2; i<limit; ++i)
		{
			if(nums[i]==1 && p<10001)
			{
				primes[p++]=i;
				for(int j=2*i;i<limit/i && j<limit; j=j+i)
				{
					nums[j]=0;
				}
			}
		}
		System.out.println(primes[10000]);
	}
	private long getLimit(int numPrimes)
	{
		long i=2;
		while(true)
		{
			if(((i*Math.log(2))/Math.log(i))>=numPrimes)
				return i;
			++i;
		}
	}
}
