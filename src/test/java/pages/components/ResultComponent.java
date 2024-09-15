package pages.components;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ResultComponent {
    public ResultComponent checkTable(String valueResult) {
        $(".table").shouldHave(text(valueResult));

        return this;
    }
}

