package string.reverse;

public class ReverseStringWithSymbol {
	
	public static void main(String[] args) {
		String inputStr = "@Amrita";
		String resStr = "";
		
		for(int i = inputStr.length()-1; i>=0; i--) {
			char c = inputStr.toLowerCase().charAt(i);		// it will check from 'a' to 'z', uppercase will be skipped if we don't use toLowerCase()
			if(c >= 'a' && c <= 'z') {
				resStr += c;
			}
		}
		
		System.out.println(resStr);
		
		resStr = "";
		for(int i =inputStr.length()-1; i>=0; i--) {
			char c = inputStr.charAt(i);
			if(Character.isLetter(c)) {
				resStr += c;
			}
		}
		System.out.println(resStr);
		
		resStr = "";
		char[] ch = inputStr.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			if(Character.isLetter(ch[i])) {
				resStr += ch[i];
			}
		}
		System.out.println(resStr);
	}

}
