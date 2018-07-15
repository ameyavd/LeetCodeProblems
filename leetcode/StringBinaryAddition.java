package leetcode;

/*
 * Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 */

public class StringBinaryAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "11";
		String b = "1";
		StringBinaryAddition sba = new StringBinaryAddition();
		String res = sba.addBinary(a, b);
		System.out.println(res);

	}
	
public String addBinary(String a, String b) {
       if(a == null && b == null){
    	   return null;
       } 
       if(a == null || a.length() == 0){
    	   return b;
       } 
       if(b == null || b.length() == 0){
    	   return a;
       }
       
       int carry = 0;
       int aDigit = 0; int bDigit = 0;
       StringBuilder sb = new StringBuilder();
       for(int i = a.length()-1, j = b.length()-1; i>=0 || j>=0; i--,j--){
    	   aDigit = (i > -1)?a.charAt(i) - '0' : 0;
    	   bDigit = (j > -1)?b.charAt(j) - '0' : 0;
    	   
    	   sb.append((carry+aDigit+bDigit) % 2);
    	   carry = (carry+aDigit+bDigit) /2;
       }
       
       if(carry>0){
    	   sb.append(carry);
       }
       
       
	return sb.reverse().toString();
    }

}
