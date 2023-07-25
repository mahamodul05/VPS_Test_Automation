package CustomerModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CustomerLoginCheckTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\Driver\\edgedriver_win64\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://localhost:8080/spring_webmvc_war_exploded/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/p/a[2]")).click();
		
		driver.findElement(By.name("customerid")).sendKeys("5552229999");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/form/div/div[3]/input")).click();
		
		String at = driver.getCurrentUrl();
		
		String et = "http://localhost:8080/spring_webmvc_war_exploded/customer/customerlogin";
		
		driver.close();
		
		if(at.equalsIgnoreCase(et))
		{
			System.out.print("Successful");
		}
		else
		{
			System.out.println("Unsuccessful");
		}
	}

}
