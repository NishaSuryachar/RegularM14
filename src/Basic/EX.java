package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX {

	public static void main(String[] args) throws InterruptedException 
	{
		//to open the browser
		WebDriver driver=new ChromeDriver();
		//to maximize the browser
		driver.manage().window().maximize();
		//go to that particular web page
		driver.get("https://demowebshop.tricentis.com/");
		//wait for 2 sec
		Thread.sleep(2000);
		//pass the value to a search text fiels "books"
		driver.findElement(By.className("search-box-text")).sendKeys("power bank");
        //wait for 2 sec
		Thread.sleep(2000);
		//closing the window
		driver.close();

	}

}
