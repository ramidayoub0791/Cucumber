package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import PageObjectModel.employeeSearchPage;

public class EmployeeSearch extends CommonMethods {
public employeeSearchPage ser=new employeeSearchPage();
    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
      //   employeeSearchPage ser=new employeeSearchPage();
//        WebElement empIdTextBox = driver.findElement(By.id("empsearch_id"));
        sendText(ser.empIdTextBox, ConfigReader.getPropertyValue("empid"));
    }

    @When("Clicks on search button")
    public void clicks_on_search_button() {
    //    employeeSearchPage ser=new employeeSearchPage();
//        WebElement searchButton = driver.findElement(By.id("searchBtn"));
        doClick(ser.searchButton);
    }

    @When("user see employee information is displayed")
    public void user_see_employee_information_is_displayed() {
        System.out.println("The employee is Displayed");
    }

    @When("user select Job Title")
    public void user_select_job_title() {
     //   employeeSearchPage ser=new employeeSearchPage();
       // WebElement jobTitleDdl = driver.findElement(By.id("empsearch_job_title"));
        selectByOptions(ser.jobTitleDdl, "Singer");

       // WebElement EmpStatusDdl= driver.findElement(By.id("empsearch_employee_status"));
       selectByOptions(ser.EmpStatusDdl, "Active");
//
//        WebElement includeDdl= driver.findElement(By.id("empsearch_termination"));
//        selectByOptions(includeDdl, "Current and Past Employees");
    }
}