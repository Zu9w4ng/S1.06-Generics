package n2ex1;

public class GenericMethods {
	
	public static <T> void genericMethod(Persona a, T b, T c) {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}