package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		SortedSet<Integer> tset1 = new TreeSet<Integer>();
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(3,2,11,4,6,7));
		tset1.addAll(l1);
		System.out.println("The given list of Integers is : ");
		System.out.println(l1);
		int temp = tset1.size();
		l1.addAll(tset1);
		System.out.println("The Second largest integer of the list is : ");
		System.out.println(l1.get(temp-1));
		

	}

}
