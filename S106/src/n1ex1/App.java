package n1ex1;

public class App {

	public static void main(String[] args) {
	
		String one = "hello";
		String two = "world";
		String three = "Java";
		
		NoGenericMethods object = new NoGenericMethods(one, two, three);
		NoGenericMethods object2 = new NoGenericMethods(two, three, one);
		
		System.out.println(object);
		System.out.println(object2);
	}

}
