package StepDefinitions;

import PageObjectModel.AddEmployeePage;
import PageObjectModel.LoginPage;

public class PageInitializer {

    public  static LoginPage login;
    public  static AddEmployeePage add;
    public  static void initializePageObjects()
    {
        login = new LoginPage();
        add= new AddEmployeePage();
    }

}


// This class will manage the object creation of different page Objects in our Framework.
// Instead of calling the page objects again and again, this class will take good care of that step