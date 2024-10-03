package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement button = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		WebElement copy = driver.findElement(By.xpath("/html/body/ul/li[3]"));

		Actions act1 = new Actions(driver);
		act1.contextClick(button).moveToElement(copy).click().perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//Thread.sleep(3000);
		driver.close();

	}

}
