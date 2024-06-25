package testingbaba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testingbaba {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testingbaba.com/old/");
		driver.manage().window().maximize();
		
		
	}
}
