package leetcode;

import java.util.HashMap;

public class CountOccuranceofChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountOccuranceofChar coc = new CountOccuranceofChar();
		String s = "ameyaameya";
		char c = 'a';
		coc.CountOccurance(s, c);

	}
	
	public void CountOccurance(String s, char c){
		HashMap<Character, Integer> hm = new HashMap<>();
		int count = 0;
		for(int i=0;i<s.length();i++){
			if(hm.containsKey(s.charAt(i))){
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			} else {
				hm.put(s.charAt(i), count);
			}
		}
		System.out.println(hm);
		System.out.println("Key:"+c+" value:"+hm.get(c));
	}

}
