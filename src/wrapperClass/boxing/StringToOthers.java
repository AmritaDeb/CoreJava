package wrapperClass.boxing;

public class StringToOthers {
	
	public static void main(String[] args) {
		int a = Integer.parseInt("0101");
		System.out.println(a);
		
		Integer a1 = 111;
		String s = a1.toString();
		System.out.println(s.getClass());
	}

}
