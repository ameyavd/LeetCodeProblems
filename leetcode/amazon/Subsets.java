package leetcode.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3};
		Subsets ss = new Subsets();
		ss.subsets(nums);
		
	}
	
	 public List<List<Integer>> subsets(int[] nums) {
		 List<List<Integer>> res = new CopyOnWriteArrayList<>();
		    res.add(new ArrayList<Integer>());
		    
		    for(int i : nums) {
		        for(List<Integer> sub : res) {
		            List<Integer> a = new ArrayList<>(sub);
		            a.add(i);
		            res.add(a);
		        }
		    }
		    System.out.println(res);
		    return res;	
	    }

}
