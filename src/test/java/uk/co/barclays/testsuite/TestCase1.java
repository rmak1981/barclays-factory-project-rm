package uk.co.barclays.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import uk.co.barclays.pages.BranchFinderPage;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.testbase.TestBase;

/**
 * Ravi's Creation
 * Date of Creation
 */
public class TestCase1 extends TestBase {

HomePage homePage;
BranchFinderPage branchFinderPage;

@BeforeMethod(groups = {"Regression"})
    public void setUP(){
    homePage = new HomePage();
    branchFinderPage = new BranchFinderPage();


}
@Test(priority = 0,groups = {"Regression"})

    public void userSouldNavigateToCurrentAccountPage(){

    homePage.mouseHoverBankDropDownLink();
    homePage.clickOnCurrentAccountLink();

}
@Test(priority = 1,groups = {"Regression"})
    public void userShouldFindBrachSuccessfully() throws InterruptedException {

    homePage.clickOnFindABranchLink();
    branchFinderPage.sendTextToLoactionField("LE4 5AT");
    Thread.sleep(5000);
    branchFinderPage.clickOnSearchBtn();

}


}
