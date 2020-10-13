package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR MENAANU\\Downloads\\aa\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://amalitech.com");
	
		// to maximize browser
		
	    driver.manage().window().maximize();
		
		// title
		String title=driver.getTitle();
		
		System.out.println("The title of the page is "+title);  //NB: You can even ignore the String initialization  and just write driver.getTitle();
		//and it will still work.
		
		//close 
		driver.close();
	

	}
}
