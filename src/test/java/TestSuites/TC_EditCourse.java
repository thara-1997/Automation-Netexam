package TestSuites;

import Pages.CompanySelectionPage;
import Pages.EditCourse;
import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_EditCourse extends BaseClass {
    @Test
    public void verifySuccessfulEditCourse() throws InterruptedException {
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
        homePage.clickCourses();

        //search course
        EditCourse editCourse = new EditCourse(driver);
        editCourse.setEnterCourseNameField("mdtest-thath-Course1");
        editCourse.clickSearchButton();
        editCourse.clickEditCourseButton();
        //editCourse.clickCourseLessonTab();
        //editCourse.clickAddNewLessonButton();
        //editCourse.setLessonNameField("mdtest-thath-lesson2");
        //editCourse.clickAddNewLessonPopupButton();
        editCourse.clickCourseOverviewTab();
        editCourse.clickStatus();
        //editCourse.clickLanguageSelector();
        //editCourse.selectLanguage("Français");
        editCourse.clickCourseModality();
        editCourse.selectModality("Class Room");
        editCourse.clickUpdateCourseButton();

    }

    public void verifySuccessfulObjectiveCreation(){
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
        homePage.clickCourses();

        //search course
        EditCourse editCourse = new EditCourse(driver);
        editCourse.setEnterCourseNameField("mdtest-thath-Course1");
        editCourse.clickSearchButton();
        editCourse.clickEditCourseButton();
        editCourse.clickCourseLessonTab();

    }
}
