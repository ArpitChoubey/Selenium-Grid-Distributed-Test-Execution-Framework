package SeleniumGridDem;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridMultiplehub {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		ChromebrowserTest();
		FirefoxbrowserTest();
		ChromebrowserTest();
		FirefoxbrowserTest();
		ChromebrowserTest();
		FirefoxbrowserTest();
		ChromebrowserTest();
		FirefoxbrowserTest();
		ChromebrowserTest();
		FirefoxbrowserTest();
		ChromebrowserTest();
		FirefoxbrowserTest();
		ChromebrowserTest();
		FirefoxbrowserTest();
		
	}
		
		
		
		
public static void ChromebrowserTest() throws URISyntaxException, MalformedURLException {
			
			URI hubURI = new URI("http://localhost:4444/");
			URL hubUrl = hubURI.toURL();
			
			ChromeOptions options = new ChromeOptions();
			
			WebDriver driver = new RemoteWebDriver(hubUrl,options);
			
			
			driver.get("https://www.astrosage.com/");
			
			System.out.println(driver.getTitle());
			
			// driver.quit();
		}
			
			
			public static void EdgebrowserTest() throws URISyntaxException, MalformedURLException {
				
				URI hubURI = new URI("http://localhost:4444/");
				URL hubUrl = hubURI.toURL();
				
				EdgeOptions options = new EdgeOptions();
				
				WebDriver driver = new RemoteWebDriver(hubUrl,options);
				
				
				driver.get("https://www.astrosage.com/");
				
				System.out.println(driver.getTitle());
				
				driver.quit();
			}
				
				
				public static void FirefoxbrowserTest() throws URISyntaxException, MalformedURLException {
					
					URI hubURI = new URI("http://localhost:4444/");
					URL hubUrl = hubURI.toURL();
					
					FirefoxOptions options = new FirefoxOptions();
					
					WebDriver driver = new RemoteWebDriver(hubUrl,options);
					
					
					driver.get("https://www.astrosage.com/");
					
					System.out.println(driver.getTitle());
					
					// driver.quit();
			
		}


	}


