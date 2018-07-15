package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PascalTriangle pt = new PascalTriangle();
		pt.generate(5);

	}
	
	 public List<List<Integer>> generate(int numRows) {
		 List<List<Integer>> res = new ArrayList<>();
		 
	        for(int i=0; i<numRows; i++){
	        	List<Integer> al = new ArrayList<>();
	        for(int j=0; j<i+1; j++){
	        	
	        		if(j==0 ){
	        			al.add(1);
	        		} else if(j == i){
	        			al.add(1);
	        		}else {
	        			List<Integer> prev = res.get(i-1);
	        			al.add(prev.get(j)+prev.get(j-1));
	        			
	        			
	        		}
	        	}
	        	res.add(al);
	        }
	        for(int i=0; i<res.size(); i++){
	        	for(int j=0; j<res.get(i).size(); j++){
	        		System.out.print(res.get(i).get(j));
	        	}
	        	System.out.println();
	        }
	        return res;
	    }

}
