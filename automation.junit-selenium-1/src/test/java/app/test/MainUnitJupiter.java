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
			TimeUnit.MILLISECONDS.sleep(200);
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
		webDriver.get("file://C:/temp/static/HTML_Project.html");
		TimeUnit.SECONDS.sleep(2);
		HomePage homeTest = new HomePage();
		homeTest.test(webDriver);
		System.out.println("Main Test - After home page testing");

		NextPage nextPage = new NextPage();
		nextPage.test(webDriver);
		System.out.println("Main Test - After Next page testing");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println(">>> @AfterAll");
		TimeUnit.SECONDS.sleep(1);
		// Quits this driver, closing every associated window
		webDriver.quit();
	}
}
