package leetcode.amazon;

import java.util.ArrayList;
import java.util.List;

public class BreakWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreakWord bw = new BreakWord();
		String s = "catsandog";
		List<String> wordList = new ArrayList<>();
		wordList.add("cats");
		wordList.add("dog");
		wordList.add("sand");
		wordList.add("ant");
		wordList.add("cat");
		boolean res = bw.wordBreak(s, wordList);
		System.out.println(res);

	}
	
	 public boolean wordBreak(String s, List<String> wordDict) {
		int n = s.length();
		boolean f[] = new boolean[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				String sub = s.substring(j,i+1);
				
				if(wordDict.contains(sub) && (j==0 || f[j-1])){
					f[i] = true;
					break;
				}
			}
		}
	    return f[n-1];
	 	}
	 }
