package collection.conversion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {
	
	public static void main(String[] args) {
		Integer[] numArr = {1, 2, 3, 2, 4, 1, 5};
		List list = Arrays.asList(numArr);
		System.out.println(list);
		Collections.sort(list);
	}

}
