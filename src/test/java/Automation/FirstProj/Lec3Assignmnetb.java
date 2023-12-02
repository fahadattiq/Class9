package Automation.FirstProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lec3Assignmnetb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("Webdriver.Gecko.driver", "D:\\geckodriver-v0.33.0-win-aarch64");
		driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com");
		driver.findElement(By.id("session_key")).sendKeys("sagitarious91@live.com");
		driver.findElement(By.id("session_password")).sendKeys("test1234");
		driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[2]/button")).click();
		

	}

}
