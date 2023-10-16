package n1ex2;

public class App {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Javier", "González", 53);
		int a = 5;
		String str = "Hello World!";
		
		GenericMethods.genericMethod(persona, a, str);

	}

}
