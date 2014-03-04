package com.euler.project.pH;

public class Problem4 {
	
	public void largestPalindrome()
	{
		int maxpal = -Integer.MAX_VALUE;
		for(int i=999; i>=100; --i)
		{
			for(int j=999; j>=100; --j)
			{
				int k = i*j;
				if(isPalindrome(k))
				{
					if(k>maxpal)
						maxpal = k;
				}
			}
		}
		System.out.println(maxpal);
	}
	private boolean isPalindrome(int num)
	{
		String numString = new Integer(num).toString();
		int strlen = numString.length();
		for(int i=0; i<strlen/2; ++i)
		{
			if(numString.charAt(i)!=numString.charAt(strlen-1-i))
				return false;
		}
		return true;
	}

}
