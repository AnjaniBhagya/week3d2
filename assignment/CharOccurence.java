package week3.day2.assignment;

public class CharOccurence {
	public int occurence(String inputstr,char checkchar)
	{
		char[] charArr = inputstr.toCharArray();
		int count=0;
		int i=0;
		while(i<charArr.length)
		{
			if(charArr[i] == checkchar)
			{
				count++;
			}
			i++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		String str = "welcome to chennai";
		char chk = 'e';
		System.out.println("The given string is : "+str);
		CharOccurence obj = new CharOccurence();
		System.out.println("The letter " + chk+" in the given string occurs : ");
		System.out.println(obj.occurence(str, chk)+" times");
		
		

	}

}
