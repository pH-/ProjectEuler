package com.euler.project.pH;

public class Problem25 {
	
	int numdigs = 1001;
	public void get100digFibNum()
	{
		int[] fibnum0 = new int[numdigs];
		int[] fibnum1 = new int[numdigs];
		int[] fibnum = new int[numdigs];
		
		for(int i=0; i<numdigs; i++) {
			fibnum0[i] = fibnum1[i] = fibnum[i] = 0;
		}
		fibnum0[0] = fibnum1[0] = 1;
		int count = 2;
		while(fibnum[999] == 0) {
//			printbigInt(fibnum0);
//			printbigInt(fibnum1);
			copyBigInt(fibnum,fibnum1);
			copyBigInt(fibnum,addbigInt(fibnum0, fibnum));
			copyBigInt(fibnum0,fibnum1);
			copyBigInt(fibnum1,fibnum);
			count++;
//			printbigInt(fibnum);
		}
		System.out.println(count);
	}
	private void copyBigInt(int[] a, int[] b)
	{
		for(int i=0; i<numdigs; i++)
		{
			a[i] = b[i];
		}
	}
	private void printbigInt(int[] a)
	{
		for(int i=numdigs-1; i>=0; i--)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}
	private int[] addbigInt(int[] a, int[] b)
	{
		int carry = 0;
		for(int i=0; i<numdigs; i++)
		{
			int temp = a[i] + b[i] + carry;
			if(temp<10) {
				b[i] = temp;
				carry = 0;
			} else {
				b[i] = temp%10;
				carry = temp/10;
			}
		}
		return b;
	}
}
