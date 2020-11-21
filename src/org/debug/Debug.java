package org.debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Jebin Arockia A\\Eclipse-works space jebin\\Driver\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("ajitha");
		WebElement userPass = driver.findElement(By.id("pass"));
		userPass.sendKeys("asdfghjk");
		WebElement button = driver.findElement(By.id("u_0_b"));
		button.click();
		Thread.sleep(3000);
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
	}

}
