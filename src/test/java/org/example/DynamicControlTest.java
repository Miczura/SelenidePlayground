package org.example;



import org.example.Pages.DynamicControlsPage;
import org.example.Pages.TheHerokuMainPage;
import org.testng.annotations.Test;


public class DynamicControlTest extends TestBase {
    @Test
    public void verifyCheckboxIsGoneAfterClickingRemove() {
        TheHerokuMainPage mainPage = new TheHerokuMainPage();
        DynamicControlsPage dynamicPage = mainPage.enterDynamicControlsPage();

        dynamicPage
                .clickRemoveButton()
                .verifyCheckboxDisappeared()
                .verifyGoneMessage();
    }

    @Test
    public void verifyCheckboxComesBackAfterClickingAdd() {
        TheHerokuMainPage mainPage = new TheHerokuMainPage();
        DynamicControlsPage dynamicPage = mainPage.enterDynamicControlsPage();

        dynamicPage
                .clickRemoveButton()
                .verifyCheckboxDisappeared()
                .verifyGoneMessage()
                .clickAddButton()
                .verifyCheckboxReappeared();
    }
}
