package leetcode.amazon;

import java.util.TreeMap;

public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxProfit mp = new MaxProfit();
		int prices[] = { 7, 1, 5, 3, 6, 4 };
		int res = mp.maxProfit(prices);
		System.out.println(res);
	}

	public int maxProfit(int[] prices) {
		if(prices == null || prices.length == 0) return 0;
		int max = 0, sofarmin = prices[0];
		for(int i=0;i<prices.length;i++){
			if(prices[i] > sofarmin){
				max = Math.max(max, prices[i] - sofarmin);
			} else {
				sofarmin = prices[i];
			}
		
		}
		
		return max;
	}
}
