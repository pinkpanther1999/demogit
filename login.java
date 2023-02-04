package login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.navigate().to("http://vinayavish.com");
  
  driver.findElement(By.linkText("Login")).click();
  driver.findElement(By.name("login")).sendKeys("divesh1234");
  
  driver.findElement(By.name("password")).sendKeys("Pawar@123");
  driver.findElement(By.xpath("//*[@id=\"stm-lms-login\"]/div[2]/div[3]/a/span"));
	}

}
