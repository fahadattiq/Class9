package Automation.FirstProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lec4a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.Edge.driver", "D:\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=33412D9DBB5CF4FF433188A834D0100C?signonForm");
		Thread.sleep(2000);
		//Partial Link Text 
		driver.findElement(By.partialLinkText("Register")).click();
		//Name
		driver.findElement(By.name("account.firstName")).sendKeys("Fahad Attique");
		Thread.sleep(2000);
		//Link text, 
		driver.findElement(By.linkText("Sign In")).click();
		//Tag name
		driver.findElement(By.tagName("input")).sendKeys("testing");
		Thread.sleep(2000);
		//ID, Class name

	}

}
