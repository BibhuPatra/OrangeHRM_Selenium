package com.seleniun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello_Selenium {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		System.out.println("Hello Selenium");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bibhpatr\\Downloads\\Selenium_Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String str1 = driver.getTitle();
		System.out.println("page title is: " + str1);
		driver.manage().window().maximize();
//		driver.findElement(By.name("q")).sendKeys("Selenium");
		WebElement g_search_box = driver.findElement(By.name("q"));
		g_search_box.sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
		String str = driver.getTitle();
		System.out.println("page title is: " + str);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3")).click();
	}

}
