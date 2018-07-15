package leetcode;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is the best";
		ReverseWordsInSentence rws = new ReverseWordsInSentence();
		String res= rws.ReverseSentence(s);
		System.out.println(res);
		
	}
	
	public String ReverseSentence(String s){
		String[] sArr = s.split(" ");
		if(sArr.length%2 == 0){
			for(int i=0; i<sArr.length/2;i++){
				for(int j=sArr.length-(i+1); j>=sArr.length/2; j--){
					String temp = sArr[i];
					sArr[i] = sArr[j];
					sArr[j] = temp;
					break;
				}
			}
		} else {
			for(int i=0;i<sArr.length/2; i++){
				for(int j=sArr.length-(i+1); j>=sArr.length/2; j--){
					String temp = sArr[i];
					sArr[i]=sArr[j];
					sArr[j] = temp;
					break;
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		for(String str : sArr){
			sb.append(str+" ");
		}
		
		return sb.toString();
	}

}
