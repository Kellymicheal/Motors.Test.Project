package co.uk.motors.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
        this.driver =driver;
    }
    @FindBy(id = "gdprAgree")
    private WebElement acceptAllCookies;
    @FindBy(name = "PostCode")
    private WebElement postcodeField;
    @FindBy(id = "Make")
    private WebElement carMake;
    @FindBy(id = "Model")
    private WebElement carModel;

    public void acceptAll()
    {
       acceptAllCookies.click();


    }

    public void enterPostcode(String postcode)
    {
      postcodeField.clear();
      postcodeField.sendKeys(postcode);
    }
    public void selectCarMake(String Make)
    {
        SelectElementByVisibleText(carModel, Make);
    }
    public void selectcarmodel(String model)
    {
        SelectElementByVisibleText(carModel, model);
    }
}
