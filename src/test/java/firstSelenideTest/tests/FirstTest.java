package firstSelenideTest.tests;

import com.codeborne.selenide.commands.Exists;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byAttribute;
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
        // open Google
        open("http://www.google.com");

        // search for "Selenide"
        $(By.name("q")).setValue("Selenide").pressEnter();

        // check that the div with "All" exists
        $("#hdtb-msb-vis").should(exist);

        // click on the link of a search result
        $(By.linkText("Selenide: concise UI tests in Java")).click();

        // find the Selenide logo by element attribute specification
        $(byAttribute("src", "/images/selenide-logo-big.png")).should(exist);
    }

}
