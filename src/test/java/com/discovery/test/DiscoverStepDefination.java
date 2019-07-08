package com.discovery.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.discovery.obj.Discovery;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DiscoverStepDefination extends Assert {
	
	public static WebDriver driver;
	public static String url="https://www.discovery.com/";
	
	@Before//  it will run before scenario 
	public void setup(){
		System.setProperty("webdriver.chrome.driver",".//src/main/resources/browser/chromedriver");
		driver=new ChromeDriver();
	}
	
	@After
	public void tearDown(){
		driver.close();
	}
	
	@Given("^User is Discovery Home Page$")
	public void user_is_Discovery_Home_Page() throws Throwable {
		driver.get(url);		
	}

	@When("^User select the two videos from recommended for you as favourite$")
	public void user_select_the_two_videos_from_recommended_for_you_as_favourite() throws Throwable {	
		Discovery d=new Discovery(driver);
		d.selectTheVideos();	
	}

	@When("^User navigate to my video page$")
	public void user_navigate_to_my_video_page() throws Throwable {
		driver.navigate().to(url+"/my-videos");

	}

	@Then("^the videos should appear with correct show and title and description$")
	public void the_videos_should_appear_with_correct_show_and_title_and_description() throws Throwable {		
		Discovery d=new Discovery(driver);
		d.checkForFavourite();
		assertEquals(Discovery.input, Discovery.result);
	
	}
	
	



}
