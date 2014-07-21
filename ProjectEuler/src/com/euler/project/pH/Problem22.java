package com.euler.project.pH;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Problem22 {
	
	public void getScore() throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("p22.txt"));
		String line = in.readLine();
		String names[] = line.split(",");
		long scores[] = new long[names.length];
		ArrayList<String> nameList = new ArrayList<String>();
		long totalScore = 0;
		for(int i=0; i<names.length; i++) {
			String temp = names[i].substring(1,names[i].length()-1);
			nameList.add(temp);
		}
		Collections.sort(nameList.subList(0, nameList.size()));
		for(int i=0; i<nameList.size(); ++i) {
			long score = 0;
			for(char c : nameList.get(i).toCharArray()) {
				score += c-'A'+1;
			}
			scores[i] = score*(i+1);
		}
		for(int i=0; i<names.length; i++) {
			System.out.println(nameList.get(i)+":"+scores[i]);
			totalScore+=scores[i];
		}
		System.out.println(totalScore);
		System.out.println(nameList.get(937));
		in.close();
	}
}
