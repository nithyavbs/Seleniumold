package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsCh5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		Actions a = new Actions(driver);
		WebElement mouseOver = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		a.moveToElement(mouseOver).perform();
		driver.findElement(By.xpath("//a[text()='Weight Gainers']")).click();
	}

}
