package leetcode.amazon;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrayCode gc = new GrayCode();
		List<Integer> res = gc.grayCode(2);
		System.out.println(res);
	}
	
	 public List<Integer> grayCode(int n) {
		 if(n==0) return new ArrayList<Integer>();
	        List<Integer> res = new ArrayList<Integer>();
	        for(int i=0;i<Math.pow(2,n);i++){
	            res.add(i^i/2);
	        }
	        
	        return res;
	    }

}
