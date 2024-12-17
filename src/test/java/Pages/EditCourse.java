package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class EditCourse {
    WebDriver driver;
    public By enterCourseNameField = By.id("searchString");
    public By searchButton = By.xpath("//button[@type='submit'][@id='btnSearch']");
    //public By editCourseButton = By.xpath("//td[contains(text(),'mdtest-thath-Course1']/following-sibling::td/a[contains(@class,glyphicon glyphicon-pencil editLink btn btn-xs btn-primary)]");
    public By editCourseButton = By.xpath("//a[@class='glyphicon glyphicon-pencil editLink btn btn-xs btn-primary'][@href = '/Course/Edit?courseId=109347']");
    public By courseLessonTab = By.xpath("//a[@href='#tabCourseLessons']");
    public By addNewLessonButton = By.xpath("//button[@type='button'][@onclick='ShowAddLessonModal()']");
    public By lessonNameField = By.xpath("//input[@type = 'text'][@id='lessonName_1']");
    public By addNewLessonPopupButton = By.xpath("(//button[@type='button'][@class='btn btn-primary'])[15]");
    public By addNewLessonPopup = By.id("addCourseLessonModal");
    public By courseOverViewTab = By.xpath("//a[@href = '#tabCourseOverview']");
    public By status = By.xpath("//input[@name = 'rdoStatus'][@id = 'rdoStatusActive']");
    public By updateCourseButton = By.xpath("//button[@type = 'submit'][@onclick = 'return validateForm()']");
    public By languageSelector = By.xpath("//div[@class = 'chosen-container chosen-container-multi'][@title = 'Multiple Course Languages']");
    public By chooseLanguage = By.cssSelector("ul.chosen-choices>li");
    public By typeLanguage = By.xpath("//input[@type = 'text'][@value= 'Select Course Languages']");
    public By courseModalitySelector = By.xpath("//div[@class = 'chosen-container chosen-container-single'][@ id = 'cmbModality_chosen']");
    public By chooseModality = By.cssSelector("ul.chosen-results>li");

    public By editLessonButton = By.xpath("//a[@class= 'glyphicon glyphicon-pencil editLink btn btn-xs btn-primary' ][@href='/Lesson/Edit?lessonId=132588']");
    public By learningObjectivesTab = By.xpath("//a[@href='#tabLessonLearningObjectives']");
    public By addNewLearningObjectiveButton = By.xpath("//button[@type='button'][@class= 'btn btn-sm btn-success'][@onclick='AddNewLearningObj()']");
    public By learningObjectivePopup = By.id("AddNewLearningObjectiveModal");

    public EditCourse(WebDriver driver){
        this.driver = driver;
    }
    public void setEnterCourseNameField(String courseName){
        driver.findElement(enterCourseNameField).sendKeys(courseName);
    }
    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }
    public void clickEditCourseButton(){
        driver.findElement(editCourseButton).click();
    }
    public void clickCourseLessonTab(){
        driver.findElement(courseLessonTab).click();
    }
    public void clickAddNewLessonButton(){
        driver.findElement(addNewLessonButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(addNewLessonPopup));
    }
    public void setLessonNameField(String lessonName){
        driver.findElement(lessonNameField).sendKeys(lessonName);
    }
    public void clickAddNewLessonPopupButton() throws InterruptedException {

        driver.findElement(addNewLessonPopupButton).click();
        Thread.sleep(1000);

    }

    public void clickCourseOverviewTab() throws InterruptedException {
        driver.findElement(courseOverViewTab).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(1000);

    }
    public void clickStatus(){
        driver.findElement(status).click();
    }
    public void clickUpdateCourseButton(){
        driver.findElement(updateCourseButton).click();
    }
    public void clickLanguageSelector(){
        driver.findElement(languageSelector).click();
    }

    public void selectLanguage(String language){
        driver.findElement(typeLanguage).sendKeys(language);
    }
    public void clickCourseModality(){
        driver.findElement(courseModalitySelector).click();
    }
    public void selectModality(String modality){
        List<WebElement> modalityList = driver.findElements(chooseModality);
        for(WebElement modalities: modalityList){
            if (modalities.getText().trim().equals(modality)){
                modalities.click();
            }
        }
    }

}

