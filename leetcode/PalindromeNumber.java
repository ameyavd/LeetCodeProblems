package leetcode;

/*
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * 
 * Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false

Example 3:

Input: 10
Output: false

Coud you solve it without converting the integer to a string?
 */

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber pn = new PalindromeNumber();
		int x = 121;
		boolean res = pn.isPalindrome(x);
		System.out.println(res);

	}

public boolean isPalindrome(int x) {
      int rev = 0, ognum = x;
	if(x < 0 ){
		return false;
	}
	
	if(x == 0){
		return true;
	}
	
	while(x != 0){
		rev = rev*10 + x % 10;
	    x /= 10;
	}
	
	if(rev == ognum){
		return true;
	}
	
	return false;
    }
}
