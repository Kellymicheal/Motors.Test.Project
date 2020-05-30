package co.uk.motors.Page;

import co.uk.motors.Common.DriverLib;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class BasePage extends DriverLib
{
    public String BASE_URL = "https://www.motors.co.uk/";
    public Select select;
    public void Launchurl()
    {
        driver.navigate().to(BASE_URL);
    }
    public void AcceptCookies()
    {

    }

    public void SelectElementByValue(WebElement element,String value)
    {
        select =new Select(element);
        select.selectByValue(value);
    }
    public void SelectElementByVisibleText(WebElement element,String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }
    public void SelectElementByIndex(WebElement element, int index)
    {
        select =new Select(element);
        select.selectByIndex(index);
    }
}
