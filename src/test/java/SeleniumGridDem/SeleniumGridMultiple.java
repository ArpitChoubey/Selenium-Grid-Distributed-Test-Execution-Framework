package SeleniumGridDem;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridMultiple {

	public static void main(String[] args) throws MalformedURLException, URISyntaxException {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Browser Name : ");
		String browser = sc.next();
		switch(browser.toLowerCase()) {
		case "chrome" :
			ChromebrowserTest();
			break;
			
		case "edge" :
			EdgebrowserTest();
			break;
			
			
		case "firefox" :
			FirefoxbrowserTest();
			break;
			
			
			
		}
		
		
	}
		
		
		public static void ChromebrowserTest() throws URISyntaxException, MalformedURLException {
			
			URI gridURI = new URI("http://localhost:4444/");
			URL gridUrl = gridURI.toURL();
			
			ChromeOptions options = new ChromeOptions();
			
			WebDriver driver = new RemoteWebDriver(gridUrl,options);
			
			
			driver.get("https://www.astrosage.com/");
			
			System.out.println(driver.getTitle());
			
			driver.quit();
		}
			
			
			public static void EdgebrowserTest() throws URISyntaxException, MalformedURLException {
				
				URI gridURI = new URI("http://localhost:4444/");
				URL gridUrl = gridURI.toURL();
				
				EdgeOptions options = new EdgeOptions();
				
				WebDriver driver = new RemoteWebDriver(gridUrl,options);
				
				
				driver.get("https://www.astrosage.com/");
				
				System.out.println(driver.getTitle());
				
				driver.quit();
			}
				
				
				public static void FirefoxbrowserTest() throws URISyntaxException, MalformedURLException {
					
					URI gridURI = new URI("http://localhost:4444/");
					URL gridUrl = gridURI.toURL();
					
					FirefoxOptions options = new FirefoxOptions();
					
					WebDriver driver = new RemoteWebDriver(gridUrl,options);
					
					
					driver.get("https://www.astrosage.com/");
					
					System.out.println(driver.getTitle());
					
					driver.quit();
			
		}

	}


