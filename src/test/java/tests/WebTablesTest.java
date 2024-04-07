package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class WebTablesTest {

    @Test
    public void testAddAndEditRecord() {
        // Web sayfasını aç
        open("https://demoqa.com/webtables");

        // "ADD" düğmesine tıkla ve yeni bir kayıt ekle
        $("#addNewRecordButton").click();
        $(".modal-content").shouldBe(Condition.visible);
        $("#firstName").setValue("Bekir");
        $("#lastName").setValue("Yumrutepe");
        $("#userEmail").setValue("bcyumrutepe@gmail.com");
        $("#age").setValue("30");
        $("#salary").setValue("50000");
        $("#department").setValue("Engineering");
        $("#submit").click();

        // Eklenen kaydı düzenle
        $("#edit-record-1").click();
        $("#firstName").setValue("Bekir Can");
        $("#lastName").setValue("Yumrutepe");
        $("#submit").click();

        // Kaydın düzeltilmiş halini kontrol et
        $$(".rt-td").findBy(Condition.text("Bekir Can")).should(Condition.exist);
    }
}
