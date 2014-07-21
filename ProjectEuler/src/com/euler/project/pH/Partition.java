package com.euler.project.pH;

import java.util.Stack;

public class Partition {
	
	public boolean partitionArray(int[] arr)
	{
		Stack<Integer> remainingArr = new Stack<Integer>();
		for(int i=0; i<arr.length; i++)
		{
			remainingArr.push(arr[i]);
		}
		return recursivePartition(0,0,remainingArr);
	}
	public boolean recursivePartition(Integer leftSum, Integer rightSum, Stack<Integer> remainingArr)
	{
		if(leftSum==rightSum)
			return true;
		Integer currElement = remainingArr.pop();
		if(!remainingArr.empty())
		{
			boolean lresult = recursivePartition(leftSum+currElement, rightSum, remainingArr);
			if(lresult)
				return lresult;
			else
				return recursivePartition(leftSum, rightSum+currElement, remainingArr);
		}
		return false;
	}

}
