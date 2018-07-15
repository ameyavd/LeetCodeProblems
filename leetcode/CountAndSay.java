package leetcode;

/*
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * 1.     1
2.     11
3.     21
4.     1211
5.     111221

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.
 */

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountAndSay cas = new CountAndSay();
		String result = cas.countAndSay(4);
		System.out.println(result);

	}
	
public String countAndSay(int n) {
	StringBuilder cur = new StringBuilder("1");
    for (int i = 1; i < n; i++) {
        StringBuilder pre = cur;
        cur = new StringBuilder();
        for (int j = 0, count = 1; j < pre.length(); j++) {
            if (j == pre.length()-1 || pre.charAt(j) != pre.charAt(j+1)) {
                cur.append(count).append(pre.charAt(j));
                count = 1;
            } else count++;
        }
    }
    return cur.toString();
}

	
}
