package TestSuites;

import Pages.CompanySelectionPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_CompanySelectionPage extends BaseClass {
    private String companyName = "Hexagon";
    @Test
    public void verifySuccessfulCompanySelection(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
        loginPage.clickLoginButton();

        CompanySelectionPage companySelectionPage = new CompanySelectionPage(driver);
        companySelectionPage.clickDropdownSelector();
        companySelectionPage.selectCompany(companyName);
        companySelectionPage.clickSubmitButton();

        companySelectionPage.validateCompanySelection(companyName);
    }
    @Test
    public void verifyUnsuccessfulCompanySelection(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("6h4lL0Dmhe7rytEk");
        loginPage.clickLoginButton();

        CompanySelectionPage companySelectionPage = new CompanySelectionPage(driver);
        companySelectionPage.clickDropdownSelector();
        companySelectionPage.selectCompany("AMD");
        companySelectionPage.clickSubmitButton();

        companySelectionPage.validateCompanySelection(companyName);
    }

}
