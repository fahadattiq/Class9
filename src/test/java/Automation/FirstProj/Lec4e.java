package Automation.FirstProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lec4e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.Edge.driver", "D:\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://daraz.pk");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.className("bld-txt")).click();
		driver.findElement(By.id("topActionDownload")).click();

	}

}
