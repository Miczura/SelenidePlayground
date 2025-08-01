package org.example;


import org.example.Pages.AddRemoveElementsPage;
import org.example.Pages.TheHerokuMainPage;
import org.testng.annotations.Test;



public class AddRemoveElementTest extends TestBase{
    @Test
    public void verifyIfAddElementButtonIsClickableTest(){
        TheHerokuMainPage mainPage = new TheHerokuMainPage();
        AddRemoveElementsPage addRemoveElementsPage = mainPage.enterAddRemoveElementsPage();

        addRemoveElementsPage.verifyAddButtonIsClickable();
    }
    @Test
    public void addAndRemoveSomeElementsAndVerifyTheResultTest(){
        TheHerokuMainPage mainPage = new TheHerokuMainPage();
        AddRemoveElementsPage addRemoveElementsPage = mainPage.enterAddRemoveElementsPage();

        addRemoveElementsPage.addElements(5)
                .deleteElements(2)
                .verifyDeleteButtonCount(3);
    }

}
