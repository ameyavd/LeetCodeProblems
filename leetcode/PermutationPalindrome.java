package leetcode;

/*
 * Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
A palindrome is a word or phrase that is the same forwards and backwards. A permutation
is a rea rrangement of letters. The palindrome does not need to be limited to just dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat". "atco cta". etc.)
 */

public class PermutationPalindrome {
	
	
	
	public boolean stringCheck(String str){
		StringBuilder sb = new StringBuilder(str);
		if(sb.toString().equals(sb.reverse().toString())){
			return true;
		}
		return false;
	}
	
	public void permutation(String str, int l, int r){
		
		if(l==r){
			boolean flag = stringCheck(str);
			System.out.println(flag);
		} else {
			for(int i=l; i<=r; i++){
				str = swap(str,l,i);
				permutation(str,l+1,r);
				str = swap(str,l,i);
			}
		}
	}
	
	public String swap(String a, int i, int j){
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "nitin";
        int n = str.length();
        PermutationPalindrome permutation = new PermutationPalindrome();
        permutation.permutation(str, 0, n-1);

	}

}
