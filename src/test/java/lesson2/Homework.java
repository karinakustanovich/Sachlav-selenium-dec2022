package lesson2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://devexpress.github.io/testcafe/example/");

        WebElement nameInput = driver.findElement(By.id("developer-name"));
        nameInput.sendKeys("Karina");
        Thread.sleep(1000);

        WebElement supportCB = driver.findElement(By.cssSelector("[data-testid='remote-testing-checkbox']"));
        supportCB.click();
        Thread.sleep(1000);

        WebElement reUsingCB = driver.findElement(By.cssSelector("[data-testid='reusing-js-code-checkbox']"));
        reUsingCB.click();
        Thread.sleep(1000);

        WebElement runningCB = driver.findElement(By.cssSelector("[data-testid='parallel-testing-checkbox']"));
        runningCB.click();
        Thread.sleep(1000);

        WebElement easyCB = driver.findElement(By.cssSelector("[data-testid='ci-checkbox']"));
        easyCB.click();
        Thread.sleep(1000);

        WebElement advancedCB = driver.findElement(By.cssSelector("[data-testid='analysis-checkbox']"));
        advancedCB.click();
        Thread.sleep(1000);

        WebElement testCafeCB = driver.findElement(By.cssSelector("[data-testid='tried-testcafe-checkbox']"));
        testCafeCB.click();
        Thread.sleep(1000);

        WebElement commentInput = driver.findElement(By.id("comments"));
        commentInput.sendKeys("My comment");
        Thread.sleep(1000);

        WebElement submitButton = driver.findElement(By.cssSelector("[data-testid='submit-button']"));
        submitButton.click();
        Thread.sleep(1000);

        String name = "Karina";

        WebElement thankYouHeader = driver.findElement(By.cssSelector("[data-testid='thank-you-header']"));

        if (thankYouHeader.getText().equals("Thank you, " + name + "!")){
            System.out.println("The text is correct");
        }
        else {
            System.out.println("The text is wrong");
        }

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        if (driver.getCurrentUrl().equals("https://devexpress.github.io/testcafe/example/thank-you.html")){
            System.out.println("The URL is correct");
        }
        else {
            System.out.println("The URL is wrong");
        }

        System.out.println("driver.getTitle() = " + driver.getTitle());

        if (driver.getTitle().equals("Thank you!")){
            System.out.println("The title is correct");
        }
        else {
            System.out.println("The title is wrong");
        }

        driver.quit();
    }
}
