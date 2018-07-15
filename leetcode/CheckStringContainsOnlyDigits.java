package leetcode;

public class CheckStringContainsOnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckStringContainsOnlyDigits css = new CheckStringContainsOnlyDigits();
		String s="0112a";
		boolean res = css.checkOnlyDigits(s);
		System.out.println(res);
		

	}
	
	public boolean checkOnlyDigits(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) > 47 && s.charAt(i) < 58){
				//do nothing
			} else {
				return false;
			}
		}
		
		return true;
	}

}
