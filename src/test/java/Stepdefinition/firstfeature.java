package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class firstfeature {

	WebDriver driver;

	@Before
	public void start() {
		System.out.println("******Scenrio is going Executed******");
	}

	@After
	public void teardown() {
		System.out.println("***Scenario is executed***");
	}

	@When("take snapshot of the search result")
	public void take_snapshot_of_the_search_result() {

	}

	@Given("open an chrome browser")
	public void open_an_chrome_browser() {
		driver = new ChromeDriver();

	}

	@Given("load the google URL")
	public void load_the_google_url() {

		driver.get("https://www.google.com/");
	}

	@When("in search text box provide laptop as search item and press ENTER key")
	public void in_search_text_box_provide_laptop_as_search_item_and_press_enter_key() {

		driver.findElement(By.id("APjFqb")).sendKeys("Laptop", Keys.ENTER);
	}

	@When("in search text box provide {string} as search item and press ENTER key")
	public void in_search_text_box_provide_as_search_item_and_press_enter_key(String x) {
		driver.findElement(By.id("APjFqb")).sendKeys(x, Keys.ENTER);

	}

	@Then("validate the outcome")
	public void validate_the_outcome() {
		String title = driver.getTitle();
		System.out.println("Title of the page = " + title);

	}

}
