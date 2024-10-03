package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.navigate().to("https://meet.google.com/unm-eicn-wnk");
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String S1 = "Google";
		
		if(title.equals(S1))
		{
			System.out.println("Title is Same");
		}
		
		else 
		{
			System.out.println("Title not matched");
		}
		
		System.out.println(driver.getCurrentUrl());
		
	    Thread.sleep(5000);  //wait
		
		driver.close();		
	}

}
