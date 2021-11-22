package november19;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadWithXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[@style='color: black;']")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Pradeepkumar");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Namachivayam");
		driver.findElement(By.xpath("//input[@id='createLeadForm_personalTitle']")).sendKeys("Mr");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalProfTitle']")).sendKeys("intern");
		driver.findElement(By.xpath("//input[@id='createLeadForm_annualRevenue']")).sendKeys("50,000");
		driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("50");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("9442455958");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("aaa@gmail.com");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalToName']")).sendKeys("Punitha Namachivayam");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalAddress1']")).sendKeys("No.361,KPK street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("valapandhal");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("ranipet");
		Select drpstate = new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']")));
		drpstate.selectByVisibleText("Florida");
		Select drpcountry = new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_generalCountryGeoId']")));
		drpcountry.selectByVisibleText("United States");
		driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("632318");
        driver.findElement(By.xpath("//input[@value='Create Lead']")).click();

	}

}
