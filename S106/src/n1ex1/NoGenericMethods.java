package n1ex1;

import java.util.ArrayList;

public class NoGenericMethods {
	
	private ArrayList<String> strings = new ArrayList<String>();

	public NoGenericMethods(String first, String second, String third) {
		super();
		strings.add(first);
		strings.add(second);
		strings.add(third);
	}
	
	public String getFirst() {
		return strings.get(0);
	}
	
	public String getSecond() {
		return strings.get(1);
	}
	
	public String getThird() {
		return strings.get(2);
	}
	
	
	public void setFirst(String newFirst) {
		strings.set(0, newFirst);
	}
	
	public void setSecond(String newSecond) {
		strings.set(1, newSecond);
	}
	
	public void setThird(String newThird) {
		strings.set(2, newThird);
	}

	@Override
	public String toString() {
		return "NoGenericMethods [strings=" + strings + "]";
	}
	
	
	
}
