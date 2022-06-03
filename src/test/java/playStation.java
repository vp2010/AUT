import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class playStation {


    public static void main(String[] args) {

        System.out.println( getNumber() );

    }

    static WebDriver driver;
    public static Integer getNumber(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));

        for(int i=0; i<10; i++){
            if(i==5.5)
                return 1;
        }
        return 2;
    }
}
