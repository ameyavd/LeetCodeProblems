package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParenthesis gp =new GenerateParenthesis();
		int n=3;
		gp.generateParenthesis(n);

	}
	
	 public List<String> generateParenthesis(int n) {
	        List<String> strList = new ArrayList<String>();
	        backTrack(strList, "", 0,0,n);
	        return strList;
	    } 
	    
	    public void backTrack(List<String> str, String s, int open, int close, int max){
	        if(s.length() == max*2){
	            str.add(s);
	            return;
	        }
	        
	        if(open < max)
	            backTrack(str, s+"(", open+1, close, max);
	        if(close < open)
	            backTrack(str, s+")",open, close+1, max);
	    }

}
