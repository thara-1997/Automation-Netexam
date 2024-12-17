package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;

    public By navBarSelect = By.cssSelector("span.Courses");
    public By createCurriculum = By.id("Create Curriculum");

   // public By createCurriculum = By.linkText("Create Curriculum");


    public By curriculum = By.id("Curriculums");

    public By courses = By.xpath("//a[@id='Courses'][@data-customid='Courses'][@class ='sub-menu-item']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickNavBarSelect(){
        driver.findElement(navBarSelect).click();
    }
    public void clickCreateCurriculum(){
        driver.findElement(createCurriculum).click();
    }

    public void clickCurriculum(){
        driver.findElement(curriculum).click();
    }
    public void clickCourses(){
        driver.findElement(courses).click();
    }
    public void validateClickCurriculum(){
        if (driver.getPageSource().contains("Curriculums")){
            System.out.println("Successfully navigate to  create curriculum page" );
        }
        else {
            System.out.println("Unsuccessfully navigate create curriculum page");
        }
    }
    public void validateCreateCurriculum(){
        if (driver.getPageSource().contains("To Create a Curriculum")){
            System.out.println("Successfully navigate to  create curriculum page" );
        }
        else {
            System.out.println("Unsuccessfully navigate create curriculum page");
        }
    }

}
