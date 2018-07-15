package leetcode;

import java.util.Hashtable;

public class PrintFirstNonRepeatedChar {
	
	public void printFirstNonRepeatedChar(String s){
		Hashtable<Character, Integer> ht = new Hashtable<>();
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			int count = 1;
			if(!ht.containsKey(c)){
				ht.put(c, count);
			} else {
				count = ht.get(c);
				count++;
				ht.put(c, count);
			}
		}
		for(Character key : ht.keySet()){
			if(ht.get(key) == 1){
				System.out.println(key);
				break;
			}
		}
		System.out.println(ht);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintFirstNonRepeatedChar pfnrc = new PrintFirstNonRepeatedChar();
		String s = "simplest";
		pfnrc.printFirstNonRepeatedChar(s);
		

	}

}
