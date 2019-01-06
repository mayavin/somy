package miscallaneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String s=driver.getWindowHandle();
		System.out.println(s);
		driver.manage().window().maximize();
		
		WebElement w=driver.switchTo().activeElement();
		System.out.println(w);
		w.sendKeys("maya");
		driver.close();

	}

}
