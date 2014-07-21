package com.euler.project.pH;

public class Problem21 {
	
	public void getAmicableSum()
	{
		long[] factorSums = new long[10001];
		long amicableSum = 0;
		for(int i=1; i<10001; ++i) {
			factorSums[i] = factorSum(i);
		}
		System.out.println(factorSums[284]);
		for(int i=1; i<10001; ++i) {
			if(factorSums[i]>i && factorSums[i]<10001 && factorSums[(int) factorSums[i]]==i) {
				amicableSum+=i;
				amicableSum+=factorSums[i];
			}
		}
		System.out.println(amicableSum);
	}
	private long factorSum(int n)
	{
		long res = 0;
		for(long i=2; i<n/i; i++) {
			if(n%i==0) {
				res+=i;
				res+=n/i;
				if(n==284)
					System.out.println(i);
			}
		}
		res+=1;
		return res;
	}
}
