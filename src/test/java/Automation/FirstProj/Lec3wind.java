package Automation.FirstProj;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Lec3wind {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("Webdriver.Edge.driver", "D:\\edgedriver_win64");
		driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parenthandle = driver.getWindowHandle();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> twohandles = driver.getWindowHandles();
		//System.out.println(twohandles); // The way how you printout the windows handles and proceed as per your need.
		//Thread.sleep(2000);
		for (String dle :twohandles){// because it stores the two values of handles.
			
			if(!dle.equals(parenthandle))
			{
				driver.switchTo().window(dle);
				driver.findElement(By.id("firstName")).sendKeys("Fahad Attique");
				Thread.sleep(2000);
		}

		}
		driver.switchTo().window(parenthandle);
		driver.findElement(By.id("name")).sendKeys("Window Handler");
		Thread.sleep(5000);
		driver.quit();

}
}
