package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

   public class Curriculums {
   public WebDriver driver;


   public By editButton = By.xpath("//a[@class = 'glyphicon glyphicon-pencil editLink btn btn-xs btn-primary']");

   public By enterCurriculumField = By.id("currriculumName");
   public By searchButton = By.xpath("//button[@id='btnSearch' ]");

   public Curriculums(WebDriver driver){
           this.driver = driver;
       }
   public void clickEditButton(){
       driver.findElement(editButton).click();
   }

   public void enterCurriculumName(String curriculumName){
       driver.findElement(enterCurriculumField).sendKeys(curriculumName);
   }
   public void clickSearchButton(){
       driver.findElement(searchButton).click();
   }

   public void validateSuccessfulCreateCurriculum( String curriculumName){
        if(driver.getPageSource().contains(curriculumName)){
            System.out.println("Successfully Created the Curriculum" + curriculumName);
        }

    }
    public void validateSuccessfulEditCurriculum(String curriculum){
       if (driver.getPageSource().contains(curriculum)){
           System.out.println("Successfully edit the curriculum" +curriculum);
       }
    }
    public void validateSearchCurriculum(String curriculum){
       if (driver.getPageSource().contains(curriculum)){
           System.out.println("Successfully Search the curriculum " +curriculum);
       }
    }

}
