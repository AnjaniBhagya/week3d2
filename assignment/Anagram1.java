package week3.day2.assignment;

import java.util.Arrays;

public class Anagram1 {
	
	public String method1(String inputstr)
	{
		char arr[] = inputstr.toCharArray();
		char temp;
		int i=0;
		while (i<arr.length)
		{
			int j=i+1;
			while(j<arr.length)
			{
				if (arr[j]<arr[i])
				{
					 temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
				}
				j++;
			}
			i++;
		}
		return new String(arr);
	}
	
	public String method2(String inputstr )
	{
		char temparr[] = inputstr.toCharArray();
		Arrays.sort(temparr);
		return new String(temparr);
	}

	public static void main(String[] args) {
		String str1="stops";
		System.out.println("The first given string is: " + str1); 
		String str2="potss";		
		System.out.println("The second given string is: " + str2);
		Anagram1 strobj = new Anagram1();
		System.out.println("");
		System.out.println("Using Arrays.sort :");
		System.out.println("The sorted first string is: " + strobj.method2(str1)); 
		System.out.println("The sorted second string is: " + strobj.method2(str2));
		System.out.println("");
		System.out.println("Using Conditional loops :");
		System.out.println("The sorted first string is: " + strobj.method1(str1));
		System.out.println("The sorted second string is: " + strobj.method1(str2));
	}

}
