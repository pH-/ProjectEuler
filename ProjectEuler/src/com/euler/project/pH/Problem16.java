package com.euler.project.pH;

public class Problem16 {
	
	public void getSum(int limit)
	{
		int sum=0;
		int[] bignum = new int[4*limit];
		bignum[0] = 1;
		for(int i=1; i<limit; i++)
		{
			bignum[i] = 0;
		}
		printArr(bignum, limit);
		int carry = 0;
		int nextRoundLim = 2;
		int roundLim = 2;
		for(int i=2; i<limit; ++i) {
			carry = 0;
			roundLim = nextRoundLim;
			System.out.print(i+":");
			for(int j=0; ; ++j) {
				int temp = bignum[j];
				if(j<roundLim)
					temp *= i;
				temp += carry;
				if(temp==0 && j>=roundLim)
					break;
				if(temp>9) {
					bignum[j] = temp%10;
					carry = temp/10;
					if(j>=roundLim-1)
						nextRoundLim++;
				}
				else {
					bignum[j] = temp;
					carry = 0;
				}
			}
			printArr(bignum, nextRoundLim);
		}
		for(int i=4*limit-1; i>=0; i--) {
			System.out.print(bignum[i]);
			sum += bignum[i];
		}
		System.out.println();
		System.out.println("sum:"+sum);
	}
	private void printArr(int[] arr, int limit)
	{
		for(int i=limit-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
