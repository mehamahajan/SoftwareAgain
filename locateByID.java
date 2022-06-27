package locateByID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class locateByID {
	 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Meha\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
    String baseUrl = "https://www.facebook.com/";
    driver.get(baseUrl);
    String tagName = "";
    tagName = driver.findElement(By.id("email")).getTagName();
    System.out.println(tagName);
    driver.close();
    //Remove exit command
 //   System.exit(0);
    
}
	 
}