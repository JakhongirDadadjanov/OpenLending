import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class slogan {
    //Open Lending!
    @Test
    public static void slogan1() throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        WebElement input = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));

        input.sendKeys("Open Lending");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"kp-wp-tab-overview\"]/div[2]/div/div/div/div/div/div[2]/div[1]/div/g-link/a/div[1]/g-img/div")).click();

        WebElement slogan = driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/section[1]/div/div[2]/div[1]/h4"));
        String sloganTex = slogan.getText();
        Assert.assertEquals(sloganTex, "Say YES to more automotive loans.");


    }
}

