package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		// -HaseSet is more fast, but can't sort
		//Set<String> set = new HashSet<>();
		
		// -TreeSet is slow, but can sort
		//Set<String> set = new TreeSet<>();
		
		// -LinkedHashSet = average speed, and sort the elements in order they are added
		Set<String> set = new LinkedHashSet<>();
			
		
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		
		// -If contains = true, else = false
		//System.out.println(set.contains("Notebook"));
			
		// -To remove something from the list
		set.removeIf(x -> x.charAt(0) == 'T');
		
		
		
		
		for (String p : set) {
			System.out.println(p);
		}
	}

}

