package app.test;

import java.util.concurrent.TimeUnit;

//import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class MainUnitJupiter {

	private static WebDriver webDriver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		try {

			System.out.println(">>> @BeforeAll");
			System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
			// open browser
			webDriver = new ChromeDriver();
			TimeUnit.SECONDS.sleep(1);
			// maximize window
			webDriver.manage().window().maximize();
			TimeUnit.SECONDS.sleep(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	void test() throws InterruptedException {
//		fail("Not yet implemented");
		System.out.println(">>> @Test");
		webDriver.get(
				"file://C:/programming/eclipse/workspace/automation.junit-selenium-1/src/main/resources/static/HTML_Project.html");
		TimeUnit.SECONDS.sleep(3);
		HomePageUnitTest homeTest = new HomePageUnitTest();
		homeTest.test(webDriver);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println(">>> @AfterAll");
		// Quits this driver, closing every associated window
		webDriver.quit();
	}
}
