import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_1 {

    public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver","C:\\Windows\\System32\\geckodriver.exe");
	// Create a new instance of the Firefox driver
	WebDriver driver = new FirefoxDriver();
		
	//Open the browser
	driver.get("https://www.training-support.net");
		
	//Close the browser
	driver.close();
    }

}
