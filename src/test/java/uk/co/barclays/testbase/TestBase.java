package uk.co.barclays.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.barclays.browserselector.BrowserSelector;
import uk.co.barclays.loadproperty.LoadProperty;
import uk.co.barclays.utility.UtilityRM;

import java.util.concurrent.TimeUnit;

/**
 * Ravi's Creation
 * Date of Creation
 */
public class TestBase extends UtilityRM {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseURL = loadProperty.getProperty("baseURL");
    String browser = loadProperty.getProperty("browser");

    @BeforeMethod
    public void openBrowser (){
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseURL);
    }
    @AfterMethod
    public void closeBrowser(){
       // driver.quit();
    }

    }
