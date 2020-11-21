package org.movetoelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greens {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Jebin Arockia A\\Eclipse-works space jebin\\Driver\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
	    driver.get("http://www.amazon.in");
	   	    WebElement prime = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
	    Actions a = new Actions(driver);
	    a.moveToElement(prime).perform();
	    Thread.sleep(5000);
	    WebElement click = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
	    click.click();
	}
}
