package TestSuites;

import Pages.CompanySelectionPage;
import Pages.Curriculums;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_SearchCurriculum extends BaseClass{
    @Test
    public void verifySearchCurriculum(){
        //log to the website
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
        loginPage.clickLoginButton();

        //select the company
        CompanySelectionPage companySelectionPage = new CompanySelectionPage(driver);
        companySelectionPage.clickDropdownSelector();
        companySelectionPage.selectCompany("AMD");
        companySelectionPage.clickSubmitButton();

        //navigate from side menu
        HomePage homePage = new HomePage(driver);
        homePage.clickNavBarSelect();
        homePage.clickCurriculum();

        //search the curriculum
        Curriculums curriculums = new Curriculums(driver);
        curriculums.enterCurriculumName("mdtest-thathsarani-curriculumNew1");
        curriculums.clickSearchButton();
        curriculums.clickEditButton();
        curriculums.validateSearchCurriculum("mdtest-thathsarani-curriculumNew1");

    }

}
