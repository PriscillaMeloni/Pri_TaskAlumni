package com.Practice_CyberTeckSchool.step_definitions;

import com.Practice_CyberTeckSchool.pages.HomePage;
import com.Practice_CyberTeckSchool.utilities.BrowserUtils;
import com.Practice_CyberTeckSchool.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage_stepDefinitions {



    @Given("User is on Practice home page")
    public void user_is_on_practice_home_page() {
        Driver.getDriver().get("http://practice.cybertekschool.com/");
    }
    @Then("User sees Practice in the window title")
    public void user_sees_practice_in_the_window_title() {
        String expectedTitle = "Practice";
        Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
    }

    @Then("User sees Test Automation Practice is in the main header")
    public void user_sees_is_in_the_main_header() {
        String expectedTitle = "Test Automation Practice";
        Assert.assertEquals(expectedTitle, homePage.headTitle.getText());
    }


    @Then("User sees Available Examples is in the subtitle")
    public void user_sees_is_in_the_subtitle() {
        String expectedSubTitle = "Available Examples";
        Assert.assertEquals(expectedSubTitle, homePage.homeSubTitle.getText());
    }

    @Then("User access Home link on top of the Page")
    public void user_access_home_link_on_top_of_the_page() {
        homePage.homeLink.click();
    }

    @Then("User access CYDEO link on the bottom of the Page")
    public void user_access_cydeo_link_on_the_bottom_of_the_page() {
      homePage.CydeoLink.click();
    }

    HomePage homePage = new HomePage();

    @Then("user clicks on each {string} from the page")
    public void user_clicks_on_each_from_the_page(String option) {
        homePage.linkOptions(option);
    }

    @And("user verify if the {string} are displayed")
    public void userVerifyIfTheAreDisplayed(String option) {
        homePage.linkOptionsIsDisplayed(option);

    }







  /*  @Then("user see each {string} from the page")
    public void user_see_each_from_the_page(String link) {
        BrowserUtils.sleep(1);
       homePage.ListOfLinks();

       /* for (WebElement each : homePage.ListOfLinks()) {
            BrowserUtils.sleep(2);
            each.click();
            if (each.equals(homePage.basicAuth)){
               Driver.getDriver().switchTo().window()
            }
        }

        */
  //  }



}
