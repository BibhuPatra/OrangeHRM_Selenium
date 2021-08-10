package com.seleniun;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtors {
	public static WebDriver driver;
	public 	static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bibhpatr\\Downloads\\Selenium_Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		String str1 = driver.getTitle();
		System.out.println("page title is: " + str1);
	}

}
