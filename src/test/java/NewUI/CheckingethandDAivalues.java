package NewUI;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class CheckingethandDAivalues {

	ExtentReports extent;
	ExtentTest logger;
	ChromeDriver driver;

	@Test
	public void values() throws InterruptedException {

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

		// Getting Borrow limit amount balance

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(".sc-gTgzoy div:nth-of-type(1) .sc-dkaWRx")));

		List<WebElement> ETH = driver.findElements(By.cssSelector(".sc-gTgzoy div:nth-of-type(1) .sc-dkaWRx"));

		driver.navigate().refresh();

		driver.findElement(By.xpath("//*[@class='sc-fubCzh cjxupP']")).click();

		driver.findElement(By.cssSelector(
				"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > div.sc-lmoMya.hDDeZq > div > div.sc-ezredP.htRjFu"))
				.click();

		driver.switchTo().window(newTb.get(1));

		// Getting values ETH and DAI values from compound website

		driver.get("https://app.compound.finance/");

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a:nth-of-type(1) > .connect-item-text")));

		driver.findElement(By.cssSelector("a:nth-of-type(1) > .connect-item-text")).click();

		try {

			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));

			driver.findElement(By.xpath("//*[text()='Next']")).click();

		}

		catch (Exception E1) {
			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Next']")));

			driver.findElement(By.xpath("//*[text()='Next']")).click();
		}

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect']")));

		driver.findElement(By.xpath("//*[text()='Connect']")).click();

		driver.switchTo().window(newTb.get(1));

		driver.navigate().refresh();

		System.out.println("+++++++++++++++++++++++++++++");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"#collateral-pane .asset:nth-of-type(4) [class='col-xs-0 col-sm-3 text-right mobile-hide'] .balance div")));

		List<WebElement> ratio = driver.findElements(By.cssSelector(
				"#collateral-pane .asset:nth-of-type(4) [class='col-xs-0 col-sm-3 text-right mobile-hide'] .balance div"));

		for (WebElement rati121 : ratio) {

			String rat12 = rati121.getText();

			String BLA = rat12;

			String BLV = BLA.replace("%", "");

			System.out.println("Ether value =" + BLV);

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"div#borrowing-pane > .panel > .asset-list > .assets > a:nth-of-type(6) > .col-sm-3.col-xs-0.mobile-hide.text-right > .balance > div")));

			List<WebElement> Loan = driver.findElements(By.cssSelector(
					"div#borrowing-pane > .panel > .asset-list > .assets > a:nth-of-type(6) > .col-sm-3.col-xs-0.mobile-hide.text-right > .balance > div"));

			for (WebElement Loa : Loan) {

				String LOANAMOUNT = Loa.getText();

				String MM = LOANAMOUNT;

				String MM2 = MM.replace("%", "");

				System.out.println("DAI Value=" + MM2);

				driver.get("https://rapid:headphones_mug@staging.d302m820cdpigj.amplifyapp.com/");

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='wallet']")));

				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("return document.readyState").toString().equals("complete");

				// Getting application ETH value

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
						"div:nth-of-type(1) > .cOUWrN.sc-bSFUlv > .jiUtCS.sc-edoYdd > .euOZKV.sc-hJJRrs > div:nth-of-type(2) > .eyyWYH.sc-eisiLS")));

				List<WebElement> AETHvalue = driver.findElements(By.cssSelector(
						"div:nth-of-type(1) > .cOUWrN.sc-bSFUlv > .jiUtCS.sc-edoYdd > .euOZKV.sc-hJJRrs > div:nth-of-type(2) > .eyyWYH.sc-eisiLS"));

				for (WebElement ETHVALUE : AETHvalue) {

					String ETHVALUE1 = ETHVALUE.getText();

					// System.out.println(LOANAMOUNT);

					String MM3 = ETHVALUE1;

					String MM4 = MM3.replace("%", "");

					System.out.println("Application ETH =" + MM4);

					wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
							"div:nth-of-type(2) > .cOUWrN.sc-bSFUlv > .jiUtCS.sc-edoYdd > .euOZKV.sc-hJJRrs > div:nth-of-type(2) > .eyyWYH.sc-eisiLS")));

					List<WebElement> ADAIvalue = driver.findElements(By.cssSelector(
							"div:nth-of-type(2) > .cOUWrN.sc-bSFUlv > .jiUtCS.sc-edoYdd > .euOZKV.sc-hJJRrs > div:nth-of-type(2) > .eyyWYH.sc-eisiLS"));

					for (WebElement DAIVALUE : ADAIvalue) {

						String DAIVALUE1 = DAIVALUE.getText();

						// System.out.println(LOANAMOUNT);

						String MM5 = DAIVALUE1;

						String MM6 = MM5.replace("%", "");

						System.out.println("DAI Value=" + MM6);

						if (MM2.equals(MM6)) {
							System.out.println("Test case Pass");

						} else {
							System.out.println("Test case Fail");
						}

						if (MM4.equals(BLV)) {

							System.out.println(MM4);
							System.out.println(BLV);

							System.out.println("Test case pass");
						}

						else {
							System.out.println(MM4);
							System.out.println(BLV);
							System.out.println("Test case Fail");
						}

					}
				}
			}
		}
	}
}
