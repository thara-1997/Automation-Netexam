package TestSuites;

import Pages.*;
import org.testng.annotations.Test;

public class TC_CreateCurriculum extends BaseClass {
    @Test(priority = 0)
    public void verifySuccessfulCreateCurriculum(){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.setUsernameField("MDQA@netexam.com");
            loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
            loginPage.clickLoginButton();

            CompanySelectionPage companySelectionPage = new CompanySelectionPage(driver);
            companySelectionPage.clickDropdownSelector();
            companySelectionPage.selectCompany("AMD");
            companySelectionPage.clickSubmitButton();

            HomePage homePage = new HomePage(driver);
            homePage.clickNavBarSelect();
            homePage.clickCreateCurriculum();

            CreateCurriculum createCurriculum = new CreateCurriculum(driver);
            createCurriculum.setCurriculumNameField("mdtest-thathsarani-currNew");
            createCurriculum.clickSubmitButton();

            Curriculums curriculums = new Curriculums(driver);
            curriculums.validateSuccessfulCreateCurriculum("mdtest-thathsarani-currNew");
        }
        @Test(priority = 1)
        public void verifyDuplicateCurriculumCreation(){
                LoginPage loginPage = new LoginPage(driver);
                loginPage.setUsernameField("MDQA@netexam.com");
                loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
                loginPage.clickLoginButton();

                CompanySelectionPage companySelectionPage = new CompanySelectionPage(driver);
                companySelectionPage.clickDropdownSelector();
                companySelectionPage.selectCompany("AMD");
                companySelectionPage.clickSubmitButton();

                HomePage homePage = new HomePage(driver);
                homePage.clickNavBarSelect();
                homePage.clickCreateCurriculum();

                CreateCurriculum createCurriculum = new CreateCurriculum(driver);
                createCurriculum.setCurriculumNameField("mdtest-thathsarani-curriculum1");
                createCurriculum.clickSubmitButton();
                createCurriculum.validateDuplicateCurriculum();
        }

        @Test(priority = 2)
        public void unsuccessfulCreateCurriculum() {
                LoginPage loginPage = new LoginPage(driver);
                loginPage.setUsernameField("MDQA@netexam.com");
                loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
                loginPage.clickLoginButton();

                CompanySelectionPage companySelectionPage = new CompanySelectionPage(driver);
                companySelectionPage.clickDropdownSelector();
                companySelectionPage.selectCompany("AMD");
                companySelectionPage.clickSubmitButton();

                HomePage homePage = new HomePage(driver);
                homePage.clickNavBarSelect();
                homePage.clickCreateCurriculum();

                CreateCurriculum createCurriculum = new CreateCurriculum(driver);
                createCurriculum.setCurriculumNameField("");
                createCurriculum.clickSubmitButton();
                createCurriculum.validateEmptyCreateCurriculum();
        }

}
