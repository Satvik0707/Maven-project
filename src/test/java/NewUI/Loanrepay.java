package NewUI;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loanrepay {

	ExtentReports extent;
	ExtentTest logger;
	ChromeDriver driver;

	@Test
	public void Withdraw() {

		ExtentHtmlReporter reporter = new ExtentHtmlReporter(".//Reports//Buttonschecking.html");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		logger = extent.createTest("LoginTest");

		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();

		option.addExtensions(new File(".//Metamask//metamask_10_2_2_0.crx"));

		driver = new ChromeDriver(option);

		driver.manage().deleteAllCookies();

		driver.get("https://rapid:headphones_mug@staging.d302m820cdpigj.amplifyapp.com/");

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect Wallet']")));

		driver.findElement(By.xpath("//*[text()='Connect Wallet']")).click();

		String phandle = driver.getWindowHandle();

		driver.findElement(By.xpath("//*[@type='checkbox']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Metamask']")));

		driver.findElement(By.xpath("//*[text()='Metamask']")).click();

		// Assert.assertTrue(waitForNewWindow(driver,120));

		// Thread.sleep(4000);

		driver.switchTo().window(newTb.get(0));

		driver.findElement(By.xpath("//*[text()='Ethereum Mainnet']")).click();

		driver.findElement(By.xpath("//*[text()='Ropsten Test Network']")).click();

		driver.findElement(By.xpath("//*[@class='currency-display-component__text']"));

		driver.switchTo().window(newTb.get(1));

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

			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect
			// Wallet']")));

			driver.findElement(By.xpath("//*[text()='Connect Wallet']")).click();

			String phandle2 = driver.getWindowHandle();

			driver.findElement(By.xpath("//*[@type='checkbox']")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Metamask']")));

			driver.findElement(By.xpath("//*[text()='Metamask']")).click();

			// Thread.sleep(4000);

			// Assert.assertTrue(waitForNewWindow(driver,120));

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='wallet']")));

		// Withdraw collertal balance

		driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sc-fubCzh cjxupP']")));

		driver.findElement(By.xpath("//*[@class='sc-fubCzh cjxupP']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > div.sc-lmoMya.hDDeZq > div > div.sc-ezredP.htRjFu")));

		driver.findElement(By.cssSelector(
				"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > div.sc-lmoMya.hDDeZq > div > div.sc-ezredP.htRjFu"))
				.click();


		List<WebElement> ETH221 = driver
				.findElements(By.cssSelector("div:nth-of-type(1) > div:nth-of-type(2) > .nGBEM.sc-fxNMLY"));

		for (WebElement ET1 : ETH221) {

			String ETHbalance11 = ET1.getText();

			System.out.println("Before transaction Balance = " + ETHbalance11);

			String ETHbalance112 = ETHbalance11;

			String SSS = ETHbalance11.replace("$", "");

			double dd = Double.parseDouble(SSS);

			double dd1 = 5.00;

			double dd2 = dd / dd1;

			String s1 = String.valueOf(dd2);

			System.out.println("Enter text value " + s1);

			WebElement repaywithdraw = driver.findElement(By.xpath("//*[text()='Repay / Withdraw']"));

			repaywithdraw.click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("daiAmount")));

			WebElement withdrawcollateral = driver.findElement(By.id("daiAmount"));

			withdrawcollateral.sendKeys(s1);

			WebElement proceed1 = driver.findElement(By.xpath("//*[text()='Proceed']"));

			proceed1.click();

			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();

			try {

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

				driver.findElement(By.xpath("//*[text()='Confirm']")).click();
			}

			catch (Exception E) {

				driver.navigate().refresh();
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

				driver.findElement(By.xpath("//*[text()='Confirm']")).click();
			}


			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.cssSelector("#popover-content > div > div > section > header > div > button")));

			driver.findElement(By.cssSelector("#popover-content > div > div > section > header > div > button"))
					.click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//*[@class='transaction-status transaction-status--unapproved']")));

			driver.findElement(By.xpath("//*[@class='transaction-status transaction-status--unapproved']"));

			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

			driver.findElement(By.xpath("//*[text()='Confirm']")).click();

			driver.switchTo().window(newTb.get(1));

			driver.switchTo().window(newTb.get(1));

			try {
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

				driver.findElement(By.cssSelector(
						"#root > div.sc-bdfBQB.gNNzpt > div.sc-jgHCSr.gDRvjF > div.sc-lmoMya.hDDeZq > div > div.sc-ezredP.htRjFu"))
						.click();

			} catch (Exception E) {

				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

				driver.findElement(By.cssSelector(
						"#root > div.sc-bdfBQB.gNNzpt > div.sc-jgHCSr.gDRvjF > div.sc-lmoMya.hDDeZq > div > div.sc-ezredP.htRjFu"))
						.click();
			}

			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='wallet']")));

			List<WebElement> ETH2 = driver.findElements(By.cssSelector("div:nth-of-type(1) > div:nth-of-type(2) > .nGBEM.sc-fxNMLY"));

			for (WebElement ET11 : ETH2) {

				String ETHbalance111 = ET11.getText();

				System.out.println("After transaction balance  = " + ETHbalance111);

			}

		}
	}
}
