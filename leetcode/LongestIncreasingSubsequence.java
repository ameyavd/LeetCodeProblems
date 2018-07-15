package leetcode;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		int arr[] = { -15898, -10, 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		lis.longestIncreasingSubsequence(arr);
	}

	public void longestIncreasingSubsequence(int arr[]) {
		int count = 0, max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				count++;
			max = arr[i];

		}
		System.out.println(count);

	}

}
