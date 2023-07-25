package ShopOwnerModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ShopOwnerRegistrationTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\Driver\\edgedriver_win64\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://localhost:8080/spring_webmvc_war_exploded/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/p/a[3]")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/form/div/div[4]/label")).click();
		
		driver.findElement(By.name("shopname")).sendKeys("Alom Car Shop");
		driver.findElement(By.name("shopaddress")).sendKeys("Banashree, Dhaka"); 
		driver.findElement(By.name("tradelicense")).sendKeys("3334447777"); 
		driver.findElement(By.name("service")).sendKeys("Car"); 
		driver.findElement(By.name("ownername")).sendKeys("Mr. Alom");
		driver.findElement(By.xpath("//*[@id=\"ownerid\"]")).sendKeys("3334446666");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123");

		
		driver.findElement(By.xpath("//*[@id=\"shop\"]/div/div[8]/input")).click();
		
		Thread.sleep(1000);
		
		String at = driver.getCurrentUrl();
		
		String et = "http://localhost:8080/spring_webmvc_war_exploded/";
		
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
