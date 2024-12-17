package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EditCurriculumn {
    WebDriver driver;
    public By editCurriculumField = By.id("txtCurriculumName");
    public By submitButton = By.xpath("//button[@type = 'submit']");
    public By curriculumCourses = By.xpath("//a[@class = 'tab_bac'][@aria-controls='tabCurriculumCourses']");
    public By addNewCourseButton = By.xpath("//button[@type='button'][@class='btn btn-sm btn-success'][@onclick='AddNewCourse()']");
    public By courseNameField = By.id("courseName");
    public By addButton = By.xpath("//button[@type = 'button'][@class = 'btn btn-primary'][@id='addbtn']");
    public By courseNameRequiredMessage = By.id("lblDisplayCourse");
    public By duplicateCourseNameErrorMessage = By.id("lblDisplayCourse");



    public By addNewCoursePopup = By.id("AddNewCourseModal");
    public EditCurriculumn(WebDriver driver){
        this.driver = driver;
    }
    public void setEditCurriculumField(){
        String previousText = driver.findElement(editCurriculumField).getAttribute("value");
        driver.findElement(editCurriculumField).clear();
        driver.findElement(editCurriculumField).sendKeys("abc" + previousText);
    }
    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

    public void clickCurriculumCourses(){
        driver.findElement(curriculumCourses).click();
    }
    public void clickAddNewCoursesButton(){

        driver.findElement(addNewCourseButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(addNewCoursePopup));

    }
    public void setCourseNameField(String courseName){
        driver.findElement(courseNameField).sendKeys(courseName);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,600)");

    }
    public void clickAddButton(){
        driver.findElement(addButton).click();
    }

    public void validateSuccessfulCourseCreation(){
        if (driver.getPageSource().contains("Edit Curriculum / Add Course")){
            System.out.println("Successfully created the course");
        }
    }
    public void validateEmptyCourseName(){
       if(driver.findElement(courseNameRequiredMessage).isDisplayed()){
          System.out.println("Please enter a course name.");
       }
    }
    public void validateDuplicateCourseName(){
        if(driver.findElement(duplicateCourseNameErrorMessage).isDisplayed()){
            System.out.println("A course with that name already exists. Please choose a different name.");
        }
    }
}
