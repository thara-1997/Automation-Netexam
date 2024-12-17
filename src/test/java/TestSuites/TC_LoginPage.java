package TestSuites;

import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_LoginPage extends BaseClass {

    @Test
    public void verifySuccessfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameField("MDQA@netexam.com");
        loginPage.setPasswordField("Qc6%cSxYU%J7");
        loginPage.clickLoginButton();
        loginPage.validateLogin();
    }
    @Test
    public void verifyUnsuccessfulLogin(){
        LoginPage loginPage1 = new LoginPage(driver);
        loginPage1.setPasswordField("Thara");
        loginPage1.setPasswordField("thara@1997");
        loginPage1.clickLoginButton();
        loginPage1.validateLogin();
    }


}
