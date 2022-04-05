import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class myProject1 {

    @Test
    public void MyProject1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();

        driver.get("https://www.kinopoisk.ru");
        Thread.sleep(5000);

        WebElement element = driver.findElement(By.name("kp_query"));
        element.sendKeys("карамора");
        Thread.sleep(5000);

        element.submit();
        Thread.sleep(5000);

        System.out.println(driver.getTitle());

        driver.quit();
    }
}