package leetcode;

/*
 * One Away: There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -) true
pales, pale -) true
pale, bale -) true
pale, bae -) false
 */

public class OneAway {
	
	public boolean checkString(String s1, String s2){
		int count = 0;
		char[] chs1 = s1.toCharArray();
		char[] chs2 = s2.toCharArray();
		for(int i=0; i< chs1.length; i++){	
			for(int j=0; j<chs2.length; j++)
				if(chs1[i] == chs2[j]){
					count++;
				}
		}
		if(count >= 1)
			return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OneAway oa = new OneAway();
		String s1 = "pale";
		String s2 = "pale";
		boolean res = oa.checkString(s1, s2);
		System.out.println(res);
		
		

	}

}
