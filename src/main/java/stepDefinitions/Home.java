package stepDefinitions;

import common.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Home extends BasePage {

    @Given("Open the Chrome and launch the application")
    public void Open_the_Chrome_and_launch_the_application() throws InterruptedException {
        System.out.println("Entered here");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(40,3000)"); //vertical scroll
    }

    @When("Click on Alerts Frame and Windows")
    public void Click_on_Alerts_Frame_and_Windows() throws InterruptedException {
        WebElement alert = driver.findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
        alert.click();
//        WebDriverWait wait = new WebDriverWait(driver,  30);
//        wait.until(ExpectedConditions.urlContains("alertsWindows"));
        Thread.sleep(1000);
    }

    @Then("Alerts Frame and Windows is opened")
    public void Alerts_Frame_and_Windows_is_opened(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demoqa.com/alertsWindows");
        driver.quit();

    }

}
