package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DemoQATest {

    @Test
    public void testButtonClick() {
        // Web sayfasını aç
        open("https://demoqa.com/elements");

        // "Buttons" öğesine tıkla
        SelenideElement buttonsSection = $("#item-4");
        buttonsSection.scrollIntoView(true).click();

        // "Click Me" düğmesine tıkla ve görünen mesajı oku
        SelenideElement clickMeButton = $("button#doubleClickBtn");
        clickMeButton.doubleClick();
        SelenideElement message = $("p#doubleClickMessage");
        message.shouldBe(Condition.visible).shouldHave(Condition.text("You have done a double click"));

        // Geçiş yapmak için bekleyebiliriz, örneğin:
        sleep(2000);
    }
}

