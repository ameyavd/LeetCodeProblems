package leetcode;

import java.util.Arrays;

/*
 * Given two strings s and t which consist of only lowercase letters.

String t is generated by random shuffling string s and then add one more letter at a random position.

Find the letter that was added in t.

Input:
s = "abcd"
t = "abcde"

Output:
e

Explanation:
'e' is the letter that was added.
 */

public class StringDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringDifference sd = new StringDifference();
		String s="abcd", t="abcde";
		char c = sd.findTheDifference(s, t);
		System.out.println(c);

	}
	
	 public char findTheDifference(String s, String t) { int charCode = t.charAt(s.length());
     // Iterate through both strings and char codes
     for (int i = 0; i < s.length(); ++i) {
           charCode -= (int)s.charAt(i);
           charCode += (int)t.charAt(i); 
     }
     return (char)charCode;}
	
	

}