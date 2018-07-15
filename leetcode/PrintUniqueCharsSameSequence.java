package leetcode;

import java.util.HashSet;

/*
 * Printing Unique characters of the String Keeping the sequence same
 */

public class PrintUniqueCharsSameSequence {
	
	public void printUniqueCharsSameSeq(String s){
		char[] uniquechars = new char[s.length()];
		HashSet<Character> hs = new HashSet<>();
		int i=0;
		for(char c: s.toCharArray()){
			if(!hs.contains(c)){
				hs.add(c);
				uniquechars[i] = c;
				i++;
			}
		}
		
		System.out.println(uniquechars);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintUniqueCharsSameSequence pucss = new PrintUniqueCharsSameSequence();
		String s = "aasbacd";
		pucss.printUniqueCharsSameSeq(s);

	}

}
