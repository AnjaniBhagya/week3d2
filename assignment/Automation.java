package week3.day2.assignment;

public class Automation extends MultipleLanguages {

	public static void main(String[] args) 
	{
		Automation obj = new Automation();
		obj.java();
		obj.selenium();
		obj.python();
		obj.ruby();

	}

	public void selenium() {
		System.out.println("This is Selenium Language");
		
	}

	public void java() {
		System.out.println("This is Java Language");
		
	}

	@Override
	void ruby() {
		System.out.println("This is Ruby Language of class Automation");
		
	}
	

}
