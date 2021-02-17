import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class location {
	public WebDriver driver;
	public static String URL = "https://www.shwapno.com/";
	public static String city = "Dhaka";
	public static String area = "Adabor";
	public static String shop = "Submit";
	public static WebElement element; 

	@Test
	public static void chooseLocation() throws InterruptedException {
		System.setProperty("webdriver.chorme.driver", "C:\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		Select se = new Select(driver.findElement(By.xpath("//select[@id='state']")));
		se.selectByVisibleText(city);
		Select ar = new Select(driver.findElement(By.xpath("//select[@id='city']")));
		ar.selectByVisibleText(area);
		WebElement element =driver.findElement(By.xpath("//input[@id='btnFindStore']"));
		element.click();
		 
	}
}
