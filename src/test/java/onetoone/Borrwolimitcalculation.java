package onetoone;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Borrwolimitcalculation {
	ChromeDriver driver;

	@Test
	public void Yieldvalue() throws InterruptedException {
		
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

			driver.get("https://rapid:headphones_mug@staging.d302m820cdpigj.amplifyapp.com/");

			Thread.sleep(2000);

			Actions action = new Actions(driver);

			List<WebElement> ratio111 = driver.findElements(By.cssSelector(".iLFemt.sc-eJMPIT > ul > li:nth-of-type(1) > span"));

			for (WebElement rati12 : ratio111) {
				
				String rat12 = rati12.getText();

				System.out.println(rat12);
				
				double d= Double.parseDouble(rat12);
				
				System.out.println("Borrow lmit amount ="+d);
				
			//	Loan value
				
				List<WebElement> Loan = driver.findElements(By.cssSelector(".iNQmrE.sc-dUrmIn > p"));
				
				for (WebElement Loa : Loan) {
					
					String LOANAMOUNT = Loa.getText();

					System.out.println(LOANAMOUNT);
					
					
					String MM= LOANAMOUNT;
					
					String MM2=MM.replace("$", "");
					
					double d1= Double.parseDouble(MM2);
					
					System.out.println("Loan amount ="+d1);
					
					//Borrow limit = (loan / (loan + borrow limit amount)) * 100
					
					double d3= d+d1;
					double d4= d1 /d3 ;
					
					double d5 = d4*100;
					
					System.out.println("Borrow limit = "+ d5);
					
					double value = d5;
					value = Double.parseDouble(new DecimalFormat("##.##").format(value));
					
					System.out.println("Borrow limit ="+value);
					
					List<WebElement> Loan1 = driver.findElements(By.cssSelector(".Fwxf.sc-FyeoB > p"));
					
					for (WebElement Limit : Loan1 )
					{
						String Borrow = Limit.getText();
						
						String BLoan= Borrow;
						
						String BL= BLoan.replace("%", "");
						
						double value2=Double.parseDouble(BL) ;
						
						if (value==value2)
						{
							System.out.println("Test case pass");
						}
						else 
						{
							System.out.println("Test case Fail");
						}
					}
					
					
				}

//				String y = rat12;
//
//				int MM = y.indexOf("Y");
//
//				System.out.println("=====" + MM);

			}
		}

	}
