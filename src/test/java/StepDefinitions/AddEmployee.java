package StepDefinitions;

import PageObjectModel.AddEmployeePage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;

public class AddEmployee extends CommonMethods {
  //  public AddEmployeePage add=new AddEmployeePage();
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
      // WebElement pim= driver.findElement(By.id("menu_pim_viewPimModule"));
    //    AddEmployeePage add=new AddEmployeePage();
       doClick(add.pim);
    }
    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {
      //  WebElement add=driver.findElement(By.id("menu_pim_addEmployee"));
        doClick(add.add);
    }
    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {
//        driver.findElement(By.id("firstName")).sendKeys(ConfigReader.getPropertyValue("firstname"));
//        driver.findElement(By.id("middleName")).sendKeys(ConfigReader.getPropertyValue("middlename"));
//        driver.findElement(By.id("lastName")).sendKeys(ConfigReader.getPropertyValue("lastname"));
        // OR :

     //  WebElement firstname= driver.findElement(By.id("firstName"));
       sendText(add.firstname,ConfigReader.getPropertyValue("firstname"));

     //   WebElement middlename=driver.findElement(By.id("middleName"));
        sendText(add.middlename,ConfigReader.getPropertyValue("middlename"));

     //   WebElement lastname=driver.findElement(By.id("lastName"));
        sendText(add.lastname,ConfigReader.getPropertyValue("lastname"));


    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
    //   WebElement save= driver.findElement(By.id("btnSave"));
       doClick(add.save);
    }

    @When("user enters {string} and {string} and {string}")
    public void user_enters_and_and(String firstName, String middleName, String lastName) {
     //   WebElement firstname= driver.findElement(By.id("firstName"));
        sendText(add.firstname,firstName);

       // WebElement middlename=driver.findElement(By.id("middleName"));
        sendText(add.middlename,middleName);

      //  WebElement lastname=driver.findElement(By.id("lastName"));
        sendText(add.lastname,lastName);
    }


}
