package Runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

public class ChromeRunner {
    @BeforeTest
    public static void setup(){
        Selenide.open("https://www.google.com/");
        Configuration.browserSize = "1920x1080";
    }
}
