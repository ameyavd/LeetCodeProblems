package leetcode;

import java.util.HashSet;

public class PrintDuplicateCharactersInString {
	
	public void printDuplicateCharacters(String s){
		HashSet<Character> hs = new HashSet<>();
		HashSet<Character> dup = new HashSet<>();
		char[] uniqueChars = new char[s.length()];
		char[] duplicateChars = new char[s.length()];
		int i=0, j=0;
		for(char c:s.toCharArray()){
		if(!hs.contains(c)){ //if first time or unique add to HashSet hs
			hs.add(c);
			uniqueChars[i] = c;
			i++;
		} else {
			if(!dup.contains(c)){ // if duplicate add to HashSet dup. But they will be added only once 
				//if they are repeating multiple times			
				dup.add(c);
				duplicateChars[j] = c;
				j++;
			}
		}		
		}
		System.out.println(dup); // printing duplicate with ascending order
		System.out.println(uniqueChars); // prinitng unique characters in order of their occurance in string
		System.out.println(duplicateChars); //prinitng duplicate characters in order of their occurance in String	
		//printing with keeping the sequence same
	/*	for(int i=0; i<dup.size(); i++){
			
		}*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintDuplicateCharactersInString pdc = new PrintDuplicateCharactersInString();
		String s = "ddasccb";
		pdc.printDuplicateCharacters(s);

	}

}
