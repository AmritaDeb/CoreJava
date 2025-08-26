package string.reverse;

public class ReverseStringUsingStringBuilder {
	
	public static void main(String[] args) {
		String input = "kolkata";
		String result1 = "";
		
		StringBuilder builder = new StringBuilder(input);
		result1 = builder.reverse().toString();
		
		System.out.println(result1);
	}

}
