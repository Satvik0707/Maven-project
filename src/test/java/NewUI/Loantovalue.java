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

public class Loantovalue {

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

		// Loan to value calculation
		// Loan to value = Loan / colletral

		// Getting loan value

		driver.navigate().refresh();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("return document.readyState").toString().equals("complete");

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector(".dhNiQt:nth-of-type(1) .kBjZZl:nth-of-type(2) .sc-fxNMLY")));

		List<WebElement> Loan = driver
				.findElements(By.cssSelector(".dhNiQt:nth-of-type(1) .kBjZZl:nth-of-type(2) .sc-fxNMLY"));

		for (WebElement Loa : Loan) {

			String LOANAMOUNT = Loa.getText();

			// System.out.println(LOANAMOUNT);

			String MM = LOANAMOUNT;

			String MM2 = MM.replace("$", "");

			System.out.println("Loan amount=" + MM2);

			double d = Double.parseDouble(MM2);

			// Getting colletral value

			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.cssSelector(".dhNiQt:nth-of-type(1) .kBjZZl:nth-of-type(2) .sc-fxNMLY")));

			List<WebElement> Collateral = driver
					.findElements(By.cssSelector(".dhNiQt:nth-of-type(1) .kBjZZl:nth-of-type(1) .sc-fxNMLY"));

			for (WebElement coll : Collateral) {

				String Amount = coll.getText();

				// System.out.println(LOANAMOUNT);

				String MM3 = Amount;

				String MM4 = MM3.replace(",", "");

				String MM5 = MM4.replace("$", "");

				System.out.println("Loan amount=" + MM5);

				double d1 = Double.parseDouble(MM5);

				double d3 = d / d1;

				double d5 = d3 * 100;

				System.out.println("====== loan to value ==== " + d5);

				double value = d5;

				value = Double.parseDouble(new DecimalFormat("##.##").format(value));

				System.out.println("Borrow limit =" + value);

				// double d7= Double.parseDouble(value);

				// Getting loan to valu

				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector(".fqpbgt:nth-of-type(5) .jMhGat:nth-of-type(2)")));

				List<WebElement> Loantovalue = driver
						.findElements(By.cssSelector(".fqpbgt:nth-of-type(5) .jMhGat:nth-of-type(2)"));

				for (WebElement LTvalue : Loantovalue) {

					String Tvalue = LTvalue.getText();

					// System.out.println(LOANAMOUNT);

					String MM6 = Tvalue;

					String MM7 = MM6.replace("%", "");

					System.out.println("Loan amount=" + MM7);

					double d7 = Double.parseDouble(MM7);

					if (d7 == value) {
						System.out.println("Test case pass");
					} else {
						System.out.println("Test case Fail");
					}
				}

			}

		}
	}

}