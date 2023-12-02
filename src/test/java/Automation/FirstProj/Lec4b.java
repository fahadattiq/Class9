package Automation.FirstProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lec4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.Edge.driver", "D:\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://demo.applitools.com/app.html");
		//tagname[attribude=value]
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Testing");
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-sm']")).click();

		

	}

}
