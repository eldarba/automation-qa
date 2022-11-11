import static org.junit.Assert.*;

import java.util.List;

//import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	@Test
	public void test(WebDriver ff) {
	
		/******* קליטת כותרת ובדיקתה ******/
		// הגדרת משתנה לכותרת האתר
		
		Assert.assertEquals("ERROR: Title in my web site", "Automation Project", ff.getTitle());
		/*
		String expWebTitle = "Hello";
		// קליטת כותרת האתר והכנסה למשתנה
		String actWebTitle = ff.getTitle();
		Assert.assertEquals("ERROR: Title in my web site", expWebTitle, actWebTitle);
		 */
		
		System.out.println(ff.getTitle());
		
		/******* מציאה של אלמנט : תגית ******/
		//הגדרת משתנה שיחזיק אלמנט - תגית
		WebElement hpWebElement = null; // (תגית) משתנה עבור קליטת אלמנט בדף הבית
		//פניה לדפדפן באמצעות הדרייבר ובקשה ממנו למצוא לי תגית מסוימת 
		//הדרייבר מכניס לתוך המשתנה מחזיק את האלמנט את מה שהוא הביא מהדפדפן
		hpWebElement=ff.findElement(By.tagName("h1"));
		//הדפסה של הטקטס של התגית שביקשתי אייץ1
		System.out.println("First headline H1 is: " + hpWebElement.getText());
		//השוואה - בדיקה - בין התוצאה הצפויה לבין התוצאה בפועל
		Assert.assertEquals("ERROR: first title H1", "Student Details",hpWebElement.getText());

		
		
		hpWebElement=ff.findElement(By.name("fname"));
		hpWebElement.sendKeys("Danny");


		hpWebElement=ff.findElement(By.id("m"));
		hpWebElement.click();
		
		
		hpWebElement=ff.findElement(By.id("p"));
		hpWebElement.click();
		
		hpWebElement=ff.findElement(By.id("JE"));
		hpWebElement.click();
		//למצוא כפתור ולהקליק אליו
		//למצוא לינק ולהליק עליו
		hpWebElement=ff.findElement(By.linkText("Next Page"));
		hpWebElement.click();
		ff.navigate().back();
		
		int numOfElements=ff.findElements(By.xpath("//h1")).size();
		Assert.assertEquals("ERROR: Number of title H1", 3, numOfElements);
	//	Assert.assertEquals("ERROR: Number of title H1", 3,ff.findElements(By.xpath("//h1")).size());
		
		
		List <WebElement> hpWebElements = null;//משתנה שיחזיק רשימה של אלמנטים
		//מציאת כל האלמנטים שהם מסוג לינק, הכנסת לרשימה והדפסת הטקסט של הלינק
		hpWebElements = ff.findElements(By.tagName("a"));
		System.out.println();
		System.out.println("Number of link elements:" + hpWebElements.size());

		   
		for (int i=0; i<hpWebElements.size();i++){    	
			System.out.println("Link text:" + hpWebElements.get(i).getText());		    	
		}
		    
		    
			//מציאת כל האלמנטים שהם מסוג כותרת אייץ1, הכנסת לרשימה והדפסת הטקסט של הכותרת
		 System.out.println();
		 hpWebElements = ff.findElements(By.tagName("h1"));
		 System.out.println("Number of H1 elements:" + hpWebElements.size());

			   
		 for (int i=0; i<hpWebElements.size();i++){    	
			  System.out.println("Link text:" + hpWebElements.get(i).getText());		    	
		}
		 
		 Select drpArea = new Select(ff.findElement(By.name("areaCode"))); // Find AreaCode DropDown 
		 drpArea.selectByValue ("54");

		
	}

}
