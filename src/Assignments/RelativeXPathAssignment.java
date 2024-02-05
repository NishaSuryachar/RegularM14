package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPathAssignment {
	public static WebDriver driver;
	public static String given_url="https://demowebshop.tricentis.com/25-virtual-gift-card";
	public static void chromeBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void closeBrowser()
	{
		driver.close();
	}
	public static void openDWS() throws InterruptedException
	{
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement element = driver.findElement(By.xpath("//h2[@class='topic-html-content-header']"));
		if(element.isDisplayed())
		{
			System.out.println("you are in Welcome to our store page");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
			Thread.sleep(2000);
			String current_url=driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl());
			if(given_url.equals(current_url))
			{
				System.out.println("you are in Virtual Gift Card page");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientName']")).sendKeys("Nisha M S");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientEmail']")).sendKeys("Nishams1902@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='giftcard_2.SenderName']")).sendKeys("Nisha");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='giftcard_2.SenderEmail']")).sendKeys("Nishams1902@gmail.com");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//textarea[@ id='giftcard_2_Message'] ")).sendKeys("may this year brings you lot of happiness and joy Happy Advance x-mas and Advance happy new year");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).clear();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='addtocart_2_EnteredQuantity']")).sendKeys("4");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[@class='cart-label']")).click();
				WebElement shopping_cart = driver.findElement(By.xpath("//div[@class='page-title']"));
				if(shopping_cart.isDisplayed())
				{
					System.out.println("you are in shopping cart page");
					driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//input[@name='updatecart']")).click();
				}
				else
				{
					System.out.println("you are not in shopping cart page");
				}
			}
			else
			{
				System.out.println("you are not in Virtual Gift Card page");
			}
		}
		else
		{
			System.out.println("you are not Welcome to our store page");
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{
		chromeBrowser();
		openDWS();
		closeBrowser();
	}
}
