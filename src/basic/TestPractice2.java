package basic;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class TestPractice2 {
	
	
	public static void main(String[] args) {
		
		String s1 = "Amrita";
		String s2 = new String("Amrita");
		String s3 = "Amrita";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
//		try {
//			throw new CustomException();
//		} catch (AssertionError e) {
//			
//		} catch (CustomException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
