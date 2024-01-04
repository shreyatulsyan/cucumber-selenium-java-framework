package stepDefinitions;

import common.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pageObjects.ElementsPage;

public class Elements extends BasePage {

    ElementsPage elementsPage = new ElementsPage();

    @Given("Open the Chrome and launch the application 2")
    public void Open_the_Chrome_and_launch_the_application() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(40,3000)"); //vertical scroll
    }

    @When("Click on Elements")
    public void Click_on_Elements() throws InterruptedException {
        WebElement element = driver.findElement(elementsPage.element);
        element.click();
        Thread.sleep(1000);
    }

    @And("Click on TextBox")
    public void clickOnTextBox() {
        WebElement textBox = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
        textBox.click();
    }

    @And("^Enter \"([^\"]*)\"$")
    public void enterFullName(String arg) {
        WebElement fullnamexpath = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        fullnamexpath.sendKeys(arg);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(40,3000)"); //vertical scroll
    }

    @Then("Click on Submit")
    public void clickOnSubmit() {
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submit.click();
    }

    @And("Validate Name Shreya")
    public void validateNameShreya() {
        WebElement shreya = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        Assert.assertTrue((shreya.getText()).contains("shreya"));
        driver.quit();
    }
}
