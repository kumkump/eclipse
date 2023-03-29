package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selfintro {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ifzal_3ejrqkt\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//invoking the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		

	}

}
