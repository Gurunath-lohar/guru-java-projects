package com.test.patternmatching;

import java.util.regex.Pattern;

public class PatternMatchingMain {
	public static void main(String args[])
	{
		String pattern = "inventory-[A-Za-z0-9_.-]*-d2";
		String [] testStrings ={"inventor-fsgf-54-de",
								"inventory-f_g-3.4-d2",
								"inventory-y-3235dfs-d2",
								"inventory-rwer-we-324-d2",
								"inventory-fsdf-d2",
								"inventory-gf.45-d2"};
		for(String str : testStrings)
		{
			System.out.println("String :"+str+" matches :"+Pattern.matches(pattern, str));
		}
	}
}
