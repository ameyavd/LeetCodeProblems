package leetcode;

/*
 * Write a method to replace all spaces in a string with '%20: You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: If implementing in Java, please use a character array so that you can
perform this operation in place.)
EXAMPLE
Input: "Mr John Smith "J 13
Output: "Mr%20John%20Smith"
 */

public class Urlify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Urlify url = new Urlify();
		String s = "Mr John Smith    ";
		url.StringUrlify(s);

	}
	
	public void StringUrlify(String s){
		
		String newString = s.replace(" ", "%20");
		System.out.println(newString);
		
	}

}
