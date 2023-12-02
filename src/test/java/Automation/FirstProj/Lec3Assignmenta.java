package Automation.FirstProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lec3Assignmenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("Webdriver.Edge.driver", "D:\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("sagitarious91@live.com");
		driver.findElement(By.id("pass")).sendKeys("test1234");
		driver.findElement(By.name("login")).click();
		

		//driver.close();

	}

}
