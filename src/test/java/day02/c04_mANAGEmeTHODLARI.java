package day02;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class c04_mANAGEmeTHODLARI {
    public static void main(String[] args) throws InterruptedException {
//ONEMLI ONEMLI
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//istenen sayfa acılıncaya kadar maximum bekleme süresi

        driver.get("https://techproeducation.com");
        driver.close();
        /*
         İleride wait konusunu daha geniş olarak ele alacağız
        Bir sayfa açılırken, ilk başta sayfanın içerisinde bulunan elementlere göre bir
        yükleme süresine ihtiyaç vardır veya bir webelementin kullanılabilmesi için zaman ihtiyaç olabilir.
        imlicitlyWait bize sayfanın yüklenmesi ve sayfadaki elementlere ulaşım için beklenecek
        MAXIMUM sureyi belirleme olanağı tanir
         */
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
}
