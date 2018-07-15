package leetcode;

public class CountVowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountVowelsandConsonants cvc = new CountVowelsandConsonants();
		String s = "this is a Sample text";
		cvc.countVowels(s);
	}
	
	public void countVowels(String s){
		int vowelsCount = 0, consonantCount = 0;
		for(int i=0;i<s.length();i++){
			s = s.toLowerCase(); 
			char c= s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				vowelsCount++;
			} else {
				consonantCount++;
			}
		}
		
		System.out.println("Number of Vowels:"+vowelsCount);
		System.out.println("Number of Consonants:"+consonantCount);
	}

}
