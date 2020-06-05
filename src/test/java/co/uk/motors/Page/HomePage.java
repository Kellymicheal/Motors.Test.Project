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
    private WebElement acceptAllCookie;
    @FindBy(name = "PostCode")
    private WebElement postcodeField;
    @FindBy(id = "Make")
    private WebElement carMake;
    @FindBy(id = "Model")
    private WebElement carModel;
    @FindBy(id = "MinPrice")
    private WebElement minPrice;
    @FindBy(name = "MaxPrice")
    private WebElement maxPrice;
    @FindBy(className ="sp__btn-count" )
    private WebElement submitButton;

    public void acceptAll() {
       acceptAllCookie.click();
    }

    public void enterPostcode(String postcode) {
        acceptAll();
      postcodeField.clear();
      postcodeField.sendKeys(postcode);

    }
    public void selectCarMake(String Make)
    {
        carMake.click();
        SelectElementByVisibleText(carMake, Make);

    }
    public void selectcarmodel(String model)
    {
        carModel.click();
        SelectElementByVisibleText(carModel, model);
    }
    public void selectMinimumPrice(String minimumPrice)
    {
        minPrice.click();
        SelectElementByVisibleText(minPrice, minimumPrice);
    }
    public void selectMaximumPrice(String maxiPrice)
    {
        maxPrice.click();
        SelectElementByVisibleText(maxPrice,maxiPrice);
    }
    public SearchResultPage clickOnSubmitButton()
    {
        submitButton.click();
        return new SearchResultPage(driver);
    }
}
