package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ifzal_3ejrqkt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("kumkum");
		driver.findElement(By.id("pass")).sendKeys("hello123");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.findElement(By.id("error_box")).getText());
		driver.findElement(By.className("_97w4")).click();
		driver.findElement(By.linkText("Try Again")).click();
		driver.findElement(By.id("identify_email")).sendKeys("9625645897");
		driver.findElement(By.id("did_submit")).click();
		
		
		
		
	}

	private static void sendKeys(String string) {
		// TODO Auto-generated method stub
		
	}

}
