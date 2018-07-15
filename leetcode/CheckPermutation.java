package leetcode;

/*
 * Given two strings, write a method to decide if one is a permutation of the
other.
 */
import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckPermutation cp = new CheckPermutation();
		String s1 = "ameya", s2="aeym";
		cp.checkPermutation(s1, s2);
	}
	
	public void checkPermutation(String s1, String s2){
		
		if(s1.length() != s2.length()){
			System.out.println("String are not same!");
		} else {
		char[] chs1 = s1.toCharArray();
		char[] chs2 = s2.toCharArray();
		
		Arrays.sort(chs1);
		s1 = new String(chs1);
		Arrays.sort(chs2);
		s2 = new String(chs2);
		
		if(s1.equals(s2)){
			System.out.println("String are same just permutation of other");
		} else {
			System.out.println("Strings are not same");
		}
		}
	}

}
