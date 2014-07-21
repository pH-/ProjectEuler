package com.euler.project.pH;

import java.util.ArrayList;
import java.util.HashMap;

public class Problem26 {
	
	public void getlongestCycle()
	{
		ArrayList<Integer> primenums = primes(1000);
		System.out.println(primenums);
//		int maxLen = -1;
//		int maxPrime = 0;
//		for(int i=0; i<primenums.size(); i++) {
//			int cycleLen = getCycleLen(primenums.get(i));
//			if(maxLen<cycleLen) {
//				maxLen = cycleLen;
//				maxPrime = primenums.get(i);
//			}
//		}
//		System.out.println(maxLen);
//		System.out.println(maxPrime);
		System.out.println(getCycleLen(101));
		
	}

	private int getCycleLen(int divisor)
	{
		int cycleLen = 0;
		int currDiv = 1;
		int currRem = 0;
		int index = 0;
		HashMap<Integer, Integer> rems = new HashMap<Integer, Integer>();
		for(;;) {
			currRem = currDiv%divisor;
			System.out.println("Rem:"+currRem);;
			if(currRem==0) {
				cycleLen=0;
				break;
			}
			else if(rems.containsKey(currRem)) {
				cycleLen = cycleLen - rems.get(currRem);
				break;
			} else {
				rems.put(currRem, index);
				System.out.println("Div:"+currDiv);
				System.out.println("Rem:"+currRem);;
				while(currRem<divisor) {
					currRem = currRem*10;
				}
				currDiv = currRem;
				cycleLen++;
				index++;
			}
		}
		return cycleLen;
	}
	
	private ArrayList<Integer> primes(int limit)
	{
		ArrayList<Integer> primeNums = new ArrayList<Integer>();
		int[] numarray = new int[limit];
		for(int i=0; i<limit; i++) {
			numarray[i] = 0;
		}
		for(int i=2; i<limit; i++) {
			if(numarray[i]==0) {
				primeNums.add(i);
				for(int j = 2*i; i<Math.sqrt(limit) && j<limit; j+=i) {
					numarray[j] = 1;
				}
			}
		}
		return primeNums;
	}
	
}
