package TestSuites;

import Pages.CompanySelectionPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_HomePage extends BaseClass {

    @Test
    public void verifyNavBarSelection(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("Qc6%cSxYU%J7");
        loginPage.clickLoginButton();

        CompanySelectionPage companySelectionPage = new CompanySelectionPage(driver);
        companySelectionPage.clickDropdownSelector();
        companySelectionPage.selectCompany("AMD");
        companySelectionPage.clickSubmitButton();

        HomePage homePage = new HomePage(driver);
        homePage.clickNavBarSelect();
        homePage.clickCourses();
        //homePage.clickCreateCurriculum();

        //homePage.validateCreateCurriculum();

    }
}
