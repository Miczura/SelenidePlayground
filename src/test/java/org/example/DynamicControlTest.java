package org.example;



import com.codeborne.selenide.testng.TextReport;
import org.example.Pages.DynamicControlsPage;
import org.example.Pages.TheHerokuMainPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TextReport.class})
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
