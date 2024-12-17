package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CompanySelectionPage {
    public WebDriver driver;
    public By dropdownSelector = By.xpath("//div[@class= 'chosen-container chosen-container-single']");
    public By submitButton = By.cssSelector("button.login.login-btn");
    public By chooseCompany = By.cssSelector("ul.chosen-results>li");

    public CompanySelectionPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickDropdownSelector(){
        driver.findElement(dropdownSelector).click();
    }
    public void selectCompany(String companyName){
        List<WebElement> comapnyList = driver.findElements(chooseCompany);
        for(WebElement company: comapnyList) {
            if (company.getText().trim().equals(companyName)) {
                company.click();
            }
        }
    }

    public void clickSubmitButton(){

        driver.findElement(submitButton).click();
        //driver.navigate().refresh();
       // driver.navigate().back();
    }
    public void validateCompanySelection(String loggedCompany){
      if (driver.getPageSource().contains(loggedCompany)){
          System.out.println("Successfully logged to the:" +loggedCompany);
      }
      else {
          System.out.println("Unsuccessfully logged to the:" +loggedCompany);
      }
    }

}
