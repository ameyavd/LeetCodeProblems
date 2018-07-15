package leetcode.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
public List<List<String>> groupAnagrams(String[] strs) {
     if(strs == null || strs.length == 0){
    	 return null;
     }
     Map<String,List<String>> map = new HashMap<>();
     for(String s: strs){
    	 char[] ch = s.toCharArray();
    	 Arrays.sort(ch);
    	 String keyStr = String.valueOf(ch);
    	 if(!map.containsKey(keyStr)) 
    		 map.put(keyStr, new ArrayList<String>());
    	 map.get(keyStr).add(s);
     }
	
	return new ArrayList<List<String>>(map.values());
    }

}
