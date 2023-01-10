package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public WebDriver driver;

	@Given("User should be in adactin Home Page")
	public void user_should_be_in_adactin_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/index.php");
	}

	@When("User should Enter the {string} and {string}")
	public void user_should_enter_the_and(String Username, String Password) {
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
	}

	@When("User should Click on the Login button")
	public void user_should_click_on_the_login_button() {
		WebElement loginbutton = driver.findElement(By.id("login"));
		loginbutton.click();
	}

	@When("User should Select {string},{string},{string},{string},{string},{string}{string},{string}")
	public void user_should_select(String Location, String Hotels, String RoomType, String NumberofRooms,
			String CheckInDate, String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {

		WebElement locationDD = driver.findElement(By.xpath("//select[@id=\"location\"]"));
		Select dropdown1 = new Select(locationDD);
		dropdown1.selectByValue(Location);

		WebElement hotelsDD = driver.findElement(By.xpath("//select[@name=\"hotels\"]"));
		Select dropdown2 = new Select(hotelsDD);
		dropdown2.selectByValue(Hotels);

		WebElement roomtypeDD = driver.findElement(By.xpath("//select[@name=\"room_type\"]"));
		Select dropdown3 = new Select(roomtypeDD);
		dropdown3.selectByVisibleText(RoomType);

		WebElement noofRoomsDD = driver.findElement(By.xpath("//select[@name=\"room_nos\"]"));
		Select dropdown4 = new Select(noofRoomsDD);
		dropdown4.selectByValue(NumberofRooms);

		WebElement checkinDate = driver.findElement(By.xpath("//input[contains(@name,'datepick_in')]"));
		checkinDate.sendKeys(CheckInDate);

		WebElement checkinOut = driver.findElement(By.xpath("//input[contains(@name,'datepick_out')]"));
		checkinOut.sendKeys(CheckOutDate);

		WebElement APR = driver.findElement(By.xpath("//Select[@id='adult_room']"));
		Select dropdown5 = new Select(APR);
		dropdown5.selectByValue(AdultsperRoom);

		WebElement CPR = driver.findElement(By.xpath("//Select[@id='child_room']"));
		Select dropdown6 = new Select(CPR);
		dropdown6.selectByVisibleText(ChildrenperRoom);

	}

	@When("User should Click on the Search button")
	public void user_should_click_on_the_search_button() {
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
	}

	@When("User should Select the Hotel from the list")
	public void user_should_select_the_hotel_from_the_list() {
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
		checkbox.click();
	}

	@When("User should Click on the Continue button")
	public void user_should_click_on_the_continue_button() {
		WebElement button = driver.findElement(By.id("continue"));
		button.click();
	}

	@When("User should Enter the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_enter_the(String FirstName, String LastName, String BillingAddress, String CreditCardNo,
			String CreditCardType, String ExpiryMonth, String ExpiryYear, String CVVNumber) {

		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys(FirstName);
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys(LastName);
		WebElement baddress = driver.findElement(By.id("address"));
		baddress.sendKeys(BillingAddress);
		WebElement ccNo = driver.findElement(By.id("cc_num"));
		ccNo.sendKeys(CreditCardNo);

		WebElement ccType = driver.findElement(By.id("cc_type"));
		Select dropdown7 = new Select(ccType);
		dropdown7.selectByValue(CreditCardType);

		WebElement ccmonth = driver.findElement(By.id("cc_exp_month"));
		Select dropdown8 = new Select(ccmonth);
		dropdown8.selectByValue(ExpiryMonth);

		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
		Select dropdown9 = new Select(ccyear);
		dropdown9.selectByValue(ExpiryYear);

		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		ccv.sendKeys(CVVNumber);
	}

	@When("User should Click on the BookNow button")
	public void user_should_click_on_the_book_now_button() {
		WebElement booknow = driver.findElement(By.id("book_now"));
		booknow.click();

	}
}