package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.DeveloperManagementPage;
import com.pack.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeveloperManagementPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    DeveloperManagementPage developerManagementPage;

    public DeveloperManagementPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        developerManagementPage = new DeveloperManagementPage();
    }

    @Test(priority = 1)
    public void verifyDeveloperManagementPageTitleTest(){
        String developerManagementPageTitle = developerManagementPage.validateDeveloperManagementPageTitle();
        Assert.assertEquals(developerManagementPageTitle, "SLPG APP - Admin");
    }

    @Test(priority = 2)
    public void navigateDeveloperManagementPageTest(){
        developerManagementPage.clickOnDeveloperManagementPageLink();
    }

    @Test(priority = 3)
    public void verifyDeveloperManagementPageTest(){
        developerManagementPage.clickOnDeveloperManagementPageLink();
        developerManagementPage.verifyDeveloperListLabel();
        developerManagementPage.verifyAddDeveloperBtn();
        developerManagementPage.verifyNameField();
        developerManagementPage.verifyContactNoField();
        developerManagementPage.verifyEmailField();
        developerManagementPage.verifySearchBtn();
    }

    @Test(priority = 4)
    public void verifyFilteringDeveloperListPageByNameTest(){
        developerManagementPage.clickOnDeveloperManagementPageLink();
        developerManagementPage.verifyFilteringDeveloperListPageByName();
    }

    @Test(priority = 5)
    public void verifyFilteringDeveloperListPageByContactNoTest(){
        developerManagementPage.clickOnDeveloperManagementPageLink();
        developerManagementPage.verifyFilteringDeveloperListPageByContactNo();
    }

    @Test(priority = 6)
    public void verifyFilteringDeveloperListPageByEmailTest(){
        developerManagementPage.clickOnDeveloperManagementPageLink();
        developerManagementPage.verifyFilteringDeveloperListPageByEmail();
    }

    @Test(priority = 7)
    public void verifyMandatoryFieldsTest(){
        developerManagementPage.clickOnDeveloperManagementPageLink();
        developerManagementPage.verifyMandatoryFields();
    }

    @Test(priority = 8)
    public void verifyAddingDeveloperTest() throws InterruptedException{
        developerManagementPage.clickOnDeveloperManagementPageLink();
        developerManagementPage.verifyAddingDeveloper();
        Thread.sleep(5000);
    }

    @Test(priority = 9)
    public void verifyEditingDeveloperInformationTest(){
        developerManagementPage.clickOnDeveloperManagementPageLink();
        developerManagementPage.verifyEditingDeveloperInformation();
    }

    @Test(priority = 10)
    public void verifyViewingUserInformationTest(){
        developerManagementPage.clickOnDeveloperManagementPageLink();
        developerManagementPage.verifyViewingUserInformation();
    }

    @Test(priority = 11)
    public void verifyInactivatingUserTest(){
        developerManagementPage.clickOnDeveloperManagementPageLink();
        developerManagementPage.verifyInactivatingUser();
    }

    @Test(priority = 12)
    public void verifyActivatingUserTest(){
        developerManagementPage.clickOnDeveloperManagementPageLink();
        developerManagementPage.verifyActivatingUser();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
