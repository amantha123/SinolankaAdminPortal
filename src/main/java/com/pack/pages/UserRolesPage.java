package com.pack.pages;

import com.pack.base.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.View;

public class UserRolesPage extends TestBase {

    @FindBy(xpath = "//span[@class='link-title'][contains(.,'User Roles')]")
    WebElement UserRoles;

    @FindBy(xpath = "//input[contains(@type,'text')]")
    WebElement Name;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Search')]")
    WebElement SearchBtn;

    @FindBy(xpath = "//span[@title='Admin'][contains(.,'Admin')]")
    WebElement SearchResult;

    @FindBy(xpath = "//a[contains(@id,'addButton')]")
    WebElement AddUserRoles;

    @FindBy(xpath = "//input[contains(@id,'name')]")
    WebElement RoleName;

    @FindBy(xpath = "//input[contains(@id,'description')]")
    WebElement Description;

    @FindBy(xpath = "//div[contains(@role,'combobox')]")
    WebElement Permissions;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Save')]")
    WebElement SaveBtn;

    @FindBy(xpath = "//span[@class='ng-option-label'][contains(.,'admin.permission.list')]")
    WebElement PermissionsOption;

    @FindBy(xpath = "//p[@class='text-danger'][contains(.,'Name is required.')]")
    WebElement Validation;

    @FindBy(xpath = "//p[@class='text-danger'][contains(.,'Description is required.')]")
    WebElement Validation1;

    @FindBy(xpath = "//p[@class='text-danger'][contains(.,'permissions is required.')]")
    WebElement Validation2;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-authorization/app-crop/app-crop-list/div[3]/div/div/div/div[2]/div[1]/div/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[3]/datatable-body-row/div[2]/datatable-body-cell[3]/div/div/a[1]/svg")
    WebElement EditIcon;

    @FindBy(xpath = "/html/body/app-root/app-base/div/div[2]/div/div/app-authorization/app-crop/app-crop-list/div[3]/div/div/div/div[2]/div[1]/div/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[3]/datatable-body-row/div[2]/datatable-body-cell[3]/div/div/a[2]")
    WebElement ViewIcon;

    public UserRolesPage(){
        PageFactory.initElements(driver, this);
    }

    public String validateUserRolesPageTitle(){
        return driver.getTitle();
    }

    public UserRolesPage clickOnUserRolesPageLink(){
        UserRoles.click();
        return new UserRolesPage();
    }

    public boolean verifyNameField(){
        return Name.isDisplayed();
    }

    public void filterUserRolesPageByName(){
        UserRoles.click();
        Name.click();
        Name.sendKeys("Admin");
        SearchBtn.click();
        SearchResult.isDisplayed();
    }

    public boolean verifyAddUserRolesBtn(){
        return AddUserRoles.isDisplayed();
    }

    public void verifyMandatoryFields(){
        AddUserRoles.click();
        RoleName.click();
        RoleName.sendKeys(Keys.TAB);
        Validation.isDisplayed();
        Description.click();
        Description.sendKeys(Keys.TAB);
        Validation1.isDisplayed();
        Permissions.click();
        Permissions.click();
        Validation2.isDisplayed();
    }

    public void verifyAddingUserRoles(){
        AddUserRoles.click();
        RoleName.click();
        RoleName.sendKeys("Testing Role");
        Description.click();
        Description.sendKeys("Testing Role");
        Permissions.click();
        PermissionsOption.click();
        SaveBtn.click();
    }

    public void verifyEditingUserRoles(){
        EditIcon.click();
        SaveBtn.click();
    }

    public void verifyViewingUserRoles(){
        ViewIcon.click();
    }
}
