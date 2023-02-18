package lesson03.homework;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TentSearchWhile {
    private WebDriver driver;

    public TentSearchWhile() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void searchTentsWhileLoop() {
        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("tent");
        searchBox.submit();

        int page = 1;
        while (page <= 10) {
            System.out.println("Page " + page + ":");
            List<WebElement> tentElements = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']//span[@class='a-size-medium a-color-base a-text-normal']"));
            for (WebElement tentElement : tentElements) {
                System.out.println(tentElement.getText());
            }
            driver.findElement(By.cssSelector("[class*='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']")).click();

            page++;
        }

        driver.quit();
    }
}

