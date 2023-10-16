package n2ex2;

import java.util.List;

public class GenericMethods {
	
	public static <T> void genericMethod(List<T> list) {
		
		for (Object o : list) {
			System.out.println(o);
		}
	}

}