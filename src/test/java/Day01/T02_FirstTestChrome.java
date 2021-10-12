package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T02_FirstTestChrome {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();

        // 1.url kontrolu yapacagiz. ==> https://www.trendyol.com/
        String expectedURL = "https://www.trendyol.com/";
        String actualURL = driver.getCurrentUrl();
        if (actualURL.equals(expectedURL)) {
            System.out.println("URL TEST PASS");
        }else{
            System.out.println("URL TEST FAILED");
        }



        // 2. title kontrolu yapilacak. "Trendyol"
        String expectedTitle = "Trendyol";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title TEST PASS");
        }else {
            System.out.println("Title TEST FAILED");
        }
        driver.close();

    }
}
