package fbloginpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) {
		
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\AUTOMATION\\SELENIUM\\chromedriver_win32\\chromedriver.exe");
		
		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		// Navigate to the Facebook login page using GET method
		driver.get("https://www.facebook.com");
		
		//Using the navigate method
		//driver.navigate().to("https://www.facebook.com");
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//Minimize the window
		//driver.manage().window().minimize();
		
		WebElement Emailaddressorphonenumber = driver.findElement(By.name("email"));
		Emailaddressorphonenumber.sendKeys("123456789");
		
	}

}
