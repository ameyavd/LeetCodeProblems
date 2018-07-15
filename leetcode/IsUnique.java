package leetcode;

/*
 * Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
 */

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsUnique iu = new IsUnique();
		String s = "abcdasasasasa";
		iu.isUniqueWithoutDataStructiure(s);
		//iu.isUniqueWithDataStructure(s);

	}
	
	public void isUniqueWithoutDataStructiure(String s){
		boolean flag = false;
		for(int i=0; i<s.length(); i++){
			for(int j=i+1; j<s.length(); j++){
				if(s.charAt(i) == s.charAt(j)){
					flag = true;
				}
			}
			
		}
		
		if(flag){
			System.out.println("String dont have unique characters");
		} else {
			System.out.println("String has unique characters");
		}
	}
	
	/*public void isUniqueWithDataStructure(String s){
		//Assuming ASCII string 
		boolean flag = false;
		if(s.length() > 128){
			System.out.println("String dont have unique characters");
		}
		
		char[] char_arr = new char[128];
		for(int i=0; i<s.length(); i++){
			char val = s.charAt(i);
			if(char_arr[val] == s.charAt(i)){
				flag=true; // Duplicate character present
			}
			char_arr[i] = val;
		}
		
		if(flag){
			System.out.println("String dont have unique characters");
		} else {
			System.out.println("String has unique characters");
		}
	}*/

}
