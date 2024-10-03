package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;

public class colour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://blazedemo.com/");
		WebElement e = driver.findElement(By.xpath("/html/body/div[3]/form/div/input"));
		String backc = e.getCssValue("background-color");
		System.out.println(backc);
		String bgc = Color.fromString(backc).asHex();
		System.out.println(bgc);
		if(backc==bgc)
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("not same");
		}

	}

}
