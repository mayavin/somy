package miscallaneous;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		int s=driver.getWindowHandles().size();
		System.out.println(s);
		driver.quit();
		
		//or
		
		WebDriver d= new ChromeDriver();
		d.get("http://www.naukri.com/");
		Set<String> st=d.getWindowHandles();
		int i=st.size();
		System.out.println("no of window is"+ i);
		driver.quit();
		

	}

}
