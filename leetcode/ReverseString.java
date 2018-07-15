package leetcode;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		String s = "Code";
		String resI = rs.StringReverseIterative(s);
		String resR = rs.StringReversRecurrsive(resI, 0, s.length()-1);
		//System.out.println("resI: "+resI);
		System.out.println("resR: "+resR);
	}
	
	public String StringReverseIterative(String s){
		char[] ch = s.toCharArray();
		if(s.length()%2 == 0){
			for(int i=0; i<s.length()/2;i++){
				for(int j=s.length()-(i+1);j>=s.length()/2;j--){
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
					break;
				}
			}
			return String.valueOf(ch);
		} else {
			for(int i=0;i<s.length()/2; i++){
				for(int j=s.length()-(i+1); j>=s.length()/2;j--){
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
					break;
				}
			}
			return String.valueOf(ch);
			
		}
	}
	
	public String StringReversRecurrsive(String s,int from, int to){
		if(s == null){
			return null;
		}
		if(s.length()%2==0){
			if(from < s.length()/2)
				StringReversRecurrsive(s, from+1, to-1);
		} else {
			if(from < s.length()/2)
				StringReversRecurrsive(s, from+1, to-1);
		}
		
		return s;
	}

}
