package leetcode.amazon;

import java.util.LinkedList;
import java.util.List;

public class LetterCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterCombination lc = new LetterCombination();
		List<String> res = lc.letterCombinations("22");
		System.out.println(res);
	}
	
	 public List<String> letterCombinations(String digits) {
	        LinkedList<String> ans = new LinkedList<>();
	        
	        String[] mappings = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	        ans.add("");
	        for(int i=0;i<digits.length();i++){
	        	int x = Character.getNumericValue(digits.charAt(i));
	        	while(ans.peek().length()==i){
	        		String t = ans.remove();
	        		for(char c:mappings[x].toCharArray()){
	        			ans.add(t+c);
	        		}
	        	
	        	}
	        }
	        return ans;
	    }

}
