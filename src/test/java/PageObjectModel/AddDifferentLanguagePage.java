package PageObjectModel;

import Utils.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import Utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDifferentLanguagePage extends CommonMethods {
    public AddDifferentLanguagePage(){
        PageFactory.initElements(driver, this);
    }


        @FindBy(id="menu_admin_viewAdminModule")
        public WebElement Admin;


        @FindBy(id = "menu_admin_Qualifications")
        public WebElement qualificationBtn;

        @FindBy(id = "menu_admin_viewLanguages")
        public WebElement clickOnLanguage;

        @FindBy(id = "btnAdd")
        public WebElement addBtn;

        @FindBy(id = "language_name")
        public WebElement languageName;


        @FindBy(id = "btnSave")
        public WebElement saveBtn;
}
