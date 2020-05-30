package co.uk.motors.hooks;

import co.uk.motors.Common.BrowserClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BrowserClass
{
    private String chromeBrowser ="chrome";
    @Before
    public void setUp()
    {
        launchBroser(chromeBrowser);
    }
    @After
       public void tearDown()
    {
        closeBrowser();


    }
}
