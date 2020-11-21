package org.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jebin Arockia A\\Eclipse-works space jebin\\Driver\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		int size = frame.size();
		System.out.println(size);
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		WebElement frame1 = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frame1.click();
		Thread.sleep(5000);
		driver.switchTo().frame(1);
		WebElement frame11 = driver.findElement(By.xpath("(//img[@decoding='async'])[1]"));
		frame11.click();
		//WebElement joinHere = driver.findElement(By.id("//input[@id='awf_field-93653884']"));
		//joinHere.sendKeys("ajitha");
		//WebElement button = driver.findElement(By.xpath("//input[@name='submit']"));
		//button.click();
		
		
		
	}

}
