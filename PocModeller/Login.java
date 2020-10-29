package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;

import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://poctest.cloud.testinsights.io/app/#!/module-collection/guid/0c39f6f3-c909-4729-88bd-6f7adcd6a252
@TestModellerModule(guid = "0c39f6f3-c909-4729-88bd-6f7adcd6a252")
public class Login extends BasePage
{
	public Login (WebDriver driver)
	{
		super(driver);
	}


	
	private By xPath_idbtnLoginElem = By.xpath("//*[@id=\"btnLogin\"]");

	private By txtEmpCodeElem = By.xpath("//*[@id=\"txtEmpCode\"]");

	private By txtPasswordElem = By.xpath("//*[@id=\"txtPassword\"]");

	private By Sign_InElem = By.xpath("//*[@id=\"imgBtnOK\"]");

	private By xPath_idbtnbackElem = By.xpath("//*[@id=\"btnback\"]");

	private By Forgot_PasswordElem = By.xpath("/html/body/form/div[3]/div[1]/div/div[5]/a[1]");

	private By Click_here_to_registerElem = By.xpath("/html/body/form/div[3]/div[1]/div/div[5]/a[2]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://iengage.coforgetech.com/ess1/authentication/loginauth.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://iengage.coforgetech.com/ess1/authentication/loginauth.aspx");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://iengage.coforgetech.com/ess1/authentication/loginauth.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://iengage.coforgetech.com/ess1/authentication/loginauth.aspx";

        if (!currentUrl.equals("https://iengage.coforgetech.com/ess1/authentication/loginauth.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click xPath: '//*[@id="btnLogin"]'
     * @name Click xPath: '//*[@id="btnLogin"]'
     */
	public void Click_xPath_idbtnLogin()
	{
        
		WebElement elem = getWebElement(xPath_idbtnLoginElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_idbtnLogin", "Click_xPath_idbtnLogin failed. Unable to locate object: " + xPath_idbtnLoginElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_idbtnLogin", "Click_xPath_idbtnLogin failed. Unable to locate object: " + xPath_idbtnLoginElem.toString());

			Assert.fail("Unable to locate object: " + xPath_idbtnLoginElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_xPath_idbtnLogin");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_idbtnLogin");
	}
      
	/**
 	 * Enter txtEmpCode
     * @name Enter txtEmpCode
     */
 	public void Enter_txtEmpCode(String txtEmpCode)
 	{
 	    
 		WebElement elem = getWebElement(txtEmpCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_txtEmpCode", "Enter_txtEmpCode failed. Unable to locate object: " + txtEmpCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_txtEmpCode", "Enter_txtEmpCode failed. Unable to locate object: " + txtEmpCodeElem.toString());

 			Assert.fail("Unable to locate object: " + txtEmpCodeElem.toString());
         }

 		elem.sendKeys(txtEmpCode);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_txtEmpCode " + txtEmpCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_txtEmpCode " + txtEmpCode);
 	}
      
	/**
 	 * Enter txtPassword
     * @name Enter txtPassword
     */
 	public void Enter_txtPassword(String txtPassword)
 	{
 	    
 		WebElement elem = getWebElement(txtPasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_txtPassword", "Enter_txtPassword failed. Unable to locate object: " + txtPasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_txtPassword", "Enter_txtPassword failed. Unable to locate object: " + txtPasswordElem.toString());

 			Assert.fail("Unable to locate object: " + txtPasswordElem.toString());
         }

 		elem.sendKeys(txtPassword);
 		

  		ExtentReportManager.passStep(m_Driver, "Enter_txtPassword " + txtPassword);

  		TestModellerLogger.PassStep(m_Driver, "Enter_txtPassword " + txtPassword);
 	}
     
	/**
 	 * Click Sign In
     * @name Click Sign In
     */
	public void Click_Sign_In()
	{
        
		WebElement elem = getWebElement(Sign_InElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sign_In", "Click_Sign_In failed. Unable to locate object: " + Sign_InElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sign_In", "Click_Sign_In failed. Unable to locate object: " + Sign_InElem.toString());

			Assert.fail("Unable to locate object: " + Sign_InElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Sign_In");

		TestModellerLogger.PassStep(m_Driver, "Click_Sign_In");
	}
     
	/**
 	 * Click xPath: '//*[@id="btnback"]'
     * @name Click xPath: '//*[@id="btnback"]'
     */
	public void Click_xPath_idbtnback()
	{
        
		WebElement elem = getWebElement(xPath_idbtnbackElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_xPath_idbtnback", "Click_xPath_idbtnback failed. Unable to locate object: " + xPath_idbtnbackElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_xPath_idbtnback", "Click_xPath_idbtnback failed. Unable to locate object: " + xPath_idbtnbackElem.toString());

			Assert.fail("Unable to locate object: " + xPath_idbtnbackElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_xPath_idbtnback");

		TestModellerLogger.PassStep(m_Driver, "Click_xPath_idbtnback");
	}
     
	/**
 	 * Click Forgot Password?
     * @name Click Forgot Password?
     */
	public void Click_Forgot_Password()
	{
        
		WebElement elem = getWebElement(Forgot_PasswordElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Forgot_Password", "Click_Forgot_Password failed. Unable to locate object: " + Forgot_PasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Forgot_Password", "Click_Forgot_Password failed. Unable to locate object: " + Forgot_PasswordElem.toString());

			Assert.fail("Unable to locate object: " + Forgot_PasswordElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Forgot_Password");

		TestModellerLogger.PassStep(m_Driver, "Click_Forgot_Password");
	}
     
	/**
 	 * Click Click here to register
     * @name Click Click here to register
     */
	public void Click_Click_here_to_register()
	{
        
		WebElement elem = getWebElement(Click_here_to_registerElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Click_here_to_register", "Click_Click_here_to_register failed. Unable to locate object: " + Click_here_to_registerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Click_here_to_register", "Click_Click_here_to_register failed. Unable to locate object: " + Click_here_to_registerElem.toString());

			Assert.fail("Unable to locate object: " + Click_here_to_registerElem.toString());
        }

		elem.click();
        

		ExtentReportManager.passStep(m_Driver, "Click_Click_here_to_register");

		TestModellerLogger.PassStep(m_Driver, "Click_Click_here_to_register");
	}}