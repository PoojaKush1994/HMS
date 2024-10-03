package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement inputbox = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','pooja')",inputbox);
		WebElement button = driver.findElement(By.xpath("//*[@id=\"female\"]"));
		js.executeScript("arguments[0].click()", button);
		
		String domain = (String) js.executeScript("return document.domain;");
		System.out.println(domain);
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		js.executeScript("alert('Alert message to.');");
		

	}

}
