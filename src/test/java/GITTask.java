import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GITTask {
public static void main(String[] args) {
	WebDriver fbook = new ChromeDriver();
	fbook.get("https://www.facebook.com/");
	
	fbook.manage().window().maximize();

}
}
