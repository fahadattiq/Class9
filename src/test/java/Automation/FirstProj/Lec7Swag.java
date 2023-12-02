package Automation.FirstProj;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lec7Swag {
	
	static WebDriver driver;
	
	@BeforeTest
	public void openswaglink() throws InterruptedException
	{

		System.setProperty("WebDriver.Edge.driver", "D:\\\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	}
	
	@Test
	public void LoginButton()
	{
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button"))).click();
		//driver.findElement(By.id("login-button")).click();
		String expectedHeading = "Epic sadface: Username is required";
    	String heading = driver.findElement(By.xpath("//div[@class='error-message-container error']")).getText();
    	if(expectedHeading.equalsIgnoreCase(heading))
          	System.out.println("The expected heading is same as actual heading --- "+heading);
    	else
          	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
	}
	
	@Test
	public void MaximizePage()
	{
		driver.manage().window().maximize();
	}
	
	@Test
	public void InvalidCred() {
		driver.findElement(By.id("user-name")).sendKeys("standauser");
		driver.findElement(By.id("password")).sendKeys("secrce");
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
	}
	
	@Test
	public void CancelIntimation()
	{
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]")).click();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3/button"))).click();
	}
	
	@Test
	public void ClearplaceHolders()
	{
		driver.findElement(By.id("user-name")).clear();
		driver.findElement(By.id("password")).clear();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
	}
}
