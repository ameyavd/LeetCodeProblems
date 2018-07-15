package leetcode;

/*
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]
 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseANumber {

	public static void main(String[] args) {
		System.out.println("main");
		ReverseANumber ran = new ReverseANumber();
		int x = 964632435;
		x = ran.reverse(x);
		System.out.println(x);
		
	}
	
	public int reverse(int x) {
       /* boolean flag = false;
        if(x == Integer.MAX_VALUE || x == Integer.MIN_VALUE){
        	return 0;
        } else {
        if(x < 0){
        	flag = true;
        }
        
        
        	x = Math.abs(x);
        	String ss = Integer.toString(x);
            StringBuffer xs = new StringBuffer(ss);
            xs = xs.reverse();
            String s = xs.toString();
            x = Integer.parseInt(s);
            if(flag){
            	x=0-x;
            }
        }
        return x;*/
		
		int res = 0;
		
		while(x != 0){
			int tail = x%10;
			int newres = res *10 + tail;
			if((newres - tail)/10 != res){
				return 0;
			}
			res = newres;
			x = x/10;
		}
		
		return res;
    }

}
