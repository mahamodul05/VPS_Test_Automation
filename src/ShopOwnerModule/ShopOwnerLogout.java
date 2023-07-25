package ShopOwnerModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ShopOwnerLogout {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\Driver\\edgedriver_win64\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://localhost:8080/spring_webmvc_war_exploded/");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/p/a[3]")).click();
		
		driver.findElement(By.name("ownerid")).sendKeys("2223334444");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/form/div/div[3]/input")).click();
		driver.findElement(By.xpath("/html/body/div/ul/li[3]/a")).click();
		
		
		String at = driver.getCurrentUrl();
		
		String et = "http://localhost:8080/spring_webmvc_war_exploded/workshop/registration";
		
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
