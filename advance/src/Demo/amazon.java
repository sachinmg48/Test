package Demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazon {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.xpath("(//img[@alt='Apple iPhone 14 128GB (Product) RED'])[2]"))
		.click();
		Thread.sleep(2000);
		String pid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		allid.remove(pid);
		for(String id:allid)
		{
			driver.switchTo().window(id);
			
		} 
		WebElement ele = driver.findElement(By.xpath("//span[.=' Inclusive of all taxes']/../..//div[1]//span[2]//span[2]//span[2]"));
		String text = ele.getText();
		System.out.println(text);
		String amt="75,990";
		String amt1=amt.replaceAll(",","");
		int value=Integer.parseInt(amt1);
		System.out.println(value);
	}
}
