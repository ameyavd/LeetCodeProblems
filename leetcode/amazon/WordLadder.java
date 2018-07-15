package leetcode.amazon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> wordList = new ArrayList<>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		
		WordLadder wl = new WordLadder();
		int res = wl.ladderLength("hit", "cog", wordList);
		System.out.println(res);
	}
	
	 public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		
		 if(wordList == null || wordList.size() == 0 || beginWord == null || endWord == null) return 0;
		 if(!(wordList.contains(endWord))){
			 return 0;
		 }
		 int level = 0;
		 Queue<String> que = new LinkedList<>();
		 que.add(beginWord);
		 while(!que.isEmpty()){
			int size = que.size();
			for(int i=0;i<size;i++){
				String cur = que.poll();
				if(cur.equals(endWord)) return level+1;
				for(int j=0;j<cur.length();j++){
					char[] word = cur.toCharArray();
					for(char ch='a'; ch< 'z';ch++){
						word[j] = ch;
						String check = new String(word);
						if(!check.equals(cur) && wordList.contains(check)){
							que.add(check);
							wordList.remove(check);
						}
					}
				}
			}
			level++;
		 }
		 return 0;
	    }

}
