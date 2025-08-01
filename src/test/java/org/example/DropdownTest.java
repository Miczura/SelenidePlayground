package org.example;


import org.example.Pages.DropdownPage;
import org.example.Pages.TheHerokuMainPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;


public class DropdownTest extends TestBase{
    @Test
    public void verifyIfOption2IsSelectedTest() {
        TheHerokuMainPage mainPage = new TheHerokuMainPage();
        DropdownPage dropdownPage = mainPage.enterDropdownPage();


        dropdownPage.getPageHeader().shouldHave(text("Dropdown List"));
        dropdownPage.getSelect().selectOption("Option 1"); ;
        dropdownPage.getSelect().getSelectedOption().shouldHave(text("Option 1"));

    }

}
