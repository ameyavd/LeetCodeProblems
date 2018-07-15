package leetcode;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTriangle pt = new PrintTriangle();
		pt.printTriangleUpside(5);
		System.out.println();
		System.out.println();
		System.out.println();
		pt.printTriangleDownside(5);
	}
	
	public void printTriangleUpside(int n){
		for(int i=0;i<n+1;i++){
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			for(int k=0;k<(2*i-1);k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void printTriangleDownside(int n){
	//	System.out.println("Start");
		for(int i=n;i>0;i--){
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}
			
			for(int k=0; k<(2*i-1); k++){
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
