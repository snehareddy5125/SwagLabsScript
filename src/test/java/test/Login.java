package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
	public static WebDriver driver;
	public String URL = "https://www.saucedemo.com/";
	public String username = "standard_user";
	public String pass = "secret_sauce";

	@BeforeClass
	public void getBrowserurl() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);

	}

	@Test
	public void login() throws InterruptedException {
		WebElement Username =driver.findElement(By.id("user-name"));
		Username.click();
		Username.clear();
		Username.sendKeys(username);
		Thread.sleep(3000);
		
		WebElement Password =driver.findElement(By.id("password"));
		Password.click();
		Password.clear();
		Password.sendKeys(pass);
		Thread.sleep(3000);
		
		WebElement login =driver.findElement(By.id("login-button"));
		login.click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
	}

}
