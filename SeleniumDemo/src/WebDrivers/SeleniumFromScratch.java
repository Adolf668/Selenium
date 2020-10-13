package WebDrivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFromScratch {
	

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR MENAANU\\Downloads\\aa\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://google.com");
			
		    driver.findElement(By.name("q")).sendKeys("Selenium is a good framework");
		
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//closing of browser
			driver.close();
		

		}
	}



