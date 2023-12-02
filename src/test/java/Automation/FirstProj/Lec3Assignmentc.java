package Automation.FirstProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lec3Assignmentc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("Webdriver.Edge.driver", "D:\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://www.linkedin.com");
		driver.findElement(By.id("session_key")).sendKeys("sagitarious91@live.com");
		driver.findElement(By.id("session_password")).sendKeys("test1234");
		driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[2]/button")).click();

	}

}
