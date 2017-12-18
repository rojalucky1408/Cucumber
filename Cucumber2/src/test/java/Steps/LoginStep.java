package Steps;



import Base.BaseUtil;
import Transformation.EmailTransformation;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import java.util.List;


//import java.util.ArrayList;

public class LoginStep extends BaseUtil{

    private BaseUtil base;

    public
    LoginStep(BaseUtil base) {
        this.base = base;
    }

    String username;
    String password;

    @Then("^Login Successful$")
    public
    void loginSuccessful() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Login successful");
    }

    @And("^click login button$")
    public void clickLoginButton() {
        base.Driver.findElement(By.name("Login")).click();
    }

    @Given("^Navigate to the login page$")
    public
    void navigateToTheLoginPage() {

        System.out.println("Navigate to the login page");
        base.Driver.navigate().to("http://executeautomation.com/demosite/Login.html");
    }

    @And("^Enter the following Details for Login$")
    public
    void enterTheFollowingDetailsForLogin(DataTable table) {

        table.raw();
       /* List<List<String>> data = table.raw();
        System.out.println("value is "+ data.get(0).get(0).toString());
        System.out.println("value is " + data.get(0).get(1).toString());*/

        List<User> users = table.asList(User.class);
        for (User user : users) {
           /* System.out.println("username is : " + user.username);
            System.out.println("password is : " + user.password);*/
        base.Driver.findElement(By.name("username")).sendKeys(user.username);
        base.Driver.findElement(By.name("password")).sendKeys(user.password);

        }

    }

    @And("^Enter ([^\"]*) and ([^\"]*) $")
    public
    void enterUsernameAndPassword(String username, String password ) {
        System.out.println("user name is : " + username);
        System.out.println("pass word is : " + password);

    }
   /* @Given("^Enter admin and adminpassword$")
    public void enter_admin_and_adminpassword()  {

    }

    @Given("^Enter xyznhd and fjbvksm$")
    public void enter_xyznhd_and_fjbvksm() {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Given("^Enter qa and testing$")
    public void enter_qa_and_testing()  {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }*/

    @And("^enter email address as Email : ([^\"]*)$")
    public
    void enterEmailAddressAsEmailAdmin(@Transform(EmailTransformation.class) String email)  {

        System.out.println("Email address = " + email);

    }


    public
    class User {
        String username;
        String password;

        private
        User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}

