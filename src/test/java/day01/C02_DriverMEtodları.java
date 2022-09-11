package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMEtodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasına gidiniz
        driver.get("https://amazon.com");
        //Kaynak kodların içinde "Gateway" kelimesinin oldugunu test ediniz
        System.out.println(driver.getPageSource());
        String istenenKelime="Gateway";
        if (driver.getPageSource().contains(istenenKelime)){
            System.out.println("Page source testi PASSED");
        }else System.out.println("Page source testi FAILED");

        driver.close();//sayfayı kapatır
        driver.quit();//birden fazla sayfa  varsa hepsini kapatır

    }
}
