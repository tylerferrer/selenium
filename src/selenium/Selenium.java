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

//Wait for the new tab to finish loading content		
//	Finalizar sessão
		driver.quit();
	}

}