package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.hamcrest.core.StringContains;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class FindAMeetingSteps {
	
	WebDriver driver;
	
	// setup webdriver and navigate to the home page
	@Given("^user is already on landing page$")
	public void user_already_on_landing_page() {
		System.setProperty("webdriver.chrome.driver", "C:/Temp/WebDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.weightwatchers.com/us/");
		driver.manage().window().maximize();
	}
	
	// verify the landing page is correct
	@When("^title of landing page contains Weight Loss Program, Recipes & Help | Weight Watchers$")
	public void verify_title_tag() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Weight Watchers: Weight Loss Program, Recipes & Help | WW America", title);
	}

	// click function "Find A Meeting"
	@Then("^user clicks on Find A Meeting$")
	public void user_clicks_on_Find_A_Meeting() {
		WebElement findMeetingButton = driver.findElement(By.xpath("//a[@class='find-a-meeting']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", findMeetingButton);
	}

	// verify the get schedules page is correct
	@Then("^user verifies web page contains Get Schedules & Times Near You$")
	public void user_verifies_web_page_contains_Get_Schedules_Times_Near_You() {
		String title = driver.getTitle();
		System.out.println("Search Schedules Page: " + title);
		Assert.assertEquals("Find A Meeting: Get Schedules & Times Near You | Weight Watchers", title);
		// "Get Schedules & Times Near You" is not full title, using full title (assertContains is a possible option)
	}

	// input zipcode and hit search, sleep for 5 seconds
	// can call sendKeys input from the feature file with /"([^\"]*)/"
	@Then("^user enters text in the search field and clicks search$")
	public void user_enters_text_in_the_search_field_and_clicks_search() {
		driver.findElement(By.name("meetingSearch")).sendKeys("10011");
		driver.findElement(By.xpath("//button[@data-analytics='mfsr:mf-find-btn']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}


	// print results
	@Then("^print result title and distance and verify$")
	public void print_result_title_and_distance_and_verify() {
		List<WebElement> titleSearchResults = driver.findElements(By.xpath("//div[@class='meeting-locations-list']/*[1]/result-location/div/div[1]/a/location-address/div/div/div[2]"));
		String titleSearchResultText = titleSearchResults.get(0).getText();
		for(WebElement titleResult : titleSearchResults) {
			System.out.println("First Result Title : " + titleResult.getText());
			}
		
		List<WebElement> distanceSearchResults = driver.findElements(By.xpath("//div[text()='0.49 mi.']")); //xpath not very reliable; just another way to search
		for(WebElement result : distanceSearchResults) {
			System.out.println("Distance : " + result.getText());
			}
		
		
		// click element
		driver.findElement(By.xpath("//div[@class='meeting-locations-list']/div")).click();
//		System.out.println(titleSearchResultText);
//		System.out.println(driver.findElement(By.xpath("//div[@class='location__address']")).getText());
		
		// verify the search and clicked link are the same
				if(driver.findElement(By.xpath("//div[@class='location__address']")).getText().equals(titleSearchResultText)) {
					System.out.println("Clicked element matches!");
				}
				else {
					System.out.println("Element is not the same!");
				}
	}
	
	@Then("^print TODAY’s hours of operation$")
	public void print_TODAY_s_hours_of_operation(){
		List<WebElement> todaysHours = driver.findElements(By.xpath("//div[@class='hours-list-item-wrapper hours-list--currentday']/div"));
		for(WebElement todaysDay : todaysHours) {
			System.out.println(todaysDay.getText());
			}
	}
	
	
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
