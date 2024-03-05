package stepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {

	WebDriver driver;

	@Given("User opens the application")
	public void user_opens_the_application() {

		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();

	}

	@Given("User navigates to the login page")
	public void user_navigates_to_the_login_page() {
		driver.get("https://demo.guru99.com/V4/manager/Logout.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Use enters username \\(username: {string})")
	public void use_enters_username_username(String username) {
		driver.switchTo().alert().accept();
		driver.findElement(By.name("uid")).sendKeys(username);

	}

	@When("User entes password   \\(password: {string})")
	public void user_entes_password_password(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("User clicks on the Login button")
	public void user_clicks_on_the_login_button() {
		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("User should be able to see the welcome text")
	public void user_should_be_able_to_see_the_welcome_text() {
		String text = driver.findElement(By.cssSelector("[behavior ='alternate']")).getText();
		Assert.assertEquals(text, "Welcome To Manager's Page of Guru99 Bank");
	}

	@Then("click on the log out button")
	public void click_on_the_log_out_button() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Alert alert = driver.switchTo().alert();
		String textAlert = alert.getText();
		System.out.println(textAlert);
		alert.accept();

	}

	@Then("User should be able clos ethe browser")
	public void user_should_be_able_clos_ethe_browser() {
		driver.close();
	}

}
