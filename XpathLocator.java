package projecttwo.TestLuma;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.testng.annotations.Test;

import projecttwo.TestSetUp.SetUp;

public class XpathLocator extends SetUp{
	
	
	@Test
	public void XpathTest() {
	
	String Url = "https://www.google.com";
	driver.get(Url);
	
	library.delay(2.5);
	
	WebElement HomeWork = driver.findElement(By.xpath("//div[contains(@class, \'CcAdNb\')]"));
	
	
	library.highlightElement(HomeWork);
	

	
	library.delay(3);
	
	
	
}
}
