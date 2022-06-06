package package1;

import Runner.ChromeRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class classwork2 extends ChromeRunner {
    @Test
    public void chrome2(){
        $(byName("q")).setValue("autoamted testing");
    }
}
