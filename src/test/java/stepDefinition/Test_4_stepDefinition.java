package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_4_stepDefinition {

    WebDriver driver =new ChromeDriver();

//    @Before
//    public void beforeScenario() {
//        driver.manage().window().maximize();
//        driver.get("https://www.xenonstack.com/");
//    }

    @When("Click on search and Enter Something")
    public void click_on_search_and_enter_something() {
        driver.findElement(By.xpath("//li/img[@id='imageidsearch']")).click();
        driver.findElement(By.className("hs-search-field__input")).sendKeys("cloud");
        driver.findElement(By.className("hs-search-field__input")).sendKeys(Keys.ENTER);
    }

    @Then("Show Some Result")
    public void show_some_result() {
        System.out.println(driver.getTitle());
    }

//    @After
//    public void afterScenario() {
//        driver.quit();
//    }
}
