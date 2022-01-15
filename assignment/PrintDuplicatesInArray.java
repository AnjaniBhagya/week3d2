package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.primitives.Ints;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20));
		int a[] = Ints.toArray(arr);
		System.out.println("The given Array of integers is : " + arr);
		System.out.println("");
		Arrays.sort(a);
		arr.clear();
		System.out.println("The sorted Array of integers is : ");
		for (int i = 0; i < a.length; i++)
		{
			arr.add(a[i]);
		}
		System.out.println("");
		System.out.println(arr);
		System.out.println("");
		System.out.println("The duplicated integer numbers in the array are : ");
		for (int i = 0; i < arr.size(); i++)
		{
			for (int j = i + 1; j < arr.size(); j++)
			{
				if (arr.get(i) == arr.get(j)) 
				{
					System.out.print(arr.get(i) + " ");
					continue;
				}
			}

		}

	}

}
