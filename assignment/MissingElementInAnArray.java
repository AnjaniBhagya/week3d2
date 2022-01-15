package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args)
	{
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		System.out.println("The given array is : ");
		System.out.println(arr);
		System.out.println("The missing elemnt in the given Array is : ");
		for(int i=0;i<arr.size();i++)
		{
			if((i+1) != arr.get(i))
			{
				System.out.println(i+1);
				
				break;
			}
		}
	}

}
