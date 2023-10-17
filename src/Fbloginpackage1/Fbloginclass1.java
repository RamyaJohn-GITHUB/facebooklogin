package Fbloginpackage1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Fbloginclass1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
//set the path to the ChromeDriver Executable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91974\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");	
//create a new instance of the ChromeDriver
		WebDriver driver=new ChromeDriver();
//Navigate to the facebook login page using GET method
		driver.get("http://www.facebook.com");

//maximize the window
		driver.manage().window().maximize();

//locator-username
 		WebElement username=driver.findElement(By.xpath("//*[@id=\"email\"]"));

//send value web element
		username.sendKeys("johnramya04@gmail.com");
//locator-pwd
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("nathetabor53");
		
//Login button
		WebElement loginbutton=driver.findElement(By.name("login"));
		loginbutton.click();			
		//driver.close();					

	}

}
