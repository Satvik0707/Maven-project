package Refi;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Homepage {

	public void Colletralbalance(ChromeDriver driver) {

		List<WebElement> AccountBalance = driver.findElements(By.cssSelector(".sc-ehSDrC div:nth-of-type(1) .dAlUnL"));

		WebDriverWait wait = new WebDriverWait(driver, 10);

		try {

			// Here checking dummy element why because after connect to meta mask values
			// will change its takes fractions of seconds

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(".sc-eJMPIT div:nth-of-tye(1) .gtRlYV")));

		}

		catch (Exception E) {
			// System.out.println("Getting application values");
		}

		for (WebElement Balance : AccountBalance) {

			String CollateralBalance = Balance.getText();

			// System.out.println("Before transaction Balance = " + AssetETHBalance);

			String Assetbalance = CollateralBalance;

			String AETHbalance = Assetbalance.replace("ETH", "");

			System.out.println("Before dashboard  Collateral balance  = " + AETHbalance);

		}
	}

	public void Afterbalance(ChromeDriver driver) {

		List<WebElement> AccountBalance = driver.findElements(By.cssSelector(".sc-ehSDrC div:nth-of-type(1) .dAlUnL"));

		WebDriverWait wait = new WebDriverWait(driver, 10);

		try {

			// Here checking dummy element why because after connect to meta mask values
			// will change its takes fractions of seconds

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(".sc-eJMPIT div:nth-of-tye(1) .gtRlYV")));

		}

		catch (Exception E) {
			// System.out.println("Getting application values");
		}

		for (WebElement Balance : AccountBalance) {

			String CollateralBalance = Balance.getText();

			// System.out.println("Before transaction Balance = " + AssetETHBalance);

			String Assetbalance = CollateralBalance;

			String AETHbalance = Assetbalance.replace("ETH", "");

			System.out.println("After dashboard  Collateral balance  = " + AETHbalance);

		}

	}

	public void ColletralbalanceAfter(ChromeDriver driver) {

		List<WebElement> AccountBalance1 = driver.findElements(By.cssSelector(".sc-ehSDrC div:nth-of-type(1) .grrkDB"));

		try {

			// Here checking dummy element why because after connect to meta mask values
			// will change its takes fractions of seconds
			WebDriverWait wait = new WebDriverWait(driver, 10);

			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector(".sc-eJMPIT div:nth-of-tye(1) .gtRlYV")));

		}

		catch (Exception E) {
			// System.out.println("Getting application values");

			for (WebElement Balance1 : AccountBalance1) {

				String CollateralBalance1 = Balance1.getText();

				// System.out.println("Before transaction Balance = " + AssetETHBalance);

				String Assetbalance1 = CollateralBalance1;

				String AETHbalance1 = Assetbalance1.replace("ETH", "");

				System.out.println("After Dashboard Collateral balance  = " + AETHbalance1);

			}

		}
	}

	public void transactionsuccess(ChromeDriver driver) {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.switchTo().window(newTb.get(1));

		try {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

			driver.findElement(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div.sc-jeGTLq.eAmDAT > div.sc-giImIA.iMbshj > div > div.sc-kLgnNl.kyhqia"))
					.click();
		}

		catch (Exception e) {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

			driver.findElement(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div.sc-higWrZ.rlnin > div.sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII"))
					.click();

		}

	}

	public void ETHDEPOSIT(ChromeDriver driver) {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		WebDriverWait wait = new WebDriverWait(driver, 20);

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sc-ehSDrC
		// div:nth-of-type(1) .dAlUnL")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#ethAmount")));

		driver.findElement(By.cssSelector("input#ethAmount")).sendKeys("2");

		// Click on procedd button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Proceed']")));

		driver.findElement(By.xpath("//*[text()='Proceed']")).click();

		driver.switchTo().window(newTb.get(0));

		driver.navigate().refresh();

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.cssSelector("#popover-content > div > div > section > header > div > button")));

			driver.findElement(By.cssSelector("#popover-content > div > div > section > header > div > button"))
					.click();
		} catch (Exception E1) {

			// System.out.println("Execution catch block ");
		}

		driver.navigate().refresh();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

		driver.findElement(By.xpath("//*[text()='Confirm']")).click();

		driver.switchTo().window(newTb.get(1));

	}

	public void metamaskdisconnection(ChromeDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='sc-pGacB jkQiiZ']")));

		driver.findElement(By.xpath("//*[@class='sc-pGacB jkQiiZ']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Disconnect Wallet']")));

		driver.findElement(By.xpath("//*[text()='Disconnect Wallet']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect Wallet'][1]")));

		driver.findElement(By.xpath("//*[text()='Connect Wallet'][1]")).click();

	}

	public void Borrowloan(ChromeDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Deposit / Borrow']")));

		driver.findElement(By.xpath("//*[text()='Deposit / Borrow']")).click();

		// Borrowing loan

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("daiAmount")));

		driver.findElement(By.id("daiAmount")).sendKeys("100");

		// Procedd button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Proceed']")));

		driver.findElement(By.xpath("//*[text()='Proceed']")).click();

	}

	public void confirmbuttton(ChromeDriver driver) {
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(0));

		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {
			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

			driver.findElement(By.xpath("//*[text()='Confirm']")).click();
		}

		catch (Exception E3) {
			driver.switchTo().window(newTb.get(0));

			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

			driver.findElement(By.xpath("//*[text()='Confirm']")).click();

		}

	}

	public void Aftertransactionloan(ChromeDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > .sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));

		}

		catch (Exception E) {
			// System.out.println("Getting values");
		}
		List<WebElement> Loanamount = driver.findElements(By.cssSelector(".cfDMUy:nth-of-type(2) .grrkDx"));

		for (WebElement Loanamountbalance : Loanamount) {

			String Loanbalance = Loanamountbalance.getText();

			// System.out.println("Before transaction Balance = " + AssetETHBalance);

			String Lbalance = Loanbalance;

			String AETHbalance1 = Lbalance.replace("$", "");

			System.out.println("After Borrow Loan Amount = " + Lbalance);

		}
	}

	public void Beforetransactionloan(ChromeDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > .sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));

		}

		catch (Exception E) {
			// System.out.println("Getting values");
		}
		List<WebElement> Loanamount = driver.findElements(By.cssSelector(".cfDMUy:nth-of-type(2) .grrkDx"));

		for (WebElement Loanamountbalance : Loanamount) {

			String Loanbalance = Loanamountbalance.getText();

			// System.out.println("Before transaction Balance = " + AssetETHBalance);

			String Lbalance = Loanbalance;
			String AETHbalance1 = Lbalance.replace("$", "");

			System.out.println("Before borrow Loan Amount = " + Lbalance);

		}

	}

	public void repayloan(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Repay / Withdraw']")));

		driver.findElement(By.xpath("//*[text()='Repay / Withdraw']")).click();

		// repay Loan

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("daiAmount")));

		driver.findElement(By.id("daiAmount")).sendKeys("100");

		// proceed

		// Click on proceed button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Proceed']")));

		driver.findElement(By.xpath("//*[text()='Proceed']")).click();
	}

	public void unapprovedtransaction(ChromeDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		try {

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Unapproved']")));
			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

			driver.findElement(By.xpath("//*[text()='Confirm']")).click();

		}

		catch (Exception e6) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Unapproved']")));
			driver.navigate().refresh();

			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

			driver.findElement(By.xpath("//*[text()='Confirm']")).click();

		}
	}

	public void withdrawcolletral(ChromeDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Repay button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Repay / Withdraw']")));

		driver.findElement(By.xpath("//*[text()='Repay / Withdraw']")).click();

		// with draw colletral

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ethAmount")));

		driver.findElement(By.id("ethAmount")).sendKeys("2");

		// Click on procedd button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Proceed']")));

		driver.findElement(By.xpath("//*[text()='Proceed']")).click();
	}

	public void calcualteborrowlimitamount(ChromeDriver driver) {
		// Borrow limit amount = (loan / (loan + borrow limit amount)) * 100

		// Get Loan value

		// Get Borrow limit amount then calculate

		WebDriverWait wait = new WebDriverWait(driver, 10);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > .sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));

		}

		catch (Exception E) {
			// System.out.println("Getting values");
		}
		List<WebElement> Loan = driver.findElements(By.cssSelector(".cfDMUy:nth-of-type(2) .grrkDx"));

		for (WebElement Loa : Loan) {

			String LOANAMOUNT = Loa.getText();

			// System.out.println(LOANAMOUNT);

			String MM = LOANAMOUNT;

			// System.out.println("++++++++++++++" + MM);

			String MM2 = MM.replace("$", "");

			String mainChapterNumber = MM2.split("\\.", 2)[0];

			Double d1 = Double.valueOf(mainChapterNumber);

			System.out.println("Loan amount =" + d1);

			// Borrow Limit amount

			List<WebElement> ratio111 = driver
					.findElements(By.cssSelector("div:nth-of-type(1) > div:nth-of-type(1) > .gmpwVd.sc-BXpxD"));

			for (WebElement rati12 : ratio111) {

				String rat12 = rati12.getText();

				String BLA = rat12;

				String BLV1 = BLA.replace("DAI", "");

				String BLV = BLV1.replace(",", "");

				double d = Double.parseDouble(BLV);

				System.out.println("Borrow lmit amount =" + d);

				double d3 = d + d1;

				double d4 = d1 / d3;

				double d5 = d4 * 100;

				System.out.println("Borrow limit = " + d5);

				double value = d5;

				value = Double.parseDouble(new DecimalFormat("##.##").format(value));

				System.out.println("Borrow limit =" + value);

				// comparing the application values and expected values

				List<WebElement> Loan1 = driver
						.findElements(By.cssSelector("div:nth-of-type(1) > div:nth-of-type(2) > .gmpwVd.sc-BXpxD"));

				for (WebElement Limit : Loan1) {

					String Borrow = Limit.getText();

					String BLoan = Borrow;

					String BL = BLoan.replace("%", "");

					double value2 = Double.parseDouble(BL);

					// Comparing the values excepted and actual

					if (value == value2) {
						System.out.println("Test case pass");
					} else {
						System.out.println("Test case Fail");
					}

				}
			}

		}

	}

	public void Healthratio(ChromeDriver driver) {

		// Health ratio = colletral / loan
		WebDriverWait wait = new WebDriverWait(driver, 10);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > .sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));

		}

		catch (Exception E) {
			// System.out.println("Getting values");
		}
		List<WebElement> Loan = driver.findElements(By.cssSelector(".cfDMUy:nth-of-type(2) .grrkDx"));

		for (WebElement Loa : Loan) {

			String LOANAMOUNT = Loa.getText();

			// System.out.println(LOANAMOUNT);

			String MM = LOANAMOUNT;

			// System.out.println("++++++++++++++" + MM);

			String MM2 = MM.replace("$", "");

			String mainChapterNumber = MM2.split("\\.", 2)[0];

			Double Loan1 = Double.valueOf(mainChapterNumber);

			System.out.println("Loan amount =" + Loan1);

			// Colletral amount

			List<WebElement> Colletralamount = driver
					.findElements(By.cssSelector(".bmhFje:nth-of-type(1) .cfDMUy:nth-of-type(1) .sc-nFqVA"));

			for (WebElement Camount : Colletralamount) {

				String Collamount = Camount.getText();

				String CA = Collamount;

				String BLV1 = CA.replace("$", "");

				String BLV = BLV1.replace(",", "");

				String mainChapterNumber1 = BLV.split("\\.", 2)[0];

				double Dcolletralamount = Double.parseDouble(mainChapterNumber1);

				System.out.println("Borrow lmit amount =" + Dcolletralamount);

				double Healthratio = Dcolletralamount / Loan1;

				System.out.println("Helath ratio = " + Healthratio);
			}
		}
	}

	public void calculateBorrowingpower(ChromeDriver driver) {

//	Borrowingpower = (loan / collateral ) * cether collateral factor

		WebDriverWait wait = new WebDriverWait(driver, 10);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(
					"#root > div.sc-bdfBQB.gNNzpt > div:nth-child(1) > .sc-giImIA.iMbshj > div > div.sc-kLgnNl.iqTDII")));

		}

		catch (Exception E) {
			// System.out.println("Getting values");
		}
		List<WebElement> Loan = driver.findElements(By.cssSelector(".cfDMUy:nth-of-type(2) .grrkDx"));

		for (WebElement Loa : Loan) {

			String LOANAMOUNT = Loa.getText();

			// System.out.println(LOANAMOUNT);

			String MM = LOANAMOUNT;

			// System.out.println("++++++++++++++" + MM);

			String MM2 = MM.replace("$", "");

			String mainChapterNumber = MM2.replaceAll("\\s+", "");

			Double Loan1 = Double.valueOf(mainChapterNumber);

			System.out.println("Loan amount =" + Loan1);

			// Colletral amount

			List<WebElement> Colletralamount = driver
					.findElements(By.cssSelector(".bmhFje:nth-of-type(1) .cfDMUy:nth-of-type(1) .sc-nFqVA"));

			for (WebElement Camount : Colletralamount) {

				String Collamount = Camount.getText();

				String CA = Collamount;

				String BLV1 = CA.replace("$", "");

				String spaces = BLV1.replaceAll("\\s", "");

				String BLV = spaces.replace(",", "");

				// String mainChapterNumber1 = BLV.split("\\.", 2)[0];

				double Dcolletralamount = Double.parseDouble(BLV);

				System.out.println("Borrow lmit amount =" + Dcolletralamount);

				double LCA = Loan1 / Dcolletralamount;

				double cethercolletralfactor = 0.60;

				double Bpower = LCA * cethercolletralfactor;

				double d6 = Bpower * 100;

				double value = d6;

				value = Double.parseDouble(new DecimalFormat("##.##").format(value));

				System.out.println("Borrowing power = " + value);

			}
		}

	}

	public void Maxrepayloan(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Repay / Withdraw']")));

		driver.findElement(By.xpath("//*[text()='Repay / Withdraw']")).click();

		// Max button

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("[action] .fdXzIF:nth-of-type(2) .sc-gVgoRu")));

		driver.findElement(By.cssSelector("[action] .fdXzIF:nth-of-type(2) .sc-gVgoRu")).click();

		// proceed

		// Click on proceed button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Proceed']")));

		driver.findElement(By.xpath("//*[text()='Proceed']")).click();
	}

	public void Maxwithdraw(ChromeDriver driver)

	{
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Repay / Withdraw']")));

		driver.findElement(By.xpath("//*[text()='Repay / Withdraw']")).click();

		// Max button

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("[action] .fdXzIF:nth-of-type(2) .sc-gVgoRu")));

		driver.findElement(By.cssSelector("[action] .fdXzIF:nth-of-type(2) .sc-gVgoRu")).click();

		// proceed

		// Click on proceed button

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Proceed']")));

		driver.findElement(By.xpath("//*[text()='Proceed']")).click();
	}
}