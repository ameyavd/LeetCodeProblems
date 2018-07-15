package leetcode;

public class LongestCommonSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcdefgh";
		String s2 = "pqrcdekl";
		LongestCommonSubSequence lcs = new LongestCommonSubSequence();
		int res = lcs.longestCommonSubsequence(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
		System.out.println(res );
	}
	
	public int longestCommonSubsequence(char[] s1, char[] s2, int m, int n){
		if(m==0 || n==0){
			return 0;
		}
			if(s1[m-1] == s2[n-1]){
				return 1 + longestCommonSubsequence(s1, s2, m-1, n-1);
			} else {
				return Math.max(longestCommonSubsequence(s1, s2, m-1, n), longestCommonSubsequence(s1, s2, m, n-1));
			}
	}

}
