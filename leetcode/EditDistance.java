package leetcode;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EditDistance ed = new EditDistance();
		

	} 
	
	public int editDistance(String s1, String s2, int m, int n){
		if(s1 == null) return n;
		if(s2 == null) return m;
		
		if(s1.charAt(m-1) == s2.charAt(n-1)){
			return editDistance(s1, s2, m-1, n-1);
		}
		
		return 1+ min( editDistance(s1, s2, m, n-1),
				editDistance(s1, s2, m-1, n),
				editDistance(s1, s2, m-1, n-1));
	}
	
	int min(int x,int y,int z)
    {
        if (x<=y && x<=z) return x;
        if (y<=x && y<=z) return y;
        else return z;
    }

}
