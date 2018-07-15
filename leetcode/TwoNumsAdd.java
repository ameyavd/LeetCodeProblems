package leetcode;

/*
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
Example:
Given a = 1 and b = 2, return 3.
 */

public class TwoNumsAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoNumsAdd tna = new TwoNumsAdd();
		int a = -17, b = 0;
		int res = tna.getSum(a, b);
		System.out.println(res);

	}
	
	 public int getSum(int a, int b) {
		 int res = a;
		 if(a >= 0 && b>= 0){
			 for(int i=0; i< b; i++){
	    		 res++;
	     } 
		 } else if( a > 0 && b <= 0) {
			 for(int i=b; i< 0; i++){
				 res--;
			 }
			 
		 } else if (a <= 0 && b > 0){
			 for(int i=0; i< b; i++){
				 res++;
			 }
			 
		 }else {
			 for(int i=b; i < 0; i++){
	    		 res--;
	     }
		 }
	     
		 return res;
	 }

}
