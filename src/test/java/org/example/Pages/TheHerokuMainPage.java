package org.example.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;


public class TheHerokuMainPage {
    private SelenideElement dropdownPageLink = $("a[href='/dropdown']");
    private SelenideElement addRemoveElementLink = $(By.linkText("Add/Remove Elements"));
    private SelenideElement dynamicControlsLink = $("a[href='/dynamic_controls']");

    public DropdownPage enterDropdownPage() {
        dropdownPageLink.click();
        return new DropdownPage();
    }
    public AddRemoveElementsPage enterAddRemoveElementsPage(){
        addRemoveElementLink.click();
        return new AddRemoveElementsPage();
    }
    public DynamicControlsPage enterDynamicControlsPage() {
        dynamicControlsLink.click();
        return new DynamicControlsPage();
    }
}
