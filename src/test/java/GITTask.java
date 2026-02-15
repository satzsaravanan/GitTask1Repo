import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GITTask {
public static void main(String[] args) {
	WebDriver fbook = new ChromeDriver();
	fbook.get("https://www.facebook.com/");
	
	fbook.manage().window().maximize();
	
WebElement uname = fbook.findElement(By.xpath("//input[@autocomplete='username webauthn']"));
uname.sendKeys("8868612458");
WebElement upass = fbook.findElement(By.xpath("//input[@type='password']"));
upass.sendKeys("1455ss@SA");
WebElement logn = fbook.findElement(By.xpath("//input[@type='password']"));
logn.sendKeys("1455ss@SA");
WebElement logn1 = fbook.findElement(By.xpath("//div[@class='html-div xdj266r xat24cr xexx8yu xyri2b x18d9i69 x1c1uobl x6s0dn4 x78zum5 xl56j7k x1e0frkt xf0ucvx xx2axb6']"));
logn1.click();
}
}
