package com.pack.testcases;

import com.pack.base.TestBase;
import com.pack.pages.DashboardPage;
import com.pack.pages.LoginPage;
import com.pack.pages.UserRolesPage;
import com.pack.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserRolesPageTest extends TestBase {

    LoginPage loginPage;
    DashboardPage dashboardPage;
    UserRolesPage userRolesPage;

    String sheetName = "User Roles";

    public UserRolesPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
        dashboardPage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
        userRolesPage = new UserRolesPage();
    }

    @Test(priority = 1)
    public void usersRolesPageTitleTest(){
        String title = userRolesPage.validateUserRolesPageTitle();
        Assert.assertEquals(title, "SLPG APP - Admin");
    }

    @Test(priority = 2)
    public void navigateUserRolesPageTest(){
        userRolesPage.clickOnUserRolesPageLink();
    }

    @Test(priority = 3)
    public void verifyUserRolesPageTest(){
        userRolesPage.clickOnUserRolesPageLink();
        userRolesPage.verifyNameField();
        userRolesPage.verifyAddUserRolesBtn();
    }


    @Test(priority = 4)
    public void filterUserRolesPageTest(){
        userRolesPage.clickOnUserRolesPageLink();
        userRolesPage.filterUserRolesPageByName();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 5)
    public void verifyMandatoryFieldsTest(){
        userRolesPage.clickOnUserRolesPageLink();
        userRolesPage.verifyMandatoryFields();
    }


    @Test(priority = 6)
    public void verifyAddingUserRolesTest(){
        userRolesPage.clickOnUserRolesPageLink();
        userRolesPage.verifyAddingUserRoles();
        synchronized (this){
            try{
                this.wait(100);
                System.out.println("Thread in runnable state");
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Test(priority = 7)
    public void verifyEditingUserRolesTest(){
        userRolesPage.clickOnUserRolesPageLink();
        userRolesPage.verifyEditingUserRoles();
    }

    @Test(priority = 8)
    public void verifyViewingUserRolesTest(){
        userRolesPage.clickOnUserRolesPageLink();
        userRolesPage.verifyViewingUserRoles();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
