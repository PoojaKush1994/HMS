package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		WebElement fra = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(fra);
		WebElement field = driver.findElement(By.xpath("//*[@id=\"field1\"]"));
		field.clear();
		Actions act = new Actions(driver);
		field.sendKeys("Pooja");
		act.doubleClick(driver.findElement(By.xpath("/html/body/button"))).build().perform();

	}

}
