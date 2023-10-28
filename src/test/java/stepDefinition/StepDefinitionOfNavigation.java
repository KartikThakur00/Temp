//package stepDefinition;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class StepDefinitionOfNavigation {
//
//    WebDriver driver = new ChromeDriver();
//
//    Actions actions =new Actions(driver);
//
//    // before the scenario
//    @Before
//    public void beforeScenario(){
//        driver.manage().window().maximize();
//        driver.get("https://www.xenonstack.com/");
//        System.out.println("before");
//    }
//
//    // logo is clickable
//
////    @When("Click the logo")
////    public void click_the_logo() {
////        driver.findElement(By.xpath("//img[@class='xenonstack-logo']")).click();
////    }
////    @Then("Go to Homepage")
////    public void go_to_homepage() {
////        String expectedTitle="Real Time Data and AI Company";
////        Assert.assertEquals(expectedTitle,driver.getTitle());
////    }
//
//    // cheking search functionality
//    @When("Click on search and Enter Something")
//    public void click_on_search_and_enter_something() {
//        driver.findElement(By.xpath("//li/img[@id='imageidsearch']")).click();
//        driver.findElement(By.className("hs-search-field__input")).sendKeys("cloud");
//        driver.findElement(By.className("hs-search-field__input")).sendKeys(Keys.ENTER);
//
//    }
//    @Then("Show some result")
//    public void show_some_result() {
//        System.out.println(driver.getTitle());
//    }
//
//    //Cheking Navigation links
//    @When("Hover on Services")
//    public void hover_on_services() {
//        WebElement element=driver.findElement(By.xpath("//div/span[text()='Services']"));
//        actions.moveToElement(element).perform();
//    }
//    @When("Click on {string}")
//    public void click_on(String string) {
//        String xpath= "//ul/li/a/p[text()='" + string + "']";
//        driver.findElement(By.xpath(xpath)).click();
//    }
//    @Then("Go to {string}")
//    public void go_to(String string) {
//        Assert.assertEquals(string,driver.getTitle());
//    }
//
//
//    //after the scenario
//    @After
//    public void afterScenario(){
//        System.out.println("after");
//        driver.quit();
//    }
//}
