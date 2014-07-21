package com.euler.project.pH;

public class Problem24 {
	int digs = 10;

	public void getKthLexicographicPerm(int k)
	{
		int numdigsLeft = 10;
		int[] digarray = {0,1,2,3,4,5,6,7,8,9};
		int[] digsUsed = new int[digs];
		for(int i=0; i<digs; i++) {
			digsUsed[i] = 0;
		}
		int[] factArray = new int[digs];
		factArray[0] = 1;
		for(int i=1; i<digs; i++) {
			factArray[i] = factArray[i-1]*i;
		}
		int[] resultArr = new int[digs];
		for(int i=0; i<digs; i++) {
			System.out.println("k:"+k);
			int currDigIndex = (k/factArray[numdigsLeft-1]);
			k = k- currDigIndex*factArray[numdigsLeft-1];
			currDigIndex++;
			boolean found = false;
			for(int j=0; !found; j++) {
				if(digsUsed[j]==0) {
					currDigIndex--;
					if(currDigIndex<=0) {
						resultArr[i] = j;
						digsUsed[j] = 1;
						found=true;
					}
				}
			}
			numdigsLeft--;
			printArray(resultArr);
		}
	}
	private void printArray(int[] arr) 
	{
		for(int i=0; i<digs; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}
}
