package week3.day2.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		List<Integer> li1 = new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		List<Integer> li2 = new ArrayList<Integer>(Arrays.asList(1, 2, 8, 4, 9, 7));
		System.out.println("The given two Arrays are : ");
		System.out.print(li1);
		System.out.println(" ");
		System.out.print(li2);
		System.out.println(" ");
		System.out.println("The Intersection Array is :  ");
		li2.retainAll(li1);
		System.out.println(li2);
	}
}
