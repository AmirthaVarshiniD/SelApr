package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class CreateLead {
	/*RemoteWebDriver driver;
	@Given("Open browser")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver =new ChromeDriver();
	}
	@And("Maximize browser")
	public void maxBrowser()
	{
		driver.manage().window().maximize();
	}
	@And("Set timeouts")
	public void timeouts()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Enter URL")
	public void enterURL()
	{
		driver.get("http://www.leaftaps.com/opentaps");
	}
	@And("Enter username as (.*)")
	public void enterUserName(String data)
	{
		driver.findElementById("username").sendKeys(data);
	}
	@And("Enter password as (.*)")
	public void password(String data)
	{
		driver.findElementById("password").sendKeys(data);
	}
	@And("Click login")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("Click CRMSFA")
	public void clickCrmsfa()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("Click leads")
	public void clickLeads()
	{
		driver.findElementByLinkText("Leads").click();
	}
	@And("Click Create Lead")
	public void clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter company Name as (.*)")
	public void enterCname(String data)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(data);
	}
	@And("Enter First name as (.*)")
	public void enterFname(String data)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
	}
	@And("Enter Last Name as (.*)")
	public void enterLname(String data)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys("D");
	}
	@And("Click Create1")
	public void clickCreate()
	{
		driver.findElementByClassName("smallSubmit").click();
	}
	@And("Create lead success")
	public void createdLead()
	{
		System.out.println("Create lead Successful");
	}
	
*/
}
