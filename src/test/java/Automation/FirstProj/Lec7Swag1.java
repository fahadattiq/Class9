package Automation.FirstProj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lec7Swag1 extends Lec7Pclass{
	
	@BeforeClass
	public void FormFill() 
	{
	driver.findElement(By.id("first-name")).sendKeys("Fahad");
	driver.findElement(By.id("last-name")).sendKeys("Attqiue");
	driver.findElement(By.id("postal-code")).sendKeys("54000");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();
	}
	
	@AfterSuite
	public void Logout()
	{
	//Explicit Wait
	WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
	w.until(ExpectedConditions.visibilityOfElementLocated(By.id("react-burger-menu-btn"))).click();
	driver.findElement(By.id("logout_sidebar_link")).click();
	}
	
	@Test
	public void CloseallBrowserwindows() {
		driver.close();
	}
	
	}


