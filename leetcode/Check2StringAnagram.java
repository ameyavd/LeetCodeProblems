package leetcode;

import java.util.Arrays;

public class Check2StringAnagram {
	
	public boolean stringAnagrams(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		char[] arr1 = s1.toLowerCase().toCharArray();
		char[] arr2 = s2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return Arrays.equals(arr1, arr2);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "aMeya";
		String s2 = "aeyam";
		Check2StringAnagram c2sa = new Check2StringAnagram();
		boolean res = c2sa.stringAnagrams(s1, s2);
		if(res){
			System.out.println("Strings are anagrams");
		}  else{
			System.out.println("String are not anagrams");
		}
		

	}

}
