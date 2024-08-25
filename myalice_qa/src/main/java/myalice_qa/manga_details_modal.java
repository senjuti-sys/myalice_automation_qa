package myalice_qa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class manga_details_modal {

	public static void main(String[] args)throws InterruptedException {
		//3. Manga Details Modal
				//Login
		// Browser_Launch
				System.setProperty("webdriver.firefox.driver", "\"H:\\geckodriver.exe\"");
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
				// Open_Application
				driver.get("https://myalice-automation-test.netlify.app/"); 
				//login
				WebElement Username = driver.findElement(By.id("username"));
				Username.sendKeys("testuser"); 
				WebElement Password = driver.findElement(By.id("password"));
				Password.sendKeys("password");
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/label")).click();
				WebElement Button = driver.findElement(By.id("login-btn"));
				Button.click();
				Thread.sleep(2000);
				//3.1 Click the "Details" link on a manga card.
				WebElement Details = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/p[1]/span"));
				Details.click();
				Thread.sleep(1000);
				//3.2 Image Verify
				WebElement Image = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/img"));
				if(Image.isDisplayed())
				{
					System.out.println("Image is displayed");
				}
				else 
				{
					System.out.println("Image is not displayed");
				}
				//3.3 Name Verify
				WebElement Name = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/h3"));
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Name);
				Thread.sleep(2000);
				//3.4 Summary Verify
				WebElement Summary = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/p"));
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", Summary);
				Thread.sleep(3000);
				//3.5 Close 
				WebElement Close = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div/button"));
				Close.click();
				Thread.sleep(2000);
		        driver.close();
				}
}

