package testNG;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.Action;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class faceboook extends genric1
{


@Test
public void test() throws InterruptedException, AWTException
{
	driver.get("https://www.amazon.in");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_SPACE);
	r.keyRelease(KeyEvent.VK_ALT);
	r.keyRelease(KeyEvent.VK_SPACE);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_N);
	Thread.sleep(2000);
	driver.manage().window().maximize();
    Thread.sleep(2000);
    org.openqa.selenium.Dimension dimension = new org.openqa.selenium.Dimension(200, 400);
    driver.manage().window().setSize(dimension);
    org.openqa.selenium.Point p = new org.openqa.selenium.Point(200, 500);
    driver.manage().window().setPosition(p);
    
	
	
	
	
	
	
}
}