import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextPage {

	@Test
	public void test(WebDriver ff) {
		
		System.out.println("Start - Naxt Page");
		WebElement npWebElement = null;
		npWebElement=ff.findElement(By.linkText("Next Page"));
		npWebElement.click();
		
		
		Assert.assertEquals("ERROR: Title in my web site", "Next Page", ff.getTitle());

		
		npWebElement=ff.findElement(By.tagName("button"));
		npWebElement.click();

		Assert.assertEquals("ERROR: Title in my web site", "Finish", ff.getTitle());

		
		
	}

}
