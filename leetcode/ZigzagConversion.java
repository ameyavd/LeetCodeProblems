package leetcode;

/*
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
 */

public class ZigzagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "PAYPALISHIRING";
		int numRows = 3;
		
		ZigzagConversion zzc = new ZigzagConversion();
		String res = zzc.convert(s, numRows);
		System.out.println(res);

	}
	
public String convert(String s, int numRows) {
	
	if(numRows <= 1) return s;
	
	StringBuilder[] sb = new StringBuilder[numRows];
	for(int i=0; i<sb.length; i++){
		sb[i] = new StringBuilder("");  //initalize every StringBuilder in the array
	}
	
	int incre = 1,index =0;
	for(int i=0; i<s.length(); i++){ // looping on the length of string
		sb[index].append(s.charAt(i));
		if(index == 0){
			incre = 1;
		}
		
		if(index == numRows-1){
			incre = -1;
		}
		
		index = index + incre;
	}
	
	String re="";
	for(int i=0;i <sb.length;i++){
		re = re+sb[i];
	}
	
	return re.toString();
     
   } 

}
