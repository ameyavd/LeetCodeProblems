package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
 */

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "0P";
		ValidPalindrome vp = new ValidPalindrome();
		boolean res = vp.isPalindrome(s);
		
		System.out.println(res);

	}
	
	
	    public boolean isPalindrome(String s) {
	        String str = s.toLowerCase();
	        List<Character> al = new ArrayList<>();
	        for(int i=0;i<str.length();i++){
	            if((str.charAt(i) > 96 && str.charAt(i) < 123) || (str.charAt(i) > 47 && str.charAt(i) < 58)){
	                al.add(str.charAt(i));
	            }
	        }
	        Iterator<Character> it = al.listIterator();
	        StringBuffer sb = new StringBuffer();
	        while(it.hasNext()){
	        	sb.append(it.next());
	        }
	        System.out.println(sb.toString());
	        System.out.println(sb.reverse().toString());
	        if(sb.toString().equals(sb.reverse().toString())){
	            return true;
	        } 
	        
	        return false;
	    }
	}


