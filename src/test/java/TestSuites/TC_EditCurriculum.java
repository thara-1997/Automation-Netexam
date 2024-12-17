package TestSuites;

import Pages.*;
import org.testng.annotations.Test;

public class TC_EditCurriculum extends BaseClass {
    String editCurriculum = "mdtest-nayanathara-curriculum";
    @Test
    public void verifySuccessfulEditCurriculum(){
        //log to the website
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("Qc6%cSxYU%J7");
        loginPage.clickLoginButton();

        //select the company
        CompanySelectionPage companySelectionPage = new CompanySelectionPage(driver);
        companySelectionPage.clickDropdownSelector();
        companySelectionPage.selectCompany("AMD");
        companySelectionPage.clickSubmitButton();

        //navigate from side menu
        HomePage homePage = new HomePage(driver);
        homePage.clickNavBarSelect();
        homePage.clickCreateCurriculum();

        //create the curriculum
        CreateCurriculum createCurriculum = new CreateCurriculum(driver);
        createCurriculum.setCurriculumNameField(editCurriculum);
        createCurriculum.clickSubmitButton();

        //navigate to the curriculum that want to edit
        Curriculums curriculums = new Curriculums(driver);
        curriculums.clickEditButton();

        //edit the curriculum name
        EditCurriculumn editCurriculumn = new EditCurriculumn(driver);
        editCurriculumn.setEditCurriculumField();
        editCurriculumn.clickSubmitButton();

        curriculums.validateSuccessfulEditCurriculum(editCurriculum);
    }
@Test(priority = 0)
    public void VerifySuccessfulCourseCreation(){
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
    homePage.clickCreateCurriculum();

    CreateCurriculum createCurriculum = new CreateCurriculum(driver);
    createCurriculum.setCurriculumNameField(editCurriculum);
    createCurriculum.clickSubmitButton();

    Curriculums curriculums = new Curriculums(driver);
    curriculums.clickEditButton();

    EditCurriculumn editCurriculumn = new EditCurriculumn(driver);
    editCurriculumn.clickCurriculumCourses();
    editCurriculumn.clickAddNewCoursesButton();
    editCurriculumn.setCourseNameField("mdtest-nayanathara-Course");
    editCurriculumn.clickAddButton();
    editCurriculumn.validateSuccessfulCourseCreation();

}
@Test(priority = 1)
public void verifyUnsuccessfulCourseCreation(){
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
    homePage.clickCreateCurriculum();

    CreateCurriculum createCurriculum = new CreateCurriculum(driver);
    createCurriculum.setCurriculumNameField(editCurriculum);
    createCurriculum.clickSubmitButton();

    Curriculums curriculums = new Curriculums(driver);
    curriculums.clickEditButton();

    EditCurriculumn editCurriculumn = new EditCurriculumn(driver);
    editCurriculumn.clickCurriculumCourses();
    editCurriculumn.clickAddNewCoursesButton();
    editCurriculumn.setCourseNameField("");
    editCurriculumn.clickAddButton();
    editCurriculumn.validateEmptyCourseName();
}
}
