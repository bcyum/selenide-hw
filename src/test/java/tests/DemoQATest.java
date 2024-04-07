package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DemoQATest {

    @Test
    public void testButtonClick() {

        open("https://demoqa.com/elements");


        SelenideElement buttonsSection = $("#item-4");
        buttonsSection.scrollIntoView(true).click();


        SelenideElement clickMeButton = $("#doubleClickBtn");
        clickMeButton.doubleClick();
        SelenideElement message = $("p#doubleClickMessage");
        message.shouldBe(Condition.visible).shouldHave(Condition.text("You have done a double click"));

        sleep(2000);
    }
}

