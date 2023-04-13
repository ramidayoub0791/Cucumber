package PageObjectModel;

import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {
    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pim;

    @FindBy(id="menu_pim_addEmployee")
   public WebElement add;
   @FindBy(id="firstName")
    public WebElement firstname;

   @FindBy(id="middleName")
   public WebElement middlename;

   @FindBy(id="lastName")
   public WebElement lastname;

   @FindBy(id="btnSave")
   public WebElement save;

}
