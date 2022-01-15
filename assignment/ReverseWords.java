package week3.day2.assignment;

public class ReverseWords {

	public static void main(String[] args) {
		String teststr = "I am a software tester";
		System.out.println("The given string is : '" + teststr + "'");
		String[] str = teststr.split(" ");
		System.out.println("");
		System.out.println("The Reversed even words string is : ");
		for (int i = 0; i < str.length; i++) {
			if (i % 2 == 1)
			{
				char[] tempcharArr = str[i].toCharArray();
				for (int j = tempcharArr.length - 1; j >= 0; j--)
				{
					System.out.print(tempcharArr[j]);
				}
				System.out.print(" ");
			}
			else
			{
				System.out.print(str[i] + " ");

			}

		}

	}

}
