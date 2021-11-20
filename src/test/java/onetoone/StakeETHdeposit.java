package onetoone;

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
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StakeETHdeposit {
	ExtentReports extent;
	ExtentTest logger;
	ChromeDriver driver;

  @Test
  public void Connect() throws InterruptedException {
	 
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(".//Reports//Connection.html");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		logger = extent.createTest("LoginTest");

		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();

		option.addExtensions(new File(".//Metamask//metamask_10_2_2_0.crx"));

		driver = new ChromeDriver(option);

		driver.manage().deleteAllCookies();

		driver.get("https://rapid:headphones_mug@staging.d302m820cdpigj.amplifyapp.com/");

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		// switch to new tab

		driver.switchTo().window(newTb.get(1));

		System.out.println("Page title of new tab: " + driver.getTitle());

		// switch to parent window

		driver.switchTo().window(newTb.get(0));

		driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html#initialize/welcome");

		driver.navigate().refresh();

		driver.navigate().refresh();

		WebDriverWait wait = new WebDriverWait(driver, 60);

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

		driver.switchTo().window(newTb.get(1));

		driver.switchTo().window(newTb.get(0));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='selected-account__copy']")));

		driver.findElement(By.xpath("//*[@class='selected-account__copy']")).click();

		driver.switchTo().window(newTb.get(1));

		Thread.sleep(3000);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[text()='Connect']")).click();

		String phandle = driver.getWindowHandle();

		driver.findElement(By.xpath("//*[@type='checkbox']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[text()='Metamask']")).click();

		Thread.sleep(4000);

		Set<String> Handles = driver.getWindowHandles();

		for (String handle : Handles) {

			System.out.println(handle);

			if (!handle.equals(phandle)) {

				driver.switchTo().window(handle);
			}
		}

		// System.out.println("Page title of new tab: " + driver.getTitle());

		try

		{
			driver.findElement(By.xpath("//*[text()='Next']")).click();
			driver.findElement(By.xpath("//*[@class='button btn-primary page-container__footer-button']")).click();

		} catch (Exception E) {

			System.out.println("Running else condition");

			driver.switchTo().window(newTb.get(1));

			driver.navigate().refresh();
			
			driver.findElement(By.xpath("//*[text()='Connect']")).click();

			String phandle2 = driver.getWindowHandle();

			driver.findElement(By.xpath("//*[@type='checkbox']")).click();

			//

			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[text()='Metamask']")).click();

			Thread.sleep(4000);

			Set<String> Handles2 = driver.getWindowHandles();

			for (String handle2 : Handles2) {

				System.out.println(handle2);

				if (!handle2.equals(phandle)) {

					driver.switchTo().window(handle2);
				}
			}

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));

			driver.findElement(By.xpath("//*[text()='Next']")).click();

			driver.findElement(By.xpath("//*[@class='button btn-primary page-container__footer-button']")).click();

		}

		driver.switchTo().window(newTb.get(1));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sc-fubCzh imfFrD']")));

		WebElement Address = driver.findElement(By.xpath("//*[@class='sc-fubCzh imfFrD']"));

		String web = Address.getAttribute("innerText");

		System.out.println(web);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bsfnEV.sc-dIUeWJ img[alt='close']")));

		driver.findElement(By.cssSelector(".bsfnEV.sc-dIUeWJ img[alt='close']")).click();
			
		driver.switchTo().window(newTb.get(0));

		driver.findElement(By.xpath("//*[text()='Ethereum Mainnet']")).click();

		driver.findElement(By.xpath("//*[text()='Ropsten Test Network']")).click();

		driver.switchTo().window(newTb.get(1));
		
		Thread.sleep(1000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Stake']")));

		driver.findElement(By.xpath("//*[text()='Stake']")).click();

		List<WebElement> Availablebalance = driver.findElements(By.cssSelector("p > span"));

		for (WebElement AVABalance : Availablebalance) {

			String Bal = AVABalance.getText();

			String Rep = Bal;

			Double d1 = 2.0;

			String replace = Rep.replace("ETH", "");

			double value = Double.parseDouble(replace);

			double d3 = value / d1;

			String m = String.valueOf(d3);

			driver.findElement(By.id("ethAmount")).sendKeys(m);

			driver.findElement(By.xpath("//*[@class='sc-fybuyZ dbcJDJ']")).click();

			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.cssSelector("#popover-content > div > div > section > header > div > button")));

				driver.findElement(By.cssSelector("#popover-content > div > div > section > header > div > button"))
						.click();

				driver.navigate().refresh();

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

				driver.findElement(By.xpath("//*[text()='Confirm']")).click();

			} catch (Exception E) {

				driver.navigate().refresh();

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));
				driver.findElement(By.xpath("//*[text()='Confirm']")).click();

			}

			driver.switchTo().window(newTb.get(1));

			try {
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

				driver.findElement(By.cssSelector(
						"#root > div.sc-ksXiFW.bHLZxk > div.sc-dIUeWJ.bsfnEV > div > div.sc-kfzBvY.dHohrU")).click();

			} catch (Exception E1) {
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

				driver.findElement(By.cssSelector(
						"#root > div.sc-ksXiFW.bHLZxk > div.sc-dIUeWJ.bsfnEV > div > div.sc-kfzBvY.dHohrU")).click();

			}
		}
	}
  }
