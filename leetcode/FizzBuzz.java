package leetcode;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz fb = new FizzBuzz();
	//	fb.printFizzBuzz();
	//	fb.printFizzBussReplacingNumber();
		fb.printFizzBuzzReplaceDigit();
	}
	
	public void printFizzBuzz(){
		for(int i=1;i<101;i++){
			if(i%3 == 0 && i%5==0){
				System.out.println("FizzBuzz");
			} else if(i%3==0){
				System.out.println("Fizz");
			} else if(i%5==0){
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
	public void printFizzBussReplacingNumber(){
		for(int i=1;i<101;i++){
			int unit = i%10;
			int tens = i/10;
			if((unit == 3 || tens == 3) && (unit == 5 || tens == 5)){
				System.out.println("FizzBuzz");
			}
			else if(unit == 3 || tens == 3){
				System.out.println("Fizz");
			} else if( unit == 5 || tens == 5){
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
			
		}
	}
	
	public void printFizzBuzzReplaceDigit(){
		StringBuffer sb;
		for(int i=1;i<101;i++){
			sb = new StringBuffer();
			int unit = i%10;
			int tens = i/10;
			if(unit == 3 || tens == 3){
				if(unit == 3){
					if(i/10 !=0)
					sb.append(i/10);
					sb.append("Fizz");
				}  if(tens == 3){
					sb.append("Fizz");
					sb.append(i%10);
				}
				System.out.println(sb.toString());
			} else {
				System.out.println(i);
			}
			
			
		}
	}

}
