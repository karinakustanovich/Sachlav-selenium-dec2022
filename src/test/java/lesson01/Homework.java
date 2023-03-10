package lesson01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://amazon.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.navigate().to("https://www.walmart.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().refresh();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        System.out.println("driver.getTitle() = " + driver.getTitle());



    }
}
