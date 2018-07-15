package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MoveDuplicateCharactersAtEndOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MoveDuplicateCharactersAtEndOfString mes = new MoveDuplicateCharactersAtEndOfString();
		String s = "ammeya";
		mes.moveDupCharsAtBack(s);

	}
	
	public void moveDupCharsAtBack(String s){
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			int count = 1;
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			} else {
				hm.put(c, count);
			}
		}
		
		char[] ch = new char[s.length()];
		List<Character> al = new ArrayList<>();
		int counter = 0;
		Set<Map.Entry<Character,Integer>> hs = hm.entrySet();
		for(Map.Entry<Character, Integer> entry : hs){
			if(entry.getValue() < 2){
				al.add(entry.getKey());
				
			} 
			
		}
		for(Map.Entry<Character, Integer> entry : hs){
			if(entry.getValue() > 1){
				int co = entry.getValue();
				while(co != 0){
				al.add(entry.getKey());
				co--;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for(Character sbc : al){
			sb.append(sbc);
		}
		System.out.println(sb.toString());
		
	}

}
