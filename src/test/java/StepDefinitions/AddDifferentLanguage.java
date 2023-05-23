
package StepDefinitions;

        import PageObjectModel.AddDifferentLanguagePage;
        import Utils.CommonMethods;
        import Utils.ConfigReader;
        import Utils.DBUtility;
        import Utils.GlobalVariables;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;
        import org.junit.Assert;
        import org.openqa.selenium.By;

public class AddDifferentLanguage extends CommonMethods {


    @When("user enters a valid email and password")
    public void user_enters_a_valid_email_and_password() {
        sendText(login.usernameTextBox, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextBox, ConfigReader.getPropertyValue("password"));
    }
    @When("click on Login Button")
    public void click_on_Login_Button() {
        doClick(login.loginBtn);
    }
    @When("User clicks on Admin button")
    public void clickOnAdminBtn() {
        doClick(addDifferentLanguagePage.Admin);

    }

    @When("User navigates to Qualification")
    public void user_navigates_to_qualification() {
        doClick(addDifferentLanguagePage.qualificationBtn);
    }

    @When("User selects Language option")
    public void user_selects_language_option() {
        doClick(addDifferentLanguagePage.clickOnLanguage);


    }

    @When("User clicks on Add button")
    public void user_clicks_on_add_button() {
        doClick(addDifferentLanguagePage.addBtn);

    }

    @And("User adds a Language into selected box")
    public void user_adds_a_language_into_selected_box() {
        sendText(addDifferentLanguagePage.languageName, ConfigReader.getPropertyValue("languageName"));
       //   =driver.findElement(By.id("language_name"));


    }

    @And("User clicks on save button")
    public void user_clicks_on_save_button() {
        doClick(addDifferentLanguagePage.saveBtn);

    }

    @When("query the language information in backend")
    public void query_the_language_information_in_backend() {

        String query = "select name from ohrm_language";
        GlobalVariables.lngList= DBUtility.getListOfLang(query);
    }
    @Then("verify the language results from frontend and backend")
    public void verify_the_language_results_from_frontend_and_backend() {
       boolean flag=false;
        for (String myLang:GlobalVariables.lngList) {
            System.out.println(myLang);
            if (myLang.equalsIgnoreCase(ConfigReader.getPropertyValue("languageName"))){
                flag=true;
            }else
                flag=false;
        }
        System.out.println(flag);
        Assert.assertTrue(flag);

    }

}