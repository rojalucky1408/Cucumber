package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil{

    private BaseUtil base;

    public
    Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void Test()

    {
        System.out.println(" Open the browser ");
        System.setProperty("webdriver.firefox.marionette", "C:\\Users\\ravul\\Downloads\\geckodriver-v0.19.1-win64 (1)\\geckodriver.exe");
        base.Driver = new FirefoxDriver();


    }

    @After
    public void Test1()
    {
        System.out.println(" close the browser ");
    }


}
