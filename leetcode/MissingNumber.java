package leetcode;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int a[] = {1,2,3};
        int miss = getMissingNo(a,3);
        System.out.println(miss);  
	}
	
	 static int getMissingNo (int a[], int n)
	    {
	        int i, total;
	        total  = (n+1)*(n+2)/2;   
	        for ( i = 0; i< n; i++)
	           total -= a[i];
	        return total;
	    }
	      
	    /* program to test above function */
	   
	

}
