package app.test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class NextPage {

	@Test
	void test(WebDriver driver) throws InterruptedException {

		System.out.println("Start - Naxt Page");
		WebElement element = null;
		element = driver.findElement(By.linkText("Next Page"));
		element.click();

		Assertions.assertEquals("Next Page", driver.getTitle(), "ERROR: Title in my web site next page");

		System.out.println("changing title of next page");
		TimeUnit.SECONDS.sleep(3);
		element = driver.findElement(By.tagName("button"));
		element.click();

		Assertions.assertEquals("Finish", driver.getTitle(), "ERROR: Title in my web site next page after change");

	}

}
