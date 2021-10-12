package Day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class T03_Getir {
    public static void main(String[] args) throws InterruptedException {
        //1) driver olusturun
        //2) Tam ekran yapin
        //3) Driver'in sayfanin yüklenmesi için 10.000 milisaniye beklemesini ayarlayin
        //4) getir.com adresine gidin
        //5) web sayfasinin sayfa basligini(title) alin ve ekrana yazdirin
        //6) web sayfasinin url'ini alin ve ekrana yazdirin
        //7) web sayfasinin title'inin Getir icerdigini kontrol edin
        //8) gittigidiyor.com adresine gidin
        //9) web sayfasinin sayfa basligini(title) alin ve ekrana yazdirin
        //10) web sayfasinin url'ini alin ve ekrana yazdirin
        //11) Title'in Gittigidiyor icerdigini kontrol edin.
        //12) sahibinden.com sayfasina geri don.
        //13) sayfayi yenile
        //14) onceki sayfaya don

        System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.getir.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        if (driver.getTitle().contains("Getir")) {
            System.out.println("Title contains TEST PASS");
        }else {
            System.out.println("Title doesnt contains TEST FAILED");
        }
        driver.navigate().to("https://www.gittigidiyor.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        if (driver.getTitle().contains("Gittigidiyor")) {
            System.out.println("Title contains TEST PAS");
        }else{
            System.out.println("Title doesnt contains TEST FAILED");
            System.out.println(driver.getTitle());
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.close();






    }
}
