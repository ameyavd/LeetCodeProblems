package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Knapsack ks = new Knapsack();
		int val[] = {10,40,30,50};
		int wt[] = {5,4,6,3};
		int w = 10;
		ks.knapsack(val, wt, w);
	}
	
	public void knapsack(int[] val, int[] wt, int w){
		List<Integer> value = new ArrayList<>();
		for(int i=0;i<wt.length;i++){
			for(int j=1;j<wt.length-1;j++){
				if(wt[i]+wt[j] <= w){
					value.add(val[i]+val[j]);
				}
				
			}
		}
		
		Collections.sort(value);
		
		System.out.println(value.get(value.size()-1));
	}

}
