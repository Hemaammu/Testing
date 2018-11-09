package testRunners;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class login {
	
	By Logo=By.xpath("/html/body/app-root/mat-toolbar/a/img");
	
	By Skills=By.xpath("/html/body/app-root/div/div[1]/bh-landing/div/div/div[1]/div/form/div/div[1]/input");
	By Location=By.cssSelector("#mat-select-0");

	By lv=By.id("mat-option-2");
	By search=By.xpath("/html/body/app-root/div/div[1]/bh-landing/div/div/div[1]/div/form/div/div[3]/button");
	
	//quality
	By bodyText=By.cssSelector("#angularRoot > div > div.padding6em > div:nth-child(1) > div:nth-child(1)");
	By Explore=By.xpath("//*[@id=\"angularRoot\"]/div/div[2]/div[1]/div[1]/button");
	By know_more=By.xpath("//*[@id=\"angularRoot\"]/div/div[2]/div[2]/div[2]/button");
	By AboutUs=By.xpath("/html/body/app-root/mat-toolbar/div/div[2]/div/span");
	By HowItWorks=By.xpath("/html/body/app-root/mat-toolbar/div/div[3]/div/span");
	
	//reach us
	By ReachUs=By.xpath("/html/body/app-root/mat-toolbar/div/div[4]/div/span");
	By full_name=By.xpath("//*[@id=\"angularRoot\"]/div/div/div[2]/div/div[1]/div/div[2]/div[1]/form/input");
	By Email=By.xpath("//*[@id=\"angularRoot\"]/div/div/div[2]/div/div[1]/div/div[2]/div[2]/form/input");
	By contact=By.xpath("//*[@id=\"angularRoot\"]/div/div/div[2]/div/div[1]/div/div[3]/div[1]/form/input");
	By Subject=By.xpath("//*[@id=\"angularRoot\"]/div/div/div[2]/div/div[1]/div/div[3]/div[2]/form/input");
	By messagebox=By.xpath("//*[@id=\"angularRoot\"]/div/div/div[2]/div/div[1]/div/div[4]/form/textarea");
	By 	Send=By.xpath("//*[@id=\"angularRoot\"]/div/div/div[2]/div/div[1]/div/div[5]/button");
	
	
	//Login
	
	By loginicon=By.xpath("/html/body/app-root/mat-toolbar/button/span");
	By userid=By.xpath("//*[@id=\"angularRoot\"]/div/mat-card/mat-card-content/form/div/div[1]/input");
	By password=By.xpath("//*[@id=\"angularRoot\"]/div/mat-card/mat-card-content/form/div/div[2]/input");
	By next=By.xpath("//*[@id=\"angularRoot\"]/div/mat-card/mat-card-content/form/div/div[3]/button");
	By AM_icon=By.xpath("/html/body/app-root/mat-toolbar/div/div[3]/div");
	By Agentlist=By.cssSelector(".mat-menu-content > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");

	
//AL_search
	By AL_search=By.xpath("//*[@id=\"angularRoot\"]/div/div[1]/div/mat-icon");
	By AL_Value=By.xpath("//*[@id=\"angularRoot\"]/div/div[1]/div/input");
	
	//Add_Agent
	
	By AM_icon1=By.cssSelector("body > app-root > mat-toolbar > div > div:nth-child(3) > div");
	
	By Add_agent_icon=By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div");
	By	firstnames=By.xpath("//*[@id=\"angularRoot\"]/div/mat-card/mat-card-content/form/div[1]/div[2]/div[1]/div[3]/input");
	By	surname=By.xpath("/html/body/app-root/div/div[1]/bh-addagent/div/div/mat-card/mat-card-content/form/div[1]/div[2]/div[2]/div[3]/input");
	By	Add_Agent_contact=By.xpath("/html/body/app-root/div/div[1]/bh-addagent/div/div/mat-card/mat-card-content/form/div[1]/div[2]/div[3]/div[3]/input");
	By Add_Agent_email=By.xpath("/html/body/app-root/div/div[1]/bh-addagent/div/div/mat-card/mat-card-content/form/div[1]/div[2]/div[4]/div[3]/input");
	By	Add_Agent_specilization=By.xpath("/html/body/app-root/div/div[1]/bh-addagent/div/div/mat-card/mat-card-content/form/div[1]/div[2]/div[5]/div[3]/input");
	By	save=By.xpath("/html/body/app-root/div/div[1]/bh-addagent/div/div/mat-card/mat-card-content/form/div[2]/div[1]/button");
	
	//signout
	
	By	signout=By.xpath("/html/body/app-root/mat-toolbar/button/span");
	}