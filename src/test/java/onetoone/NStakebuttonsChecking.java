package onetoone;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class NStakebuttonsChecking {
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

		driver.findElement(By.xpath("//*[text()='Stake']")).click();

		WebElement Stake = driver.findElement(By.xpath("//*[@data-testid='stakeBtn']"));

		highLighterMethod(driver, Stake);

		WebElement Stake2 = driver.findElement(By.xpath("//*[@class='sc-fybuyZ dbcJDJ']"));

		highLighterMethod(driver, Stake2);

		WebElement Withdraw = driver.findElement(By.xpath("//*[@data-testid='withdrawBtn']"));

		highLighterMethod(driver, Withdraw);

		Withdraw.click();

		WebElement Requestwithdraw = driver.findElement(By.xpath("//*[text()='Request Withdrawal']"));

		highLighterMethod(driver, Requestwithdraw);

		WebElement Withdraw1 = driver.findElement(By.xpath("//*[@class='sc-exiMOr jcOGMV'][2]"));

		highLighterMethod(driver, Withdraw1);

	}

	private void highLighterMethod(ChromeDriver driver2, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	}

}
