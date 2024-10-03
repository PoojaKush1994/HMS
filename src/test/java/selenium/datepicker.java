package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
	//	driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("01/06/1994"); //for simple way
		//method 2
		String year = "2022";
		String month = "May";
		String day = "23";
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		//select month & year
		
		while(true)
		{
			String cmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String cyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if (cmonth.equals(month)&& cyear.equals(year))
			{
				break;
			}
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}
		
		List<WebElement> alldate = (List<WebElement>) driver.findElement(By.xpath("//table[@class='ui-datepicker-calender']//tbody//tr/td/a"));
		for(WebElement dt:alldate)
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
			}
	}}
	


