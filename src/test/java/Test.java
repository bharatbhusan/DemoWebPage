import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Test1
{
	private static WebDriver driver;
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.get("http://localhost:8081/DemoWebPage/");
		String bgcolor[]=driver.findElement(By.xpath(".//body")).getAttribute("style").toString().split(":");
		String color=bgcolor[1].trim().substring(0, bgcolor[1].length()-2);
		System.out.println(color);
		Assert.assertEquals("Color is not blue", "red", color);
		driver.quit();
	}
}