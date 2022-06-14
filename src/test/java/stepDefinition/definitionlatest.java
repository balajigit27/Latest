package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class definitionlatest {

	

	
	WebDriver driver;
	String driverPath = "C:\\Users\\Ganga Bhavani\\Selenium\\chromedriver_win32\\chromedriver.exe";
	
	
	@Given("I go to google search page")
	public void i_go_to_google_search_page() {
	    
			
		System.out.println("launching Chrome browser"); 
	    System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get("http://google.com");
	    
	}

	@When("I enter selenium and hit enter")
	public void i_enter_selenium_and_hit_enter() {
		
		driver.findElement(By.name("q")).sendKeys("selenium");
	    
	    
	}

	@Then("I saw content")
	public void i_saw_content() {
		
		
		driver.quit();
	   
	    
	}

	
}
