package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();

        Thread.sleep(5000);
		//driver.findElement(By.linkText("Female")).click();
	//	driver.findElement(By.xpath("//input[contains(@id,'u_3_4')]")).click();
		//driver.findElement(By.xpath("//input[starts-with(@id,'u_2_4')]")).click();
	
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pooja");
		
	//	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
					
		//Xpath with text()
		
     driver.findElement(By.xpath("//label[text()='Female']")).click(); //running
	    
		//xpath with contains()
		
       driver.findElement(By.xpath("//input[contains(@id,'u_2_4')]")).click(); //running

		//driver.findElement(By.xpath("//input[starts-with(@id,'u_0_4')]")).click();
        Thread.sleep(2000);
        driver.close();
	}

}
