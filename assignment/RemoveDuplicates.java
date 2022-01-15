package week3.day2.assignment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("The given string is : ");
		System.out.println(text);
		String[] newArr = text.split(" ");
		Set<String> s1= new LinkedHashSet<String>();
		for (int i = 0; i < newArr.length; i++)
		{
			s1.add(newArr[i]);
		}
		Iterator<String> it= s1.iterator();
		System.out.println("");
		System.out.println("The string without any duplicates is : ");
		while (it.hasNext())
		{
			System.out.print(it.next()+" ");
			
		}
	}

}
