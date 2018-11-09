package testRunners;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_GoogleHomepage {



	public static WebDriver driver;
login obj=new login();

	 	@Given("^User is on Home Page$")
		public void user_is_on_Home_Page() throws Throwable {
			System.setProperty("webdriver.chrome.driver","D:\\Driver\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();

	        options.setBinary(new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"));

	        options.addArguments("start-maximized");
	        driver = new ChromeDriver(options);
	System.out.println("Open google browser");

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://13.232.97.38/home");
			 //  driver.get("https://login.yahoo.com/");
			//	   System.out.println(" gmail page");
			}
	@When("^go to QCD Home page$")
	public void go_to_QCD_Home_page() throws Throwable {
		System.out.println(" QCD page");}

	@Then("^check the Homepage details$")
	public void check_the_Homepage_details() throws Throwable {
		//Logo image		
		Thread.sleep(2000);
		driver.findElement(obj.Logo).click();
		System.out.println("image is present");

		
	driver.findElement(obj.Skills).sendKeys("mysql");
	driver.findElement(obj.Location).click();	
	driver.findElement(obj.lv).sendKeys("Western Cape");
		 
		 WebElement Search = driver.findElement(obj.search);
		 Search.click();
		 
		 Thread.sleep(3000);
		 driver.navigate().to("http://13.232.97.38/home");


		
		
		//Qualified makes all the difference
		String bodyText = driver.findElement(obj.bodyText).getText();
		Assert.assertTrue(bodyText.contains(bodyText));
		System.out.println("String present");
		//Explore
		Thread.sleep(2000);
		driver.findElement(obj.Explore).click();
		
		 Thread.sleep(2000);
			driver.navigate().to("http://13.232.97.38/home");
			//know more
			Thread.sleep(2000);
			driver.findElement(obj.know_more).click();
			
		// About us
		Thread.sleep(2000);
		 WebElement AboutUs = driver.findElement(obj.AboutUs);
		 AboutUs.click();
		
		 //How it works
			Thread.sleep(2000);
		 WebElement HowItWorks = driver.findElement(obj.HowItWorks);
		 HowItWorks.click();
		
		 // Reach us
		 
		 Thread.sleep(2000);
		 WebElement ReachUs = driver.findElement(obj.ReachUs);
		 ReachUs.click();
		 
		 //full name
		 Rdname rd=new Rdname();
		 driver.findElement(obj.full_name).sendKeys(rd.generaterandomaplha());
		
		 //Email
		 Thread.sleep(2000);

		 driver.findElement(obj.Email).sendKeys("Hema@gmail.com");
		
		 System.out.println("Invalid mail id");
	
		 Thread.sleep(2000);
		 rdnum obj1=new rdnum();
driver.findElement(obj.contact).sendKeys(obj1.main());
			
		
			//Subject
		driver.findElement(obj.Subject).sendKeys("Good");
		
		//messagebox
		
		driver.findElement(obj.messagebox).sendKeys("Good");
		 
		//Send
		driver.findElement(obj.Send).click();	
	
System.out.println("Open home page");

 }
	 	@When("^User enters UserName and Password$")
		public void user_enters_UserName_and_Password() throws Throwable {
			Thread.sleep(2000);
			 WebElement Login = driver.findElement(obj.loginicon);
			 Login.click();
			
			Thread.sleep(2000);
			
			WebElement userid= driver.findElement(obj.userid);
		    //sending keys to input field
			userid.sendKeys("agency1@gmail.com");
			    //clicking on next button
			    WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.elementToBeClickable(userid));

		    //finding password field
			   
		    WebElement password = driver.findElement(obj.password);
			    
			    //entering password 
		    password.sendKeys("qwerty");
		    WebDriverWait wait1 = new WebDriverWait(driver, 20);
		    wait1.until(ExpectedConditions.elementToBeClickable(password));
			    //password.sendKeys("your_password");
		    WebElement next = driver.findElement(obj.next);
		    next.click();


	    System.out.println("login page");
}
	 
		@Then("^Message displayed Login Successfully$")
		public void message_displayed_Login_Successfully() throws Throwable {
			System.out.println("Login Successfully");
		}

		@When("^click on AM button$")
	public void click_on_AM_button() throws Throwable {
		//AM icon
		driver.findElement(By.xpath("/html/body/app-root/mat-toolbar/div/div[3]/div")).click();
}

	@When("^Click on Agency list the value$")
	public void click_on_Agency_list_the_value() throws Throwable {
		//Agentlist
		Thread.sleep(3000);
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div")).click();
		driver.findElement(obj.Agentlist).click();
	//driver.findElement(By.cssSelector("#cdk-overlay-1 > div > div > div:nth-child(1) > div > div")).click();
	Thread.sleep(2000);
		//AL_search 
		driver.findElement(obj.AL_search).click();
		 
		 Thread .sleep(2000);
		 //AL_Value
		 driver.findElement(obj.AL_Value).sendKeys("agent");
		 

}

	@Then("^clcik on search$")
	public void clcik_on_search() throws Throwable {
		Thread.sleep(2000);

		driver.findElement(obj.AL_search).click();
}

	@When("^click on AMicon button$")
	public void click_on_AMicon_button() throws Throwable {
		//AMICON1
		 driver.findElement(obj.AM_icon1).click();
}

	@When("^Click on Add Agency the value$")
	public void click_on_Add_Agency_the_value() throws Throwable {
		//Add_agent_icon
		 Thread.sleep(2000);
		 driver.findElement(obj.Add_agent_icon).click();
}

	@Then("^fills all the details and submit$")
	public void fills_all_the_details_and_submit() throws Throwable {
		 
		 //firstnames
		 Thread.sleep(2000);
		 Rdname rd=new Rdname();
		 driver.findElement(obj.firstnames).sendKeys(rd.generaterandomaplha());

		//surname
		 
		 driver.findElement(obj.surname).sendKeys("K");
		 //contact
		 
		 rdnum obj1= new rdnum();
		driver.findElement(obj.Add_Agent_contact).sendKeys(obj1.main());
		 //email
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  

		 driver.findElement(obj.Add_Agent_email).sendKeys("Username"+ randomInt +"@gmail.com");
		 
		 //specilization
		 
		 driver.findElement(obj.Add_Agent_specilization).sendKeys("Java,PHP,C,C++");
		 //save
		 
		WebElement save= driver.findElement(obj.save);save.click();
		 //save.click();
		 
		 //cancel
		//driver.findElement(By.xpath("/html/body/app-root/div/div[1]/bh-addagent/div/div/mat-card/mat-card-content/form/div[2]/div[2]/button")).click();

}

 
		@When("^User LogOut from the Application$")
		public void user_LogOut_from_the_Application() throws Throwable {
			Thread.sleep(2000);
			 WebElement signout=driver.findElement(obj.signout);
			 signout.click();
			 
		  // Close the driver
			 Thread.sleep(2000);
		 
		     driver.close();
				
			}
	 
		@Then("^Message displayed LogOut Successfully$")
		public void message_displayed_LogOut_Successfully() throws Throwable {
			System.out.println("Successfully Logout page");
			
		}
		}
