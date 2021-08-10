package com.seleniun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Manupulation {

public static void main(String[] args) throws Exception {
System.out.println(" hello selenium how r u ? ");
System.setProperty("webdriver.chrome.driver", "C:\\driver_6th_august_cap\\chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
driver.get("https://www.google.co.in/");
String str= driver.getTitle();
System.out.println("page title is : "+ "   " + str);
driver.manage().window().maximize();
WebElement g_search_box=driver.findElement(By.name("q"));
g_search_box.sendKeys("selenium");
Thread.sleep(3000);
WebElement google_search_button= driver.findElement(By.name("btnK"));
google_search_button.click();
Thread.sleep(3000);
String str1= driver.getTitle();
System.out.println("page title is : "+ "   " + str1);
//driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/a/h3")).click();
driver.findElement(By.xpath("/html/body/div[7]/div/div[8]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div[1]/a/h3")).click();
}

}