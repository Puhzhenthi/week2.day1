package selenium.check;

import java.sql.Driver;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PuhalMaven {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title =driver.getTitle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		
WebElement webUser= driver.findElement(By.id("username"));
webUser.sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit" )).click();
driver.findElement(By.linkText("CRM/SFA")).click();
//create lead
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Puhazhenthi");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karunanithi");
//dropdown1
WebElement drop1=driver.findElement(By.id("createLeadForm_dataSourceId"));
Select dropdown1=new Select(drop1);
dropdown1.selectByValue("LEAD_PARTNER");
//dropdown2
WebElement drop2=driver.findElement(By.className("marketingCampaignId"));
Select dropdown2=new Select(drop2);
dropdown2.selectByIndex(3);
driver.findElement(By.className("firstNameLocal")).sendKeys("Puhal");
driver.findElement(By.className("lastNameLocal")).sendKeys("nithi");
driver.findElement(By.className("generalProfTitle")).sendKeys("Automation Tester");
driver.findElement(By.className("birthDate")).sendKeys("01/01/1997");
driver.findElement(By.className("departmentName")).sendKeys("Civil");
driver.findElement(By.className("personalTitle")).sendKeys("puh007");
driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("152");
//dropdown3
WebElement drop3=driver.findElement(By.className("currencyUomId"));
Select dropdown3=new Select(drop3);
dropdown3.selectByValue("INR");
//dropdown4
WebElement drop4=driver.findElement(By.className("industryEnumId"));
Select dropdown4=new Select(drop4);
dropdown4.selectByIndex(5);
//dropdown5
WebElement drop5=driver.findElement(By.className("ownershipEnumId"));
Select dropdown5=new Select(drop5);
dropdown5.selectByVisibleText("Public Corporation");
driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");
driver.findElement(By.className("description")).sendKeys("love to learn Selenium");
driver.findElement(By.className("importantNote")).sendKeys("Should Attend the Class without Fail");
driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("624619");
driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("p-125");
//contact information
WebElement countryCode=driver.findElement(By.className("primaryPhoneCountryCode"));
countryCode.clear();
countryCode.sendKeys("3");
driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("624612");
driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9952681819");
driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
driver.findElement(By.className("primaryPhoneAskForName")).sendKeys("puhazhenthi");
driver.findElement(By.className("primaryEmail")).sendKeys("puhalk09@gmail.com");
driver.findElement(By.className("primaryWebUrl")).sendKeys("www.puhal.com");
//primary address
driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Puhazhenthi");
driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("puhalNithi");
driver.findElement(By.className("generalAddress1")).sendKeys("160/2 NaganamPttiBypss");
driver.findElement(By.className("generalAddress2")).sendKeys("oddanchatram");
driver.findElement(By.className("generalCity")).sendKeys("Dindugal");
//dropdown6
WebElement drop6=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select dropdown6=new Select(drop6);
dropdown6.selectByVisibleText("SC");
driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("624615");
driver.findElement(By.className("generalPostalCodeExt")).sendKeys("642619");
//dropdown7
WebElement drop7=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
Select dropdown7=new Select(drop7);
dropdown7.deselectByValue("IND");
//printFirstName
WebElement myText=driver.findElement(By.id("createLeadForm_firstName"));
String text=myText.getText();
System.out.println("First name is:"+ text);
//create lead button
driver.findElement(By.className("smallSubmit")).click();
WebElement Title1=driver.findElement(By.className("smallSubmit"));
String title1 =driver.getTitle();
System.out.println("Title of the page:" + title1);
}
}

