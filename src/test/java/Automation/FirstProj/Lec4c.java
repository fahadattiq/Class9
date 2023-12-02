package Automation.FirstProj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Lec4c {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("Webdriver.Edge.driver", "D:\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://candymapper.com/");
		//1-#id
		//2-tagname.classname
		//3-tagname#id
		//4-Tagname[attribute=’value’]

		driver.manage().window().maximize();
		Thread.sleep(5000);
		// css by #id
		driver.findElement(By.cssSelector("#popup-widget37723-close-icon")).click();
		Thread.sleep(3000);
		// css by tagname[attribute='value']
		driver.findElement(By.cssSelector("a[data-typography='NavAlpha']")).click();
		//css by tagname[attribute='value']
		driver.findElement(By.cssSelector("p[data-typography='BodyAlpha']")).click();
		Thread.sleep(2000);
		//tagname#id
		driver.findElement(By.cssSelector("img#logo-37635")).click();
		//tagname.classname
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div.goog-te-gadget-simple")).click();
		

	}

}
