package myalice_qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class automation_task {

	public static void main(String[] args) throws InterruptedException{
		//1. Browser_Launch
		System.setProperty("webdriver.firefox.driver", "\"H:\\geckodriver.exe\"");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//1. Open_Application
		driver.get("https://myalice-automation-test.netlify.app/"); 
		//1.1 Login_Functionality
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("testuser"); 
		Thread.sleep(2000);
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("password");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/label")).click();
		Thread.sleep(2000);
		WebElement Button = driver.findElement(By.id("login-btn"));
		Button.click();
		//2. Manga_Search and Display
		//2.1. Naruto
		WebElement Search = driver.findElement(By.xpath("//*[@id=\"manga-search\"]"));
		Search.sendKeys("Naruto");
		Thread.sleep(2000);
		WebElement SearchButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/button"));
		 SearchButton.click();
		 Thread.sleep(2000);
		 Search.clear();
		 Thread.sleep(1000);
		//2.2. Open Piece
		Search.sendKeys("One Piece");
		Thread.sleep(1000);
		SearchButton.click();
		Thread.sleep(2000);
		Search.clear();
		Thread.sleep(1000);
		//2.3. Seven Deadly Sins
		Search.sendKeys("Seven Deadly Sins");
		Thread.sleep(1000);
		SearchButton.click();
		Thread.sleep(2000);
		Search.clear();
		Thread.sleep(1000);
		//2.4. A random Term
		Search.sendKeys("ABC");
		Thread.sleep(1000);
		SearchButton.click();
		Thread.sleep(2000);
		Search.clear();
		driver.navigate().refresh();
		}
	}
