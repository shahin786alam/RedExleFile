package redexlefile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPart1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //lounch browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

		/*WebElement day =driver.findElement(By.id("day"));
		WebElement month =driver.findElement(By.id("month"));
		WebElement year =driver.findElement(By.id("year"));*/


		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("13");

		//		Select select = new Select(driver.findElement(By.id("day")));
		//		select.selectByIndex(25);

		//Select select = new Select(day);
		//select.selectByVisibleText("13");

		//Select select1 = new Select(month);
		//select1.selectByVisibleText("Dec");

		//Select select2 = new Select(year);
		//select2.selectByVisibleText("1990");

		/*	 String dob= "12-Dec-1990";
		   String dobArr[]= dob.split("-");


		selectValueFromDropDown(day,dobArr[0]);
		selectValueFromDropDown(month,dobArr[1]);
		selectValueFromDropDown(year,dobArr[2]);
	}
	public static void selectValueFromDropDown(WebElement element, String value) {

		Select select1 = new Select(element);
		select1.selectByVisibleText(value);	*/
	}

}
