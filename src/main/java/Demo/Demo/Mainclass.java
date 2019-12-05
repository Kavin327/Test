package Demo.Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mainclass  {
	public static WebDriver driver;
	
	static String emailid = "kavinkichorejt@gmail.com";
	
	static String time = "01:00";
	
	@FindBy(xpath = "//button[@class='button button--branded blue go']") public static WebElement Go;
	@FindBy(xpath = "//button[@class='styles__nextButtonV2___1byer']") public static WebElement Next;
	@FindBy(xpath = "/html/body/main/div/div/div[1]/div/div/div/div/div[2]/form/div/div[2]/div/div/div[1]/div[2]/div/div/div[2]/label/div[1]/div") public static WebElement Pipe;
	@FindBy(xpath = "//button[@class='v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded']") public static WebElement Next1;
	@FindBy(xpath = "/html/body/main/div/div/div[1]/div/div/div/div/div[2]/form/div/div[2]/div/div/div/div[2]/div/div/div[1]/label/div[1]/div") public static WebElement Repair;
	@FindBy(xpath = "//button[@class='v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded']") public static WebElement Next2;
	@FindBy(xpath = "/html/body/main/div/div/div[1]/div/div/div/div/div[2]/form/div/div[2]/div/div/div[1]/div[2]/div/div/div[1]/label/div[1]") public static WebElement Leak;
	@FindBy(xpath = "//button[@class='v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded']") public static WebElement Next3;
	@FindBy(xpath = "//button[@class='v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded']") public static WebElement Skip;
	@FindBy(xpath = "/html/body/main/div/div/div[1]/div/div/div/div/div[2]/form/div/div[2]/div/div/div/div[2]/div/div/div[4]/label/div[1]/div") public static WebElement  Onspecificdate;
	@FindBy(xpath = "//button[@class='v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded']") public static WebElement Next4;
	@FindBy(xpath = "/html/body/main/div/div/div[1]/div/div/div/div/div[2]/form/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div[2]/div/table/tbody/tr[3]/td[4]/button") public static WebElement Date;
	@FindBy(xpath = "//button[@class='v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded']") public static WebElement Next5;
	@FindBy(css = "select") public static WebElement timeselect;
	@FindBy(xpath = "//button[@class='v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded']") public static WebElement Next6;
	@FindBy(xpath = "/html/body/main/div/div/div[1]/div/div/div/div/div[2]/form/div/div[2]/div/div/div/div/div/div[2]/div/input ")public static WebElement email;
	@FindBy(xpath = "//button[@class='v2__primaryButton___2quFJ v2__baseButton___1yj4M v2__commonBaseButton___n7MII button button--inline button--branded']") public static WebElement Next7;
	@FindBy(xpath = "/html/body/main/div/div/div[1]/div/div/div/div/div[1]") public static WebElement Quit;
	@FindBy(xpath = "/html/body/main/div/div/div[1]/div/div/div[2]/div/div/div/div[2]/div/div[3]" )public static WebElement cancelreq;
	
	public static void base()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Kavin\\Kavin\\Softwares\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.starofservice.in/dir/telangana/hyderabad/hyderabad/plumbing#_");
	} 
	
	public static void base1() throws InterruptedException
	{
		Reusable reusableFunctions = new Reusable();
		PageFactory.initElements(driver, Mainclass.class);
		PageFactory.initElements(driver, Reusable.class);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//Go
		reusableFunctions.seleniumClick(driver, Go);
		//Next
		reusableFunctions.seleniumClick(driver, Next);
		//Pipe
		reusableFunctions.seleniumClick(driver, Pipe);
		//Next
		reusableFunctions.seleniumClick(driver, Next1);
		//Repair
		reusableFunctions.seleniumClick(driver, Repair);
		//Next
		reusableFunctions.seleniumClick(driver, Next2);
		//Leak
		reusableFunctions.seleniumClick(driver, Leak);
		//Next
		reusableFunctions.seleniumClick(driver, Next3);
		//Skip
		reusableFunctions.seleniumClick(driver, Skip);
		// Onspecificdate
		reusableFunctions.seleniumClick(driver, Onspecificdate);
		//Next
		reusableFunctions.seleniumClick(driver, Next4);
		//Date
		reusableFunctions.seleniumClick(driver, Date);
		//Next
		reusableFunctions.seleniumClick(driver, Next5);
		Thread.sleep(2000);
		//Select
		reusableFunctions.selenuimSelect(driver,timeselect,time);
		//Next
		reusableFunctions.seleniumClick(driver, Next6);
		//Email
		reusableFunctions.seleniumsendkeys(driver, email,emailid);
		//Next
		reusableFunctions.seleniumClick(driver, Next7);
		//Quit
		reusableFunctions.seleniumClick(driver, Quit);
		//CancelReq
		reusableFunctions.seleniumClick(driver, cancelreq);
		

	}
	
	
	
}
