package com.Practice_CyberTeckSchool.pages;

import com.Practice_CyberTeckSchool.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HomePage {

public HomePage(){ //constructor
    PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(className= "h1y")
    public WebElement headTitle;

    @FindBy(className= "h2")
    public WebElement homeSubTitle;

    @FindBy(xpath = "//a[.='Home']")
    public WebElement homeLink;

    @FindBy(xpath = "//a[.='CYDEO']")
    public WebElement CydeoLink;

    @FindBy(xpath = "//a[.='A/B Testing']")
    public WebElement ABTestingLink;

    @FindBy(xpath = "//a[.='Forgot Password']")
    public WebElement forgotPassword;

    @FindBy(xpath = "//a[normalize-space()='Basic Auth']")
    public WebElement basicAuth;

    @FindBy(xpath = "//a[.='Add/Remove Elements']")
    public WebElement AddRemoveElementsLink;

    @FindBy(xpath = "//a[.='Autocomplete']")
    public WebElement AutoCompleteLink;

    @FindBy(xpath = "//a[.='Broken Images']")
    public WebElement BrokenImagesLink;

    @FindBy(xpath = "//a[.='Challenging DOM']")
    public WebElement ChallengingDOMLink;


    public void linkOptions(String option){
        Driver.getDriver().findElement(By.xpath("//a[.='"+option+"']")).click();
    }

    public void linkOptionsIsDisplayed(String option){
        Driver.getDriver().findElement(By.xpath("//a[.='"+option+"']")).isDisplayed();
    }


/*
    public List<WebElement> ListOfLinks(){
        List<WebElement> list2 = new ArrayList<>();
      //  list2.add(CheckboxesLink);
        list2.add(ChallengingDOMLink);
        list2.add(ABTestingLink);
        list2.add(AddRemoveElementsLink);
        list2.add(AutoCompleteLink);
        list2.add(BrokenImagesLink);
            for (WebElement element : list2) {
                element.click();
            }
            return list2;
    }

 */


}
