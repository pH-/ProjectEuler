package com.euler.project.pH;

public class Problem14 {
	
	public void getMaxCollatzNum()
	{
//		double p=8;
//		double maxp = 0;
//		double steps =0;
//		while(true)
//		{
//			steps++;
//			if((p-1)%3==0)
//				p = (p-1)/3;
//			else 
//				p*=2;
//			if(p>maxp && p<1000000)
//			{
//				maxp = p;
//				steps = 0;
//			}
//			if(steps==10000)
//				break;
//			System.out.println(p);
//		}
		long maxp = 0;
		long maxsteps = 0;
		for(int i=999999; i>=1; i--)
		{
			long steps = getsteps(i);
			if(steps>maxsteps)
			{
				maxsteps = steps;
				maxp = i;
			}
		}
		System.out.println(maxp);
		System.out.println(maxsteps);
	}
	private long getsteps(long num)
	{
		long steps=0;
		while(num>1)
		{
			if(num%2==0)
				num/=2;
			else
				num = num*3+1;
			steps++;
		}
		return steps;
	}

}
