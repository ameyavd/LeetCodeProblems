package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharsCount dcc = new DuplicateCharsCount();
		dcc.duplicateCharactersInString("ameya");
	}
	
	public void duplicateCharactersInString(String s){
		HashMap<Character, Integer> hm = new HashMap<>();
		int count=0;
		for(char c:s.toCharArray()){
			if(!hm.containsKey(c)){
				hm.put(c, count);
			} else {
				int value = hm.get(c);
				value++;
				hm.replace(c, value);
			}
		}
		
	//	System.out.println(hm);
		
		Set<Map.Entry<Character,Integer>> entrySet = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : entrySet){
			if(entry.getValue() >= 1){
				System.out.println(entry.getKey()+": "+entry.getValue());
			}
		}
	}

}
