package leetcode;

public class UniquePathInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniquePathInMatrix up = new UniquePathInMatrix();
		int res = up.allPaths(3, 3);
		System.out.println(res);

	}
	
	public int allPaths(int m, int n){
		if(m==1 || n == 1)
			return 1;
		
		return allPaths(m-1,n) + allPaths(m,n-1);
	}

}
