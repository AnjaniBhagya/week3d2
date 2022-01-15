package week3.day2.assignment;

public class FindTypes {

	public static void main(String[] args) {
		String teststr = "$$ Welcome to 2nd Class of Automation $$ ";
		System.out.println("The given string id : '" + teststr + "'");
		char[] arr = teststr.toCharArray();
		int letter = 0, num = 0, space = 0, spchr = 0;

		for (char c : arr) {
			
			if (Character.isLetter(c)) {
				letter++;
			} else if (Character.isDigit(c)) {
				num++;
			} else if (Character.isSpaceChar(c)) {
				space++;
			} else {
				spchr++;
			}

		}
		System.out.println("The number of letters in the given string is : " + letter);
		System.out.println("The number of numbers in the given string is : " + num);
		System.out.println("The number of spaces in the given string is : " + space);
		System.out.println("The number of special characters in the given string is : " + spchr);

	}

}
