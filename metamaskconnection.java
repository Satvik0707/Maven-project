package Refi;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class metamaskconnection {
	ExtentReports extent;

	ExtentTest logger;

	ChromeDriver driver;
	
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {ExtentHtmlReporter reporter = new ExtentHtmlReporter(".//Reports//Buttonschecking.html");

	extent = new ExtentReports();

	extent.attachReporter(reporter);

	logger = extent.createTest("LoginTest");

	WebDriverManager.chromedriver().setup();

	ChromeOptions option = new ChromeOptions();

	option.addExtensions(new File(".//Metamask//metamask_10_2_2_0.crx"));

	driver = new ChromeDriver(option);

	driver.manage().deleteAllCookies();

	driver.get("https://rapid:pineapple@staging.dnfbhl3qf3v8x.amplifyapp.com/");

	driver.manage().window().maximize();

	ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

	// switch to new tab

	driver.switchTo().window(newTb.get(1));

	System.out.println("Page title of new tab: " + driver.getTitle());

	// switch to parent window

	driver.switchTo().window(newTb.get(0));

	driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html#initialize/welcome");

	driver.navigate().refresh();

	driver.navigate().refresh();

	WebDriverWait wait = new WebDriverWait(driver, 10);

	wait.until(ExpectedConditions
			.visibilityOfElementLocated(By.xpath("//*[@class='button btn-primary first-time-flow__button']")));

	driver.findElement(By.xpath("//*[@class='button btn-primary first-time-flow__button']")).click();

	driver.navigate().refresh();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Import wallet']")));

	driver.findElement(By.xpath("//*[text()='Import wallet']")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='I Agree']")));

	driver.findElement(By.xpath("//*[text()='I Agree']")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(
			By.xpath("//*[@placeholder='Paste Secret Recovery Phrase from clipboard']")));

	driver.findElement(By.xpath("//*[@placeholder='Paste Secret Recovery Phrase from clipboard']"))
			.sendKeys("circle tree holiday match effort upper rapid add traffic betray asthma butter");

	driver.findElement(By.id("password")).sendKeys("Satvik@123");

	driver.findElement(By.id("confirm-password")).sendKeys("Satvik@123");

	driver.findElement(By.xpath("//*[@class='first-time-flow__checkbox first-time-flow__terms']")).click();

	driver.findElement(By.xpath("//*[@class='button btn-primary first-time-flow__button']")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='All Done']")));

	driver.findElement(By.xpath("//*[text()='All Done']")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Close']")));

	driver.findElement(By.xpath("//*[@title='Close']")).click();

	driver.findElement(By.xpath("//*[text()='Ethereum Mainnet']")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Custom RPC']")));

	driver.findElement(By.xpath("//*[text()='Custom RPC']")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Add Network']")));

	driver.findElement(By.xpath("//*[text()='Add Network']")).click();

	// network-name

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("network-name")));

	driver.findElement(By.id("network-name")).sendKeys("Main net Fork");

	// rpc-url

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rpc-url")));

	driver.findElement(By.id("rpc-url")).sendKeys("http://34.245.216.66:7545");

	// chainId

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("chainId")));

	driver.findElement(By.id("chainId")).sendKeys("31337");

	// Save

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Save']")));

	driver.findElement(By.xpath("//*[text()='Save']")).click();

	// Import

	Thread.sleep(4000);

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='identicon__address-wrapper']")));

	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='identicon__address-wrapper']")));

	WebElement element = driver.findElement(By.xpath("//*[@class='identicon__address-wrapper']"));

	element.click();

	// Import Account

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Import Account']")));

	driver.findElement(By.xpath("//*[text()='Import Account']")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("private-key-box")));

	driver.findElement(By.id("private-key-box"))
			.sendKeys("0x4bbbf85ce3377467afe5d46f804f221813b2bb87f24d81f60f1fcdbf7cbf4356");

	
	//0x92db14e403b83dfe3df233f83dfa3a0d7096f21ca9b0d6d6b8d88b2b4ec1564e
	// 

	// import button

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Import']")));

	driver.findElement(By.xpath("//*[text()='Import']")).click();

	// getting balance in meta mask balance

	wait.until(ExpectedConditions
			.visibilityOfElementLocated(By.xpath("//*[@class='currency-display-component__text']")));

	List<WebElement> ETH2 = driver.findElements(By.xpath("//*[@class='currency-display-component__text']"));

	for (WebElement ET1 : ETH2) {

		String ETHbalance1 = ET1.getText();

		System.out.println("Before transaction Balance = " + ETHbalance1);

		String ETHbalance11 = ETHbalance1;

		// Connect to meta mask

		driver.switchTo().window(newTb.get(1));

		String phandle = driver.getWindowHandle();

		Set<String> Handles = driver.getWindowHandles();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect Wallet']")));

		driver.findElement(By.xpath("//*[text()='Connect Wallet']")).click();

		driver.findElement(By.xpath("//*[@type='checkbox']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Metamask']")));

		driver.findElement(By.xpath("//*[text()='Metamask']")).click();

		try {
			// Waiting for metamsk pop up

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect Wallet']")));

		} catch (Exception E) {

		//	System.out.println("Meta mask pop up visible");

		}

		try {

			//System.out.println("meta mask window ");

			for (String handle : Handles) {

				// System.out.println(handle);

				if (!handle.equals(phandle)) {

					driver.switchTo().window(handle);

					driver.findElement(By.xpath("//*[text()='Next']")).click();

					// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect']")));

					driver.findElement(By.xpath("//*[text()='Connect']")).click();

					System.out.println("clicking meta mask window connect button ");

				}
			}
		} catch (Exception E) {

			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();
		}

		// Pop up clicking

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.cssSelector("#popover-content > div > div > section > header > div > button")));

			driver.findElement(By.cssSelector("#popover-content > div > div > section > header > div > button"))
					.click();
		}

		catch (Exception E) {
			//System.out.println("Pop up not visible ");
		}

		driver.navigate().refresh();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));

		driver.findElement(By.xpath("//*[text()='Next']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect']")));

		driver.findElement(By.xpath("//*[text()='Connect']")).click();

		driver.switchTo().window(newTb.get(1));

		// Connected pop up cross button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > div.sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));
		driver.findElement(By.cssSelector(
				"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > div.sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII"))
				.click();
	}

	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	//  driver.close();
  }

}
