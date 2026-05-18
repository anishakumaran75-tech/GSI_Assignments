package assignment11.partB;

import java.util.Arrays;
import java.util.List;

public class Q3_MethodReference {
	public static void main(String[] args) {
		List<String> list= Arrays.asList("A","B","C");
		
		list.forEach(System.out::println);
	}
}
