package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("I Navigate to youtube");
//		Acessando o navegador
		driver.get("https://www.youtube.com/");
//		Pegar URL
		System.out.println(driver.getCurrentUrl());
//		Atualizar navegador
		driver.navigate().refresh();
//Pegar titulo
		System.out.println(driver.getTitle());
//		Identificador de janela
		System.out.println(driver.getWindowHandle());
                
                driver.get("https://www.google.com/");
                
                //Store the ID of the original window
String originalWindow = driver.getWindowHandle();

//Check we don't have other windows open already
assert driver.getWindowHandles().size() == 1;

//Click the link which opens in a new window
driver.findElement(By.linkText("new window")).click();

driver.switchTo().newWindow(WindowType.WINDOW);

//Wait for the new window or tab
wait.until(numberOfWindowsToBe(2));

//Loop through until we find a new window handle
for (String windowHandle : driver.getWindowHandles()) {
    if(!originalWindow.contentEquals(windowHandle)) {
        driver.switchTo().window(windowHandle);
        break;
    }
}

//Wait for the new tab to finish loading content
wait.until(titleIs("Selenium documentation"));  
		
//	Finalizar sessão
		driver.quit();
	}

}