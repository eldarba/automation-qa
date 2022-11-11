package app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class HomePageUnitTest {

	@Test
	void test(WebDriver webDriver) {
		assertEquals("Automation Project", webDriver.getTitle(), "ERROR: Title in my web site");
	}

}
