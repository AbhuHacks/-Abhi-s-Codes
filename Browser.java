package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser {

    public static void main(String[] args) throws InterruptedException {
        // top casting/up casting/runtime polymorphism/polygraphic/polymorphic reference
        WebDriver driver = new ChromeDriver(); //opens chromeBrowser

//		WebDriver driver = new FirefoxDriver(); //opens  firefox Browser

//		WebDriver driver = new EdgeDriver(); //opens  edge Browser
//		driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com");

        driver.manage().window().maximize();  //method chaining

        String title = driver.getTitle();
        System.out.println("title : " + title);

        String cUrl = driver.getCurrentUrl();
        System.out.println("Current Url : " + cUrl);

        String pageSource = driver.getPageSource();
        System.out.println("page Source: " + pageSource);

        Thread.sleep(4000l);
//		driver.close(); // closes the current window where driver's focus is on
        driver.quit(); //closes all the windows opened by driver
    }
}
