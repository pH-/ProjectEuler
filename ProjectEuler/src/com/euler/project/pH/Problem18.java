package com.euler.project.pH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Problem18 {
	
	ArrayList<ArrayList<Integer> > triangle = new ArrayList<ArrayList<Integer> >();
	
	
	public void getspfValue() throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("p67.txt"));
		String line;
		while((line = in.readLine())!=null) {
			String nums[] = line.split(" ");
			ArrayList<Integer> currRow = new ArrayList<Integer>();
			for(String eachNum:nums) {
				currRow.add(Integer.parseInt(eachNum));
			}
			triangle.add(currRow);
			
		}
		in.close();
		
		for(int i=triangle.size()-2; i>=0; i--) {
			ArrayList<Integer> tempRow = triangle.get(i);
			for(int j=0; j<i+1; j++ ) {
				int num = tempRow.get(j);
				int neigh = Math.max(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
				tempRow.set(j, num+neigh);
			}
			triangle.set(i, tempRow);
		}
		System.out.println(triangle.get(0).get(0));
	}
}
