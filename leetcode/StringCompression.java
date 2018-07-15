package leetcode;

import java.util.HashMap;

/*
 * Given an array of characters, compress it in-place.
The length after compression must always be smaller than or equal to the original array.
Every element of the array should be a character (not int) of length 1.
After you are done modifying the input array in-place, return the new length of the array.

Follow up:
Could you solve it using only O(1) extra space?

Input:
["a","a","b","b","c","c","c"]
Output:
Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation:
"aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by "c3".
 */

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompression sc = new StringCompression();
		char[] chars = {'a','a','b','b','b','c','c'};
		int count = sc.compress(chars);
		System.out.println(count);

	}
	
	 public int compress(char[] chars) {
		 
		 int index=0, indexAns = 0;
		 
		 while(index < chars.length){
			 char currentChar = chars[index];
			 int count = 0;
			 
			 while(index < chars.length && chars[index] == currentChar){
				 index++;
				 count++;
			 }
			 
			 chars[indexAns++] = currentChar;
			 
			 if(count != 1){
				 for(char c: Integer.toString(count).toCharArray()){
					 chars[indexAns++] = c;
				 }
			 }
		 }
		 
		 return indexAns;
		 
		 
	 }

}
