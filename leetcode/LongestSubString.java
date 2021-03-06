package leetcode;

import java.util.HashMap;

/*
 * Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", 
with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LongestSubString lss = new LongestSubString();
		String s = "pwwkew";
		int length = lss.lengthOfLongestSubstringUsingHashMap(s);
		System.out.println(length);

	}
	
	public int lengthOfLongestSubstringUsingHashMap(String s) {
		
		if(s.length() == 0){
			return 0;
		}
		
		HashMap<Character, Integer> hm = new HashMap<>();
		int max = 0;
		for(int i=0, j=0; i<s.length(); ++i){
			if(hm.containsKey(s.charAt(i))){
				j = Math.max(j, hm.get(s.charAt(i))+1);
			}
			hm.put(s.charAt(i), i);
			max = Math.max(max,i-j+1);
		}
		
		return max;
	}
	
	

}
