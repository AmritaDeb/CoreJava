package string.misc;

public class WordRotationTest {
	
	public static boolean checkRotation(String input1, String input2) {
		
		if(input1 == null || input2 == null || input1.length() != input2.length()) {
			return false;
		}
		
		String temp ="";
		for(int i=input1.length()-1; i>=0; i--) {
			temp += input1.charAt(i);
		}
		if(temp.equalsIgnoreCase(input2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(checkRotation("abc", "cba"));
		System.out.println(checkRotation("waterbottle", "erbottlewat"));
		System.out.println(checkRotation("abc", "cbaaa"));
		System.out.println(checkRotation("abc", null));
		System.out.println(checkRotation("noon", "noon"));
	}

}
