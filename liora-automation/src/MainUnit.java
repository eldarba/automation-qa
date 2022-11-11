import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainUnit {

	/******* הגדרת משתנים לכל הקלאס ******/
	public static WebDriver ffDriver = null; // משתנה עבור דרייבר לפיירפוקס
	//public static WebDriver chDriver = null; // משתנה עבור דרייבר לכרום
	int num;

	
	@BeforeClass
	public static void beforeClass	() {
		
		System.out.println("Before Test - Start");	
		//הפעלה של הדרייב
		System.setProperty("webdriver.gecko.driver", "/Users/sea/Documents/workspace/QAJB/SeleniumDrivers/geckodriver");
		//פתיחת הדפדפן
		ffDriver = new FirefoxDriver();
		//הגדלת הדפדפן למקסימום
		ffDriver.manage().window().maximize();	

	
		//System.setProperty("webdriver.chrome.driver", "/Users/lioralevi/Documents/workspace/QAJB/SeleniumDrivers/chromedriver.exe");
		//chDriver = new ChromeDriver();

	}
	
	
	@Test
	public void test() {
		System.out.println("Test - Start");	
		//פתיחת הדף (דף הבית) שאותו אנחנו רוצים לבדוק
		ffDriver.get("file:///Users/sea/Documents/workspace/QAJB/HTML/HTML_Project.html");	
		
		//את הבדיקות עצמן על הדף שנפתח נבצע באמצעות הקלאס הוםפייג
		//יוצרים בזכרון את האובייקט (קלאס הום פייג, נותנות לו את השם אייץפי
		HomePage hp = new HomePage();
		//עכשיו יש לנו אובייקט בזכרון, שולחים אל הפונקציה טסט, שבה נכתוב את הבדיקות, את הדפדפן (הסביבה שהכנו לבדיקה)
		hp.test(ffDriver);
		System.out.println("Main Test - After home page testing");	
		
		
		NextPage np = new NextPage();
		//עכשיו יש לנו אובייקט בזכרון, שולחים אל הפונקציה טסט, שבה נכתוב את הבדיקות, את הדפדפן (הסביבה שהכנו לבדיקה)
		np.test(ffDriver);
		System.out.println("Main Test - After Next page testing");
		
		
		
	}
	

	
	@AfterClass
	public static void afterClass	() {
		
		System.out.println("After Test - Start");	
	//	ffDriver.quit();	
	}


}



















