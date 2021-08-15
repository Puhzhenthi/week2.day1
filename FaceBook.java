package selenium.check;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	private Object facebook;
	private static Select dropDown2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.linkText("Create New Account")).click();
driver.findElement(By.className("firstname")).sendKeys("Puhazhenthi");
driver.findElement(By.className("lastname")).sendKeys("Karunanithi");
driver.findElement(By.className("reg_email__")).sendKeys("puhazhenthikarunanithi@gmail.com");
driver.findElement(By.className("reg_passwd__")).sendKeys("Puhal@112");
//dropdown1
WebElement drop1=driver.findElement(By.id("day"));
Select dropDown1=new Select(drop1);
dropDown1.selectByValue("1");
//dropdown2
WebElement drop2=driver.findElement(By.id("month"));
dropDown2 = new Select(drop2);
dropDown1.selectByValue("1");
//dropdown2
WebElement drop3=driver.findElement(By.id("year"));
Select dropDown3=new Select(drop3);
dropDown3.selectByValue("1997");
WebElement radio= driver.findElement(By.className("_8esa"));
radio.click();
{
	System.out.println("Male");
}
driver.findElement(By.className("u_i_s_Tr")).click();



	}

}
