package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCurriculum {
    public WebDriver driver;
    public By curriculumNameField = By.id("txtCurriculumName");
    public By submitButton = By.xpath("//button[@type = 'submit']");
    public By curriculumNameRequiredMessage = By.cssSelector("span.field-validation-error");
    public By duplicateErrorMessage = By.id("duplicateErrorMsg");
    public CreateCurriculum(WebDriver driver){
        this.driver = driver;
    }

    public void setCurriculumNameField(String txtCurriculumName){
        driver.findElement(curriculumNameField).sendKeys(txtCurriculumName);
    }
    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public void validateEmptyCreateCurriculum() {
        if (driver.findElement(curriculumNameRequiredMessage).isDisplayed()) {
            System.out.println("Curriculum Name is required");
        }
    }
    public void validateDuplicateCurriculum() {
            if (driver.findElement(duplicateErrorMessage).isDisplayed()) {
                System.out.println("A curriculum with that name already exists. Please choose a different name");
            }
        }

}
