package org.draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru {public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Jebin Arockia A\\Eclipse-works space jebin\\Driver\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html ");
	
	WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement bankAccount = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	Actions a= new Actions(driver);
	a.dragAndDrop(bank, bankAccount).perform();
	
	WebElement BaAmount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement bankAmount = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	a.dragAndDrop(BaAmount, bankAmount).perform();
	
	WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	WebElement salesPlace = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	a.dragAndDrop(sales, salesPlace).perform();
	
	WebElement salesAmount = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement salesAmountPlace = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	a.dragAndDrop(salesAmount, salesAmountPlace).perform();
	
	
}

}
