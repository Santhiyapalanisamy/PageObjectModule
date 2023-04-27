package AdactinPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactinbase {
	public static WebDriver driver;
	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
	       driver = new ChromeDriver();
	     driver.get(url);
}
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	public static void dropDown(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static void button(WebElement element) {
		element.click();
	}
	public static void inputText(WebElement element,String text) {
		element.sendKeys(text);
	}
	public static void outputText(WebElement element) {
		System.out.println(element.getText());
	}
	public static void outputAttribute(WebElement element) {
		System.out.println(element.getAttribute("value"));
	}
	
	public static void quit() {
		driver.quit();
	}
	
}


