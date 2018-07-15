package leetcode;

public class StringToInteger {
	
	public static void main(String[] args) {
		StringToInteger sti = new StringToInteger();
		int res = sti.myAtoi("+");
		System.out.println(res);
		
	}
	
public int myAtoi(String str) {
        if(str.length() == 0 || str == "+" || str == "-"){
        	return 0;
        }
        char[] ch = str.toCharArray();
        String res = "";
        for(int i=0 ;i < ch.length; i++){
            if(ch[i] != ' '){
            	if(ch[i] >= 65 && ch[i]<= 122){ //words
            		res = "0";
            		break;
            	} else if(ch[i] >= 48 && ch[i]<=57){ 
            		String s = str.substring(i, ch.length);
            		String[] ss = s.split(" ");
            		res = ss[0];
            		break;
            	} else if(ch[i] == '-'){
            		String s = str.substring(i, ch.length);
            		String[] ss = s.split(" ");
            		res = ss[0];
            		break;
            	} else if(ch[i] == '+'){
            		String s = str.substring(i, ch.length);
            		String[] ss = s.split(" ");
            		res = ss[0];
            		break;
            	} else if(ch[i] == '.'){
            		res = "0";
            	}
            	break;
            }           
        }
        int result = 0;
        if(res.length() > 10 ){
        	if(res.charAt(0) == '-'){
        		if(res.charAt(1) > 50){
        			result = Integer.MIN_VALUE;
        		}
        	} else if(res.charAt(0) > 50){
        		result = Integer.MAX_VALUE;
        	}
        } else if(res.contains(".")){
        	result = 0;
        } else if(res.length() == 0){
        	result = 0;
        }
        else {
        	result = Integer.parseInt(res);
        }
        
        
        return result;
        
}

public int StringToIntConverter(String s){
	String str = s.trim();
	int range = str.indexOf(' ');
	if(range != -1){
		str = str.substring(0,range);
	}
	
	StringBuilder sb = new StringBuilder();
	char ch;
	for(int i=0;i<str.length();i++){
		ch = str.charAt(i);
		if(i == 0 & (ch == '-' | ch == '+')){
			sb.append(ch);
			continue;
		}
		if(Character.isDigit(ch)){
			break;
		}
		
		sb.append(ch);
	}
	
	if(sb.length() == 0 | sb.toString().equalsIgnoreCase("-") | sb.toString().equalsIgnoreCase("+")){
		return 0;
	}
	
	return (int)Double.parseDouble(sb.toString());
	
	
	//return null;
}

}
