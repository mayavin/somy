package miscallaneous;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		Date d=new Date();
		String v=d.toString();
		System.out.println(v);
		String v2=v.replaceAll(":", "-");
		driver.get("http://www.facebook.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path="./photo/"+v2+".png";
		System.out.println(path);
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
		driver.close();
		

	}

}
