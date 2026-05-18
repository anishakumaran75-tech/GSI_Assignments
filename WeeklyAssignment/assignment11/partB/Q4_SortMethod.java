package assignment11.partB;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q4_SortMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(40, 10, 30, 20);
		
		Collections.sort(list);
		
		list.forEach(System.out::println);
	}

}
