package AdminModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AdminLogoutTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","D:\\Selenium\\Driver\\edgedriver_win64\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://localhost:8080/spring_webmvc_war_exploded/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/p/a[1]")).click();
		driver.findElement(By.name("uname")).sendKeys("admin");
		driver.findElement(By.name("psw")).sendKeys("123");
		driver.findElement(By.xpath("/html/body/section/div/form/input")).click();
		
		driver.findElement(By.xpath("/html/body/div/ul/li[2]/a")).click();
		
		String at = driver.getCurrentUrl();
		
		String et = "http://localhost:8080/spring_webmvc_war_exploded/admin/login";
		
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
