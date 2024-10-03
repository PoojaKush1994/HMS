package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Statictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		//for getting count of row
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println(row);
		//for getting count of row
		int colomn = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(colomn);
		//read the element of the table
		String data =driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
		System.out.println(data+" ");
		//read all data from table
		for(int r=2; r<=row;r++)
		{
			for(int c=1; c<=colomn; c++)
			{
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+" ");
			}
			System.out.println();
			
		}

	}

}
