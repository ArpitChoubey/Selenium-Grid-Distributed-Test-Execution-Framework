package SeleniumGridDem;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SeleniumGridstdalne {


	public static void main(String[] args) throws URISyntaxException, MalformedURLException {
		
		URI gridURI = new URI("http://localhost:4444/");
		URL gridUrl = gridURI.toURL();
		
		ChromeOptions options = new ChromeOptions();
		
		WebDriver driver = new RemoteWebDriver(gridUrl,options);
		
		
		driver.get("https://www.astrosage.com/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		
		

	}

}
