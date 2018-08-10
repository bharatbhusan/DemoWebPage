import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class DemoPackage
{
	private static WebDriver driver;
	
	@Test
	public void checkBGColor()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.get("http://localhost:8081/DemoWebPage/");
		String bgcolor[]=driver.findElement(By.xpath(".//body")).getAttribute("style").toString().split(":");
		String color=bgcolor[1].trim().substring(0, bgcolor[1].length()-2);
		System.out.println("Actual Colour"+color);
		Assert.assertEquals("Actual Color is not blue", "blue", color);
		driver.quit();
	}
}
