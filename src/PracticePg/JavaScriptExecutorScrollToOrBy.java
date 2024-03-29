package PracticePg;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorScrollToOrBy {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,1000);");
		  Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,-1000);");
        Thread.sleep(1000);
        driver.close();
        
        
//        js.executeScript("window.scrollBy(0,1000);");
//        Thread.sleep(2000);
//        js.executeScript("window.scrollBy(0,-1000);");
	}

}
