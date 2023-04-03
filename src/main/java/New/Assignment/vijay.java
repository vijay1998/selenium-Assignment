package New.Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriverException;

public class vijay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("Hi,welcome to selenium testcases");
		driver.get("http://18.210.15.9:8081/addressbook/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("vijay ");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("kumar");
        driver.findElement(By.id("gwt-uid-9")).sendKeys("1111111111");
        driver.findElement(By.id("gwt-uid-11")).sendKeys("abc@gmail.com");
	    driver.findElement(By.id("gwt-uid-13")).sendKeys("3/31/23,");
	    driver.findElement(By.className("v-button-primary")).click();
				System.out.println("TestCase Executed");
				Thread.sleep(5000);
				//driver.quit();
			}
		}
    


