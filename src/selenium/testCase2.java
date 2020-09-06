package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Tyler Ferreira
 *
 */
public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Create Driver Object for Chrome Browser
//		Class name= X
//				X driver=new x();
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		

	}

}
