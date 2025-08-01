package org.example;


import com.codeborne.selenide.testng.TextReport;
import org.example.Pages.DropdownPage;
import org.example.Pages.TheHerokuMainPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;

@Listeners({TextReport.class})
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
