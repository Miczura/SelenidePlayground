package org.example.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class DynamicControlsPage {
    private SelenideElement removeButton = $("button[onclick='swapCheckbox()']");
    private SelenideElement checkboxContainer = $("#checkbox");
    private SelenideElement message = $("#message");

    public DynamicControlsPage clickRemoveButton() {
        removeButton.click();
        return this;
    }

    public DynamicControlsPage verifyCheckboxDisappeared() {
        checkboxContainer.should(disappear);
        return this;
    }

    public DynamicControlsPage verifyGoneMessage() {
        message.shouldHave(text("It's gone!"));
        return this;
    }
    public DynamicControlsPage clickAddButton() {
        removeButton.shouldHave(text("Add")).click();
        return this;
    }

    public DynamicControlsPage verifyCheckboxReappeared() {
        checkboxContainer.shouldBe(visible);
        return this;
    }
}
