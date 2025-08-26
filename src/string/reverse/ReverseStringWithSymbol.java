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
		
		
	}

}
