package pagesourcenurl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String ps=driver.getPageSource();
		System.out.println(ps);
		
		driver.quit();

	}

}
