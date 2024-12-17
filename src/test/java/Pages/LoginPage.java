package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
  public WebDriver driver;
  public By usernameField = By.id("username");
  public By passwordField = By.id("password");
  public By loginButton = By.xpath("//button[@type = 'submit']");

  public LoginPage(WebDriver driver) {
    this.driver = driver;
  }
  public void setUsernameField(String username){
    driver.findElement(usernameField).sendKeys(username);
  }
  public void setPasswordField(String password){
    driver.findElement(passwordField).sendKeys(password);
  }
  public void clickLoginButton(){
    driver.findElement(loginButton).click();
  }
  public void validateLogin(){
    String actualTitle = driver.getTitle();
    String expectedTitle = "NetExam Switch Accounts";
    if (actualTitle.equalsIgnoreCase(expectedTitle))
      System.out.println("TC01 - Title Matched Successful Login");
    else
      System.out.println("TC02 - Title Matched Unsuccessful Login");
  }
}
