package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class DeveloperManagementPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'Developer Management')]")
    WebElement DeveloperManagement;

    @FindBy(xpath = "//h4[@class='mb-3 mb-md-0'][contains(.,'Developer List')]")
    WebElement DeveloperListLabel;

    @FindBy(xpath = "//a[@href='/developer/add']")
    WebElement AddDeveloper;

    @FindBy(xpath = "//input[contains(@type,'text')]")
    WebElement Name;

    @FindBy(xpath = "//input[contains(@mask,'0*')]")
    WebElement ContactNo;

    @FindBy(xpath = "//input[contains(@type,'email')]")
    WebElement Email;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Search')]")
    WebElement SearchBtn;

    @FindBy(xpath = "//input[contains(@id,'call_name')]")
    WebElement DeveloperName;

    @FindBy(xpath = "//input[contains(@aria-describedby,'basic-addon2')]")
    WebElement SubDomainName;

    @FindBy(xpath = "//input[contains(@id,'firstName')]")
    WebElement FirstName;

    @FindBy(xpath = "//input[contains(@id,'lastName')]")
    WebElement LastName;

    @FindBy(xpath = "//input[contains(@formcontrolname,'email')]")
    WebElement EmailField;

    @FindBy(xpath = "//input[contains(@id,'mobile')]")
    WebElement ContactNumber;

    @FindBy(xpath = "//input[contains(@formcontrolname,'max_no_users')]")
    WebElement MaxNoActiveUsers;

    @FindBy(xpath = "//input[contains(@id,'max_no_projects')]")
    WebElement MaxNoProjects;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Save')]")
    WebElement SaveBtn;

    @FindBy(xpath = "//p[@class='text-danger'][contains(.,'Pool Name is required.')]")
    WebElement Validation;

    @FindBy(xpath = "//p[@class='text-danger'][contains(.,'Sub Domain Name is required.')]")
    WebElement Validation1;

    @FindBy(xpath = "//p[@class='text-danger'][contains(.,'First Name is required.')]")
    WebElement Validation2;

    @FindBy(xpath = "//p[@class='text-danger'][contains(.,'Last Name is required.')]")
    WebElement Validation3;

    @FindBy(xpath = "//p[@class='text-danger'][contains(.,'Email is required.')]")
    WebElement Validation4;

    @FindBy(xpath = "//p[@class='text-danger'][contains(.,'Contact Number is required.')]")
    WebElement Validation5;

    @FindBy(xpath = "//p[@class='text-danger'][contains(.,'Max No of Active Users is required.')]")
    WebElement Validation6;

    @FindBy(xpath = "//p[@class='text-danger'][contains(.,'Max No of Projects is required.')]")
    WebElement Validation7;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-developer-list/app-developer-list-view/div[3]/div/div/div/div[2]/div/div[1]/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[1]/datatable-body-row/div[2]/datatable-body-cell[5]/div/div/a[1]")
    WebElement EditIcon;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-developer-list/app-developer-list-view/div[3]/div/div/div/div[2]/div/div[1]/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[1]/datatable-body-row/div[2]/datatable-body-cell[5]/div/div/a[2]")
    WebElement UserIcon;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-developer-list/app-developer-list-view/div[3]/div/div/div/div[2]/div/div[1]/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[1]/datatable-body-row/div[2]/datatable-body-cell[5]/div/div/div")
    WebElement ToggleIcon;



    public DeveloperManagementPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateDeveloperManagementPageTitle(){
        return driver.getTitle();
    }

    public DeveloperManagementPage clickOnDeveloperManagementPageLink(){
        DeveloperManagement.click();
        return new DeveloperManagementPage();
    }

    public boolean verifyDeveloperListLabel(){
        return DeveloperListLabel.isDisplayed();
    }

    public boolean verifyAddDeveloperBtn(){
        return AddDeveloper.isDisplayed();
    }

    public boolean verifyNameField(){
        return  Name.isDisplayed();
    }

    public boolean verifyContactNoField(){
        return ContactNo.isDisplayed();
    }

    public boolean verifyEmailField(){
        return Email.isDisplayed();
    }

    public boolean verifySearchBtn(){
        return SearchBtn.isDisplayed();
    }

    public void verifyFilteringDeveloperListPageByName(){
        Name.click();
        Name.sendKeys("Chamika Dilshanie");
        SearchBtn.click();
    }

    public void verifyFilteringDeveloperListPageByContactNo(){
        ContactNo.click();
        ContactNo.sendKeys("769897190");
        SearchBtn.click();
    }

    public void verifyFilteringDeveloperListPageByEmail(){
        Email.click();
        Email.sendKeys("chamika.dilshanie@veracitygp.com");
        SearchBtn.click();
    }

    public void verifyMandatoryFields(){
        AddDeveloper.click();

        DeveloperName.click();
        DeveloperName.sendKeys(Keys.TAB);
        Validation.isDisplayed();

        SubDomainName.click();
        SubDomainName.sendKeys(Keys.TAB);
        Validation1.isDisplayed();

        FirstName.click();
        FirstName.sendKeys(Keys.TAB);
        Validation2.isDisplayed();

        LastName.click();
        LastName.sendKeys(Keys.TAB);
        Validation3.isDisplayed();

        EmailField.click();
        EmailField.sendKeys(Keys.TAB);
        Validation4.isDisplayed();

        ContactNumber.click();
        ContactNumber.sendKeys(Keys.TAB);
        Validation5.isDisplayed();

        MaxNoActiveUsers.click();
        MaxNoActiveUsers.sendKeys(Keys.TAB);
        Validation6.isDisplayed();

        MaxNoProjects.click();
        MaxNoProjects.sendKeys(Keys.TAB);
        Validation7.isDisplayed();
    }

    public void verifyAddingDeveloper(){
        AddDeveloper.click();

        DeveloperName.click();
        DeveloperName.sendKeys("Kamal");

        SubDomainName.click();
        SubDomainName.sendKeys("haleys");

        FirstName.click();
        FirstName.sendKeys("Kamal");

        LastName.click();
        LastName.sendKeys("Abeyasekara");

        EmailField.click();
        EmailField.sendKeys("amanthag1@gmail.com");

        ContactNumber.click();
        ContactNumber.sendKeys("729357230");

        MaxNoActiveUsers.click();
        MaxNoActiveUsers.sendKeys("10");

        MaxNoProjects.click();
        MaxNoProjects.sendKeys("10");

        try{
            WebElement element = driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Save')]"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
        }catch (MoveTargetOutOfBoundsException e){
            e.printStackTrace();
        }
        SaveBtn.click();
    }

    public void verifyEditingDeveloperInformation(){
        EditIcon.click();
        SaveBtn.click();
    }

    public void verifyViewingUserInformation(){
        UserIcon.click();
    }

    public void verifyInactivatingUser(){
        ToggleIcon.click();
    }

    public void verifyActivatingUser(){
        ToggleIcon.click();
    }
}
