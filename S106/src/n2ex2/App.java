package n2ex2;

import java.util.List;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<Object>();
		list.add(new Persona("Javier", "González", 53));
		list.add(5);
		list.add("Hello World!");
		list.add(list);
		
		GenericMethods.genericMethod(list);

	}

}
