package NewUI;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
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

public class Depositcolletral {

	ExtentReports extent;
	ExtentTest logger;
	ChromeDriver driver;

	@Test
	public void f() {

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

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect Wallet']")));

			driver.findElement(By.xpath("//*[text()='Connect Wallet']")).click();

			String phandle2 = driver.getWindowHandle();

			driver.findElement(By.xpath("//*[@type='checkbox']")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Metamask']")));

			driver.findElement(By.xpath("//*[text()='Metamask']")).click();

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

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
				"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > div.sc-lmoMya.hDDeZq > div > div.sc-ezredP.htRjFu")));

		driver.findElement(By.cssSelector(
				"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > div.sc-lmoMya.hDDeZq > div > div.sc-ezredP.htRjFu"))
				.click();

		driver.switchTo().window(newTb.get(1));

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@alt='wallet']")));

		// Getting current balance

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(".sc-gTgzoy div:nth-of-type(1) .sc-dkaWRx")));

		List<WebElement> ETH = driver.findElements(By.cssSelector(".sc-gTgzoy div:nth-of-type(1) .sc-dkaWRx"));

		driver.navigate().refresh();

		driver.findElement(By.xpath("//*[@class='sc-fubCzh cjxupP']")).click();

		driver.findElement(By.cssSelector(
				"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > div.sc-lmoMya.hDDeZq > div > div.sc-ezredP.htRjFu"))
				.click();
		// Getting Metamask balance

		driver.switchTo().window(newTb.get(0));

		List<WebElement> ETH22 = driver.findElements(By.xpath("//*[@class='currency-display-component__text']"));

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		for (WebElement ET : ETH22) {

			String ETHbalance = ET.getText();

			System.out.println("Before transaction Balance = " + ETHbalance);

			String ETHbalance1 = ETHbalance;

			// String SS = ETHbalance1.replace("ETH", "");

			double d = Double.parseDouble(ETHbalance1);

			double d1 = 5.00;

			double d2 = d / d1;

			String s = String.valueOf(d2);

			System.out.println("=======" + s);

			driver.switchTo().window(newTb.get(1));

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ethAmount")));

			driver.findElement(By.id("ethAmount")).sendKeys(s);

			WebElement proceed = driver.findElement(By.xpath("//*[text()='Proceed']"));

			proceed.click();

			// Thread.sleep(3000);

			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.cssSelector("#popover-content > div > div > section > header > div > button")));
				driver.findElement(By.cssSelector("#popover-content > div > div > section > header > div > button"))
						.click();

			} catch (Exception E) {
				System.out.println("Else condition");
			}

			driver.navigate().refresh();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

			driver.findElement(By.xpath("//*[text()='Confirm']")).click();

			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.cssSelector("#popover-content > div > div > section > header > div > button")));

			driver.findElement(By.cssSelector("#popover-content > div > div > section > header > div > button"))
					.click();

			// Thread.sleep(3000);

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
			List<WebElement> ETH2 = driver.findElements(By.cssSelector(".sc-gTgzoy div:nth-of-type(1) .sc-dkaWRx"));

			for (WebElement ET11 : ETH2) {

				String ETHbalance111 = ET11.getText();

				System.out.println("After transaction balance  = " + ETHbalance111);

				extent.flush();

			}

		}
	}
}
