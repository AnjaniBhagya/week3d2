package week3.day2.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	
	
	public static void main(String[] args)
	{
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver(); driver.get("https://www.ajio.com/");
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 * driver.manage().window().maximize(); driver.findElement(By.xpath(
		 * "//div[@id='react-autowhatever-1']/preceding-sibling::input")).sendKeys(
		 * "bags",Keys.ENTER); driver.findElement(By.id("Men")).click(); try {
		 * Thread.sleep(2000); } catch (Exception e) { // TODO: handle exception }
		 * driver.findElement(By.xpath("//label[@for='Men']")).click();
		 * driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		 * try { Thread.sleep(2000); } catch (Exception e) { // TODO: handle exception }
		 * String bagsnum = driver.findElement(By.className("length")).getText();
		 * System.out.println("Total bags : " + bagsnum);
		 * driver.findElement(By.xpath("(//div[@class='facet-head '])[2]")).click();
		 * driver.findElement(By.xpath("(//div[@id='verticalsizegroupformat'])[2]")).
		 * click();
		 */
		
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		// Loads a new web page in the current browser window
		// Maximise the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.ajio.com/");
		//In the search box, type as "bags" and press enter
		
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		//driver.findElement(By.id("Men")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Print the count of the items Found.
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
        //Get the list of brand of the products displayed in the page and print the list.
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("name"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		
	}

}
