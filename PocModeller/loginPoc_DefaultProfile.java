package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://poctest.cloud.testinsights.io/app/#!/model-engine/guid/d7ddf664-daff-42f8-a59b-1ea67fc99768
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 4, profileId = 100004)
public class loginPoc_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"loginPoc","loginPoc - Default Profile"})
    @TestModellerPath(guid = "8afe47f2-8040-43d4-adaa-f236cab26a03")
    public void GoToUrlAssertUrlClickxPathidbtnLoginPositiveEntertxtEmpCodePositiveEntertxtPasswordClickSignIn1()
    {
        
        pages.Login _Login = new pages.Login(driver);
    TestModellerLogger.SetLastNodeGuid("81aa598c-b506-4722-b031-4a87b5303e3b");
    _Login.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("c71ae05d-7e95-4c2a-a9d4-94c0c192e8b6");
    _Login.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("f7642f59-d078-4b39-aa39-271b6f0cc1e5");
    _Login.Click_xPath_idbtnLogin();

    TestModellerLogger.SetLastNodeGuid("a628f1ea-2acd-4cdd-b142-07e75f363535");
    _Login.Enter_txtEmpCode("Wilhelmine_Conn59");

    TestModellerLogger.SetLastNodeGuid("2e25ab42-4d0e-44de-a748-8203b4e9e7fe");
    _Login.Enter_txtPassword("H9UyEntCHo");

    TestModellerLogger.SetLastNodeGuid("3b8a6cba-8ada-4ee6-9a84-6a5d46ce6c8d");
    _Login.Click_Sign_In();

    }

    @Test  (groups= {"loginPoc","loginPoc - Default Profile"})
    @TestModellerPath(guid = "82700d3a-706f-44b7-a1e5-68a198c2652c")
    public void GoToUrlAssertUrlClickxPathidbtnLoginNegativeEntertxtEmpCodePositiveEntertxtPasswordClickSignIn2()
    {
        
        pages.Login _Login = new pages.Login(driver);
    TestModellerLogger.SetLastNodeGuid("81aa598c-b506-4722-b031-4a87b5303e3b");
    _Login.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("c71ae05d-7e95-4c2a-a9d4-94c0c192e8b6");
    _Login.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("f7642f59-d078-4b39-aa39-271b6f0cc1e5");
    _Login.Click_xPath_idbtnLogin();

    TestModellerLogger.SetLastNodeGuid("ea9ff549-13c6-4947-8764-29bc1d51bc66");
    _Login.Enter_txtEmpCode("#!_ @");

    TestModellerLogger.SetLastNodeGuid("2e25ab42-4d0e-44de-a748-8203b4e9e7fe");
    _Login.Enter_txtPassword("_GfKBchIa1");

    TestModellerLogger.SetLastNodeGuid("3b8a6cba-8ada-4ee6-9a84-6a5d46ce6c8d");
    _Login.Click_Sign_In();

    }

    @Test  (groups= {"loginPoc","loginPoc - Default Profile"})
    @TestModellerPath(guid = "84ab579a-71b8-4e05-892f-3d7cb0c1620b")
    public void GoToUrlAssertUrlClickxPathidbtnLoginNegativeEntertxtEmpCodeNegativeEntertxtPasswordClickSignIn3()
    {
        
        pages.Login _Login = new pages.Login(driver);
    TestModellerLogger.SetLastNodeGuid("81aa598c-b506-4722-b031-4a87b5303e3b");
    _Login.GoToUrl();

    TestModellerLogger.SetLastNodeGuid("c71ae05d-7e95-4c2a-a9d4-94c0c192e8b6");
    _Login.AssertUrl();

    TestModellerLogger.SetLastNodeGuid("f7642f59-d078-4b39-aa39-271b6f0cc1e5");
    _Login.Click_xPath_idbtnLogin();

    TestModellerLogger.SetLastNodeGuid("ea9ff549-13c6-4947-8764-29bc1d51bc66");
    _Login.Enter_txtEmpCode("#!_ @");

    TestModellerLogger.SetLastNodeGuid("f8566403-c817-44ba-a455-013b33ac1894");
    _Login.Enter_txtPassword("#!_ @");

    TestModellerLogger.SetLastNodeGuid("3b8a6cba-8ada-4ee6-9a84-6a5d46ce6c8d");
    _Login.Click_Sign_In();

    }

}
