package PageObjectModel;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class employeeSearchPage extends CommonMethods {
    public employeeSearchPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="empsearch_id")
    public WebElement empIdTextBox;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    @FindBy(id="empsearch_job_title")
    public WebElement jobTitleDdl;
@FindBy(id="empsearch_employee_status")
  public WebElement EmpStatusDdl;
}
