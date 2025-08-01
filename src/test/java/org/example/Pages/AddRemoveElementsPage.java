package org.example.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.example.TestBase;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class AddRemoveElementsPage extends TestBase {
    private SelenideElement addButton = $("button[onclick='addElement()']");
    private ElementsCollection deleteButtons = $$("button.added-manually");

    public AddRemoveElementsPage addElements(int count) {
        for (int i = 0; i < count; i++) addButton.click();
        return this;
    }
    //fluent api
    public AddRemoveElementsPage deleteElements(int count) {
        for (int i =0;i<count;i++) deleteButtons.first().click();
        return this;
    }
    public AddRemoveElementsPage verifyDeleteButtonCount(int expectedCount) {
        deleteButtons.shouldHave(size(expectedCount));
        return this;
    }
    public AddRemoveElementsPage verifyAddButtonIsClickable() {
        addButton.shouldBe(visible).shouldBe(enabled);
        return this;
    }
}
