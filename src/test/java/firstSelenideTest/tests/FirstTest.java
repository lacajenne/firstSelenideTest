package firstSelenideTest.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {

    // this is the first example class to be used

    @Before
    public void setup() {
        System.setProperty("selenide.browser", "Chrome");
    }

    @Test
    public void GoogleTest() {
        open("http://www.google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $(By.linkText("Selenide: concise UI tests in Java")).click();
    }

}
