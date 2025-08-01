package org.example.Pages;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Selenide.$;


public class TheHerokuMainPage {
    private SelenideElement dropdownPageLink = $("a[href='/dropdown']");


    public DropdownPage enterDropdownPage() {
        dropdownPageLink.click();
        return new DropdownPage();
    }

}
