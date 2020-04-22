package uk.co.barclays.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import uk.co.barclays.utility.UtilityRM;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class BranchFinderPage extends UtilityRM {
    //initiate log4j property
    private static final Logger log = LogManager.getLogger(BranchFinderPage.class.getName());

    //send text to postcode field
    @FindBy(xpath = "//input[@id='location']")
    WebElement _enterTextToLocationField;
    // clicking on search
    @FindBy(xpath = "//input[@class='btn btn-primary']")
    WebElement _clickOnSearchBtn;

    public void sendTextToLoactionField(String postCode){
        Reporter.log("enter text for location"+postCode+"to the field"+_enterTextToLocationField.toString()+"<br>");
        sendTextToElement(_enterTextToLocationField,postCode);
        log.info("enter text for location"+postCode+"to the field"+_enterTextToLocationField.toString());
    }
    public void clickOnSearchBtn(){
        Reporter.log("click on search btn"+_clickOnSearchBtn.toString()+"<br>");
        clickOnElement(_clickOnSearchBtn);
        log.info("click on search btn"+_clickOnSearchBtn.toString());
    }

}
