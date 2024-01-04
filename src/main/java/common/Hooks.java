package common;

import common.BasePage;
import io.cucumber.java.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BasePage {

    @BeforeAll
    public static void beforeAllsame(){
        System.out.println("Before all ");
    }

    @Before //Cucumber Before Hook
    public static void setupDriver() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        Thread.sleep(3000);
    }

    @After // Cucumber After hook
    public static void quitDriver() throws Exception {
        driver.quit();
    }


    @AfterAll
    public static void afterAllsame(){
        System.out.println("After all");

    }
}