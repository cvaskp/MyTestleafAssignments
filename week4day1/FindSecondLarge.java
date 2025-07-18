package week4day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLarge {

	public static void main(String[] args) {
		int[] a= {3,2,11,4,6,7};
		
		List<Integer> array = new ArrayList<>();
		for (int each : a)
		{
			array.add(each);
		}
		Collections.sort(array);
		System.out.println(array);
		int size=array.size();
		System.out.println(array.get(size-2));
	}

}
