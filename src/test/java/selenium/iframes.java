package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class iframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		Thread.sleep(1000);
		//driver.switchTo().frame("moneyiframe"); //to fetch value
		//driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("moneyiframe"));
		driver.switchTo().frame(ele);
		
		String money = driver.findElement(By.id("nseindex")).getText();
		System.out.println(money);
		Thread.sleep(1000);
		driver.close();

	}

}
