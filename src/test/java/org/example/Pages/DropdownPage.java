package org.example.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class DropdownPage {
    private SelenideElement pageHeader = $("h3");
    private SelenideElement select = $(By.id("dropdown"));

    //no fluent api

    public SelenideElement getPageHeader() {
        return pageHeader;
    }
    public SelenideElement getSelect(){
        return select;
    }
}
