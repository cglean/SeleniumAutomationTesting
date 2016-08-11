package springMusic;

import java.util.Properties;

import javax.activation.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class springMusic {

	public static void main(String[] args) throws InterruptedException {
		{
			WebDriver driver = new FirefoxDriver();

			driver.navigate().to("http://shows.cfapps.io/");
			driver.manage().window().maximize();
			Thread.sleep(1000);

			driver.findElement(
					By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li/a"))
					.click();

			driver.findElement(By.id("loadButton")).click();
			Thread.sleep(10000);

			driver.findElement(By.id("loadButton")).click();

			driver.findElement(
					By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul/li[2]/a"))
					.click();
			Thread.sleep(10000);

			driver.findElement(
					By.cssSelector("div[id$='bs-example-navbar-collapse-1']>ul>li:nth-child(3)>a"))
					.click();
			Thread.sleep(1000);

			driver.findElement(By.xpath("//a[text()[contains(.,'Refresh')]]"))
					.click();
			Thread.sleep(10000);

			driver.findElement(By.id("loadButton")).click();
			Thread.sleep(10000);

			driver.findElement(
					By.xpath("//a[text()[contains(.,'Stop Simulation')]]"))
					.click();
			Thread.sleep(1000);

			WebElement shows = driver.findElement(By
					.cssSelector("div[id$='bluegreenBlock']>p"));


			String showcount = shows.getText();

			System.out.print(showcount);
			
			String[] splitStr = showcount.split("\\s+");
			
			String results = "";
			if(Integer.parseInt(splitStr[2])>5){
				results = "PASS";
			}else{
				results = "FAIL";
			}



			driver.close();
		}
	}

}
