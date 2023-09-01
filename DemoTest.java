package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        System.out.println("title : " + title);

        System.out.println("Current URL : " + driver.getCurrentUrl());
        //System.out.println("Current Page Source: " + driver.getPageSource());
        Thread.sleep(4000L);
        driver.quit();

    }
}
