package com.euler.project.pH;

public class Problem5 {
	
	public void getMinMultiple()
	{
		int[] nums = new int[20];
		for(int i=0; i<20; ++i)
			nums[i]=i+1;
		for(int j=1; j<20; ++j)
		{
			for(int k=j+1; k<20; ++k)
			{
				if(nums[k]%nums[j]==0)
					nums[k]/=nums[j];
			}
		}
		int prod = 1;
		for(int i=0; i<20; ++i)
			prod*=nums[i];
		System.out.println(prod);
	}

}
