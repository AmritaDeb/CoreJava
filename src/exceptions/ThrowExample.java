package exceptions;

public class ThrowExample {
	
	public static void customExeption(int age) {
		try {
			if(age < 18) 
				throw new CustomInvalidAgeException();
			else
				System.out.println("Age " + age + " is valid");
		} catch(CustomInvalidAgeException e) {
			System.out.println("Age " + age + " is not valid");
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		customExeption(10);
		customExeption(20);
		
	}

}
