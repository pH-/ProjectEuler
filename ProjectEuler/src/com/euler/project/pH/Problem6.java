package com.euler.project.pH;

public class Problem6 {
	
	public void getDiff()
	{
		//(a+b+c+...)^2 = a^2+b^2+...+2ab+2ac+2ad...+2bc+2bd+....
		long sum = 0;
		for(int i=1; i<100; ++i)
		{
			for(int j=i+1; j<=100; ++j)
			{
//				System.out.println("i:"+i+", j:"+j);
				sum+=i*j;
			}
		}
		System.out.println(sum*2);
	}

}
