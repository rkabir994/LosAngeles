package stepdefinition1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdeeffff1 {
	
	WebDriver driver;
	
	@Given("^browser is open$")
	public void browser_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	}

	@Then("^user is on amazon homepage$")
	public void user_is_on_amazon_homepage() throws Throwable {
		
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.amazon.com/");
	   
	}

	@Then("^user enter a text in search box$")
	public void user_enter_a_text_in_search_box() throws Throwable {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("hp 65 black ink cartridge");
		Thread.sleep(1000);
	   
	}

	@Then("^user hits enter$")
	public void user_hits_enter() throws Throwable {
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
	   
	}

	@Then("^user select an item$")
	public void user_select_an_item() throws Throwable {
	   
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
	}

	@Then("^user add item to cart$")
	public void user_add_item_to_cart() throws Throwable {
	  
		driver.findElement(By.name("submit.add-to-cart")).click();
		Thread.sleep(2000);
		
		
		driver.close();
		driver.quit();
		
	}


}
