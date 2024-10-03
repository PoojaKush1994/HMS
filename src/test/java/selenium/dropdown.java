package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		WebElement month = driver.findElement(By.id("month"));
		Select st = new Select(day);
		st.selectByVisibleText("20");
		Thread.sleep(3000);

		Select st1 = new Select(month);
		st1.selectByVisibleText("Apr");
		Thread.sleep(3000);

		Select st2 = new Select(year);
		st2.selectByVisibleText("1994");
		Thread.sleep(3000);

		
	}

}
