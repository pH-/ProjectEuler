package com.euler.project.pH;

public class Problem1 {
	
	public void sumOfmultiples ()
	{
		boolean moredata3 = true;
		boolean moredata5 = true;
		int i=1;
		int sum=0;
		int limit = 1000;
		while(moredata3 || moredata5)
		{
			moredata3 = (i*3)<limit;
			moredata5 = (i*5)<limit;
			if(moredata3)
				sum+=i*3;
			if(moredata5 && (i*5)%3!=0)
				sum+=i*5;
			i++;
		}
		System.out.println(sum);
	}

}
