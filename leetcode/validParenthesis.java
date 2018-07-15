package leetcode;

import java.util.Stack;

import com.ameya.hackerrank.ValidParenthesis;

public class validParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="()";
		validParenthesis vp = new validParenthesis();
		boolean res = vp.isValidParan(s);
		System.out.println(res);

	}
	 public boolean isValidParan(String s) {
			if(s.length() % 2 == 1)
				return false;
			
	        Stack<Character> stk = new Stack<Character>();
	        for(int i=0; i<s.length();++i){
	        	if(s.charAt(i) == '{'){
	        		stk.push('}');
	        	} else if(s.charAt(i) == '('){
	        		stk.push(')');
	        	} else if (s.charAt(i) == '['){
	        		stk.push(']');
	        	} else if (stk.isEmpty() || stk.pop() != s.charAt(i)){
	        		return false;
	        	}
	        }
	        return stk.isEmpty();
	    }

}
