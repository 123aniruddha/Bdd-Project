package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import BaseLayer.BaseClass;


public class RegisterPageStep extends BaseClass{
    public static WebDriver driver;

    @Given("User visits a page")
    public void userVisitsAPage() throws IOException {
    	
    	  BaseClass.initialization();
    }

    @When("User enters username as {string} and password as {string}")
    public void userEntersUsernameAsAndPasswordAs(String arg0, String arg1) {
    }
}
