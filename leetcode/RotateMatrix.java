package leetcode;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateMatrix rm = new RotateMatrix();
		int matrix[][] = {{1,2,3},
						  {4,5,6},
						  {7,8,9}};
		
		rm.rotate(matrix);
	}
	
	 public void rotate(int[][] matrix) {
		 int rows = matrix.length;
		 int cols = matrix[0].length;
		 for(int first=0,last=rows-1; first<last;first++,last--){
			
		 
	        int temp[] = matrix[first];
	        matrix[first] = matrix[last];
	        matrix[last] = temp;
		 }

	        
	        for(int i=0;i<matrix.length;i++){
	        	for(int j=i+1;j<matrix[0].length;j++){
	        		int tmp = matrix[i][j];
	        		matrix[i][j] = matrix[j][i];
	        		matrix[j][i]=tmp;
	        	}
	        }
	        
	        for(int i=0;i<matrix.length;i++){
	        	for(int j=0;j<matrix[0].length;j++){
	        		System.out.print(matrix[i][j]);
	        	}
	        	System.out.println();
	        }
	    }

}
