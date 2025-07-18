package week4day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListClass {
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,10,6,8};
		Arrays.sort(a);
		List <Integer> array = new ArrayList<>();
		for (int each : a)
		{
			array.add(each);
		}
		
		for (int i=0; i<array.size()-1; i++)
		{
			if(array.get(i)+1!=array.get(i+1))
			{
				
				System.out.print(array.get(i)+1);
			}
		}

	}

}
