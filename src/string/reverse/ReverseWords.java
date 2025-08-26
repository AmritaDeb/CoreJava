package string.reverse;

import java.util.ArrayList;
import java.util.List;

public class ReverseWords {
	
	public static void main(String[] args) {
		String str = "My Country is India";
		String result = "";
		String result1 = "";
		
		String[] words = str.split(" ");
		
		// String array
		
		for(int i=words.length-1; i>=0; i--) {
			result += words[i] + " ";
		}
		System.out.println(result);
		
		// ArrayList
		
		List list = new ArrayList();
		for(int i=words.length-1; i>=0; i--) {
			list.add(words[i]);
		}
		System.out.println(list);
		
		result1 = String.join(" ", list);
		System.out.println(result1);
	}

}
