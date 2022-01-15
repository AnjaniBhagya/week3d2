package week3.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		String str1 = "madam";
		int len = str1.length();
		int j = len - 1;
		System.out.println("The given string is: " + str1);
		char[] charArrstr1 = str1.toCharArray();
		char[] rev = new char[5];
		System.out.print("The Reversed string is: ");
		for (int i = len - 1; i >= 0; i--) {
			
			while (j >= 0) {
				rev[j] = charArrstr1[i];
				break;
			}
			System.out.print(rev[j]);
			j--;

		}

	}

}
