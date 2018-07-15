package leetcode;

public class MyPow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyPow mp = new MyPow();
		double x = 2.000;
		int n = 10;
		double res = mp.myPow(x, n);
		System.out.println(res);

	}
	
	 public double myPow(double x, int n) {
		 if(n==0) return 1;
		 if(n<0){
			 x = 1/x;
			 return (n%2)==0 ? myPow(x*x, -(n/2)) : x*myPow(x*x, -(n/2));
		 }
		 return (n%2)==0 ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
		 
	 }

}
