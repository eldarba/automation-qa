package app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

class HomePage {

	@Test
	void test(WebDriver driver) throws InterruptedException {
		// variables
		String expected, actual, message;

		// test the page title
		expected = "Automation Project";
		actual = driver.getTitle();
		message = "ERROR: web site page title";
		assertEquals(expected, actual, message);

		// more variables
		WebElement element = null;

		// test the first h1 element
		element = driver.findElement(By.tagName("h1"));
		// test the page title
		expected = "Student Details";
		actual = element.getText();
		message = "ERROR: web site first header - h1";
		assertEquals(expected, actual, message);

		// find named element
		element = driver.findElement(By.name("fname"));
		// send keys
		element.sendKeys("Eldar");

		// get the Math radio
		element = driver.findElement(By.id("m"));
		element.click();

		// looking for non existent element - will exit the test with an Error
		// element = driver.findElement(By.id("p"));
		// element.click();

		// get the Jerusalem option
		element = driver.findElement(By.id("JE"));
		element.click();

		// using links to navigate
		TimeUnit.SECONDS.sleep(3);
		element = driver.findElement(By.linkText("Next Page"));
		element.click();
		TimeUnit.SECONDS.sleep(3);
		driver.navigate().back();

		System.out.println("==========================");
		// lists
		{
			List<WebElement> elements = driver.findElements(By.tagName("h1"));
			for (WebElement webElement : elements) {
				System.out.println(webElement.getText());
			}
			// test that there are 3 h1 elements
			assertEquals(3, elements.size(), "ERROR: number of h1 elements");
		}
		System.out.println("==========================");
		// lists
		{
			List<WebElement> elements = driver.findElements(By.tagName("a"));
			for (WebElement webElement : elements) {
				System.out.println(webElement.getText());
			}
		}

		System.out.println("==========================");
		// lists
		{
			List<WebElement> elements = driver.findElements(By.xpath("//h1"));
			for (WebElement webElement : elements) {
				System.out.println(webElement.getText());
			}
		}
		System.out.println("05-=======================");
		Select areaCodeSelect = new Select(driver.findElement(By.name("areaCode")));
		TimeUnit.SECONDS.sleep(1);
		areaCodeSelect.selectByIndex(0);
		TimeUnit.SECONDS.sleep(1);
		areaCodeSelect.selectByIndex(1);
		TimeUnit.SECONDS.sleep(1);
		areaCodeSelect.selectByIndex(2);

		TimeUnit.SECONDS.sleep(1);
		areaCodeSelect.selectByValue("54");
		TimeUnit.SECONDS.sleep(1);
		areaCodeSelect.selectByValue("53");
		TimeUnit.SECONDS.sleep(1);
		areaCodeSelect.selectByValue("52");
		TimeUnit.SECONDS.sleep(1);
	}

}
