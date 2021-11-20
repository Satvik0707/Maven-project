package refi;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AllTestcases extends Basic {

	@Test(enabled = true, priority = 1)
	public void Connectionchecking() {

		System.out.println("Connection Done");
	}

	@Test(enabled = true, priority = 2)

	public void Disconnection() {
		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".gxVzsO.sc-jSgvzq > .fnVrth.sc-iBPTik")));

		driver.findElement(By.cssSelector(".gxVzsO.sc-jSgvzq > .fnVrth.sc-iBPTik")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='DISCONNECT WALLET']")));

		driver.findElement(By.xpath("//*[text()='DISCONNECT WALLET']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect']")));

	}

	@Test(enabled = true, priority = 3)

	public void buttonschecking() {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		WebElement Dashboard = driver.findElement(By.xpath("//*[@class='sc-eCstlR iFXaBz'][1]"));

		String Boardtext = Dashboard.getAttribute("innerText");

		String text = "DASHBOARD";

		System.out.println("Dashboard text = " + Boardtext.equals(text));

		highLighterMethod(driver, Dashboard);

		WebElement repaywithdraw = driver.findElement(By.xpath("//*[text()='Repay / Withdraw']"));

		highLighterMethod(driver, repaywithdraw);

		repaywithdraw.click();

		WebElement repaywithdraw2 = driver.findElement(By.xpath("//*[text()='repay & withdraw']"));

		String repay = repaywithdraw2.getAttribute("innerText");

		String draw = "REPAY & WITHDRAW";

		System.out.println("repay & withdraw=" + repay.equals(draw));

		highLighterMethod(driver, repaywithdraw2);

		repaywithdraw2.click();

		WebElement Depositborrow = driver.findElement(By.xpath("//*[text()='Deposit / Borrow']"));

		String Deposit = Depositborrow.getAttribute("innerText");

		String borrow = "DEPOSIT / BORROW";

		System.out.println("Deposit / Borrow =" + Deposit.equals(borrow));

		highLighterMethod(driver, Depositborrow);

		Depositborrow.click();

		WebElement proceed = driver.findElement(By.xpath("//*[text()='proceed']"));

		String procedd = proceed.getAttribute("innerText");

		String pro = "PROCEED";

		System.out.println("Proceed text=" + procedd.equals(pro));

		highLighterMethod(driver, proceed);

		WebElement logo = driver.findElement(By.xpath("//*[@class='sc-dlfnuX kwZAAN']"));

		highLighterMethod(driver, logo);

		logo.click();
	}

	private void highLighterMethod(ChromeDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	}

	@Test(enabled = true, priority = 4)

	public void DepositColletral() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(0));

		driver.findElement(By.xpath("//*[text()='Ethereum Mainnet']")).click();

		driver.findElement(By.xpath("//*[text()='Ropsten Test Network']")).click();

		driver.switchTo().window(newTb.get(1));

		driver.navigate().refresh();

		Thread.sleep(1000);

		List<WebElement> Balance1 = driver.findElements(By.cssSelector(".iMtgNb.sc-jUEmfL > p > span"));

		for (WebElement ava : Balance1) {

			String Et = ava.getText();

			String S1 = Et;

			String S2 = S1.replace("ETH", "");

			double D1 = Double.parseDouble(S2);

			System.out.println("Available ETH = ");

			if (D1 > 0.1) {

				driver.findElement(By.id("ethAmount")).sendKeys("0.1");

				driver.findElement(By.xpath("//*[text()='deposit']")).click();

				Thread.sleep(3000);

				driver.switchTo().window(newTb.get(0));

				driver.navigate().refresh();

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

				driver.findElement(By.xpath("//*[text()='Confirm']")).click();

				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.cssSelector("#popover-content > div > div > section > header > div > button")));

				driver.findElement(By.cssSelector("#popover-content > div > div > section > header > div > button"))
						.click();

				Thread.sleep(3000);

				driver.switchTo().window(newTb.get(1));

				try {
					wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

					driver.findElement(By.cssSelector("#root > div.sc-dIUeWJ.bsfnEV > div > div.sc-kfzBvY.dHohrU"))
							.click();

				} catch (Exception E) {
					wait.until(ExpectedConditions
							.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

					driver.findElement(By.cssSelector("#root > div.sc-dIUeWJ.bsfnEV > div > div.sc-kfzBvY.dHohrU"))
							.click();

					WebElement Balance2 = driver.findElement(By.xpath("//*[@class='sc-jUEmfL iMtgNb']"));

					String ttt2 = Balance2.getAttribute("innerText");

					System.out.println("Account balance" + ttt2);

					driver.switchTo().window(newTb.get(0));

				}
		
				} 
				else {

				System.out.println("Your are trying to add = 1 ETH ");

				System.out.println("Current ETH amount in your account = " + D1);

			}

		}
	}
	
	@Test(enabled = true, priority = 5)
	public void Viewetherscan() {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".gxVzsO.sc-jSgvzq > .fnVrth.sc-iBPTik")));

		driver.findElement(By.cssSelector(".gxVzsO.sc-jSgvzq > .fnVrth.sc-iBPTik")).click();

		driver.findElement(By.xpath("//*[text()='View on Etherscan']")).click();

		driver.findElement(By.xpath("//*[text()='View on Ethersca']"));

	}
	
	@Test(enabled = true, priority = 6)

	public void Copyaddreslink() {
		WebDriverWait wait = new WebDriverWait(driver, 60);

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".gxVzsO.sc-jSgvzq > .fnVrth.sc-iBPTik")));

		driver.findElement(By.cssSelector(".gxVzsO.sc-jSgvzq > .fnVrth.sc-iBPTik")).click();
		
		driver.findElement(By.xpath("//*[text()='Copy Address']")).click();

		driver.findElement(By.xpath("//*[text()='Copied']"));

	}
	
	@Test(enabled = true, priority = 7)
	public void BorrowDAI() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(0));

		driver.findElement(By.xpath("//*[text()='Ethereum Mainnet']")).click();

		driver.findElement(By.xpath("//*[text()='Ropsten Test Network']")).click();

		driver.switchTo().window(newTb.get(1));

		driver.navigate().refresh();

		WebElement Balance3 = driver.findElement(By.xpath("//div[@class='sc-eJMPIT iLFemt']/ul/li/span"));
		String ttt3 = Balance3.getAttribute("innerText");
		System.out.println("Account balance =" + ttt3);

		// System.out.println("Borrow limit amount = "+ttt3.replace("Account balance",
		// ""));

		String replacestring = ttt3.replace("Account balance", "");

		String replacestring1 = replacestring.replace(".", "");

		String DAIvalue = replacestring1.substring(0, replacestring1.length() - 2);

		List<WebElement> Damount = driver
				.findElements(By.cssSelector(".iLFemt.sc-eJMPIT > ul > li:nth-of-type(1) > span"));
		for (WebElement D : Damount) {
			String b = D.getText();

			// System.out.println(b);

			double value = Double.parseDouble(b);

			double c = 100.00;

			double E = value - c;

			// Check DAI VALUE

			driver.findElement(By.id("daiAmount")).sendKeys("100");

			driver.findElement(By.xpath("//*[text ()='proceed']")).click();

			driver.switchTo().window(newTb.get(0));

			Thread.sleep(2000);
			driver.navigate().refresh();

			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));
				driver.findElement(By.xpath("//*[text()='Confirm']")).click();

				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.cssSelector("#popover-content > div > div > section > header > div > button")));
				driver.findElement(By.cssSelector("#popover-content > div > div > section > header > div > button"))
						.click();

			} catch (Exception E1) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.cssSelector("#popover-content > div > div > section > header > div > button")));
				driver.findElement(By.cssSelector("#popover-content > div > div > section > header > div > button"))
						.click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));
				driver.findElement(By.xpath("//*[text()='Confirm']")).click();

			}

			driver.switchTo().window(newTb.get(1));

			try {
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

				driver.findElement(By.cssSelector("#root > div.sc-dIUeWJ.bsfnEV > div > div.sc-kfzBvY.dHohrU")).click();
			} catch (Exception E2) {
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

				driver.findElement(By.cssSelector("#root > div.sc-dIUeWJ.bsfnEV > div > div.sc-kfzBvY.dHohrU")).click();

			}
			driver.findElement(By.xpath("//*[text()='Repay / Withdraw']")).click();

			driver.findElement(By.xpath("//*[text()='Deposit / Borrow']")).click();
			List<WebElement> Damount1 = driver
					.findElements(By.cssSelector(".iLFemt.sc-eJMPIT > ul > li:nth-of-type(1) > span"));
			for (WebElement D1 : Damount1) {
				String b1 = D1.getText();

				// System.out.println(b1);

				double value1 = Double.parseDouble(b1);

				if (E == value1) {
					System.out.println("Test case Pass");
				} else {
					System.out.println("Test case Fail");
				}
			}
		}

	}
	
	@Test(enabled = true, priority = 8)

	public void Loanrepay() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 70);

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(0));
		
		driver.findElement(By.xpath("//*[text()='Ethereum Mainnet']")).click();

		driver.findElement(By.xpath("//*[text()='Ropsten Test Network']")).click();

		Thread.sleep(3000);

		driver.switchTo().window(newTb.get(1));

		driver.navigate().refresh();

		WebElement Balance1 = driver.findElement(By.xpath("//*[@class='sc-jUEmfL iMtgNb']"));

		String ttt1 = Balance1.getAttribute("innerText");

		System.out.println("Account balance" + ttt1);

		WebElement Colletral = driver.findElement(By.xpath("//*[@class='sc-dUrmIn iNQmrE']"));

		String Coll = Colletral.getAttribute("innerText");

		System.out.println("Loan amount = " + Coll);

		WebElement repaywithdraw = driver.findElement(By.xpath("//*[text()='Repay / Withdraw']"));

		repaywithdraw.click();

		List<WebElement> Lamount = driver.findElements(By.cssSelector(".iNQmrE.sc-dUrmIn > p"));
		for (WebElement webElement : Lamount) {
			String name = webElement.getText();

			// System.out.println("====" + name);

			String money = name;

			String m = money.replace("$", "");

			// System.out.println("====" + m);

			int i = Integer.parseInt(m);

			int a = 100;

			int c = i - a;

			// paying loan amount 100

//
			driver.findElement(By.id("daiAmount")).sendKeys("100");

			WebElement repaywithdraw2 = driver.findElement(By.xpath("//*[text()='repay']"));

			repaywithdraw2.click();

			Thread.sleep(4000);

			driver.switchTo().window(newTb.get(0));

			Thread.sleep(4000);

			driver.navigate().refresh();

			Thread.sleep(2000);

			driver.findElement(By.xpath("//*[text()='Confirm']")).click();

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

			try {
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

			} catch (Exception E) {
				wait.until(ExpectedConditions
						.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

			}
			driver.findElement(By.cssSelector("#root > div.sc-dIUeWJ.bsfnEV > div > div.sc-kfzBvY.dHohrU")).click();

			driver.navigate().refresh();

			List<WebElement> Lamount1 = driver.findElements(By.cssSelector(".iNQmrE.sc-dUrmIn > p"));

			for (WebElement webElement1 : Lamount1) {

				String name1 = webElement1.getText();

				// System.out.println("====" + name1);

				String money1 = name1;

				String m1 = money1.replace("$", "");

				// System.out.println("====" + m1);
				int i1 = Integer.parseInt(m1);

				if (i1 == c) {
					System.out.println("Test case pass");
				} else {
					System.out.println("Test case Fail");
				}

			}
		}
	}

	@Test(enabled = true, priority = 9)

	public void WithdrawETH() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(0));

		driver.findElement(By.xpath("//*[text()='Ethereum Mainnet']")).click();

		driver.findElement(By.xpath("//*[text()='Ropsten Test Network']")).click();

		driver.switchTo().window(newTb.get(1));

		driver.navigate().refresh();

		WebElement Balance1 = driver.findElement(By.xpath("//*[@class='sc-jUEmfL iMtgNb']"));

		String ttt1 = Balance1.getAttribute("innerText");

		System.out.println(" Balance " + ttt1);

		WebElement Colletral = driver.findElement(By.xpath("//*[@class='sc-httYss gHFZK']"));

		String Coll = Colletral.getAttribute("innerText");

		// System.out.println("-=============================="+Coll);

		WebElement repaywithdraw = driver.findElement(By.xpath("//*[text()='Repay / Withdraw']"));

		repaywithdraw.click();

		WebElement repaywithdraw2 = driver.findElement(By.xpath("//*[text()='repay & withdraw']"));

		driver.findElement(By.id("ethAmount")).sendKeys("0.0001");

		repaywithdraw2.click();

		driver.switchTo().window(newTb.get(0));

		Thread.sleep(2000);

		driver.navigate().refresh();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Confirm']")));

		driver.findElement(By.xpath("//*[text()='Confirm']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector("#popover-content > div > div > section > header > div > button")));

		driver.findElement(By.cssSelector("#popover-content > div > div > section > header > div > button")).click();

		driver.switchTo().window(newTb.get(1));

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

			driver.findElement(By.cssSelector("#root > div.sc-dIUeWJ.bsfnEV > div > div.sc-kfzBvY.dHohrU")).click();

			driver.navigate().refresh();

			WebElement Balance2 = driver.findElement(By.xpath("//*[@class='sc-jUEmfL iMtgNb']"));

			String ttt2 = Balance2.getAttribute("innerText");

			System.out.println("Balance == " + ttt2);

			driver.switchTo().window(newTb.get(0));

		} catch (Exception E) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Transaction Successful']")));

			driver.findElement(By.cssSelector("#root > div.sc-dIUeWJ.bsfnEV > div > div.sc-kfzBvY.dHohrU")).click();

			driver.navigate().refresh();

			WebElement Balance2 = driver.findElement(By.xpath("//*[@class='sc-jUEmfL iMtgNb']"));

			String ttt2 = Balance2.getAttribute("innerText");

			System.out.println("Balance " + ttt2);

		}

	}
	
	@Test(enabled = true, priority = 10)

	public void DAIBalance() {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(0));

		driver.findElement(By.xpath("//*[text()='Ethereum Mainnet']")).click();

		driver.findElement(By.xpath("//*[text()='Ropsten Test Network']")).click();

		driver.switchTo().window(newTb.get(1));

		driver.navigate().refresh();

		driver.findElement(By.xpath("//*[@class='sc-gKseQn ciHjFj']")).click();

		WebElement Bal = driver.findElement(By.xpath("//*[@class='sc-kstqJO jYZWvX']"));

		String Ballanc = Bal.getAttribute("innerText");

		System.out.println("Your balance =" + Ballanc);

	}
	
	@Test(enabled = true, priority = 11)

	public void Healthratio() {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(newTb.get(0));

		driver.findElement(By.xpath("//*[text()='Ethereum Mainnet']")).click();

		driver.findElement(By.xpath("//*[text()='Ropsten Test Network']")).click();

		driver.switchTo().window(newTb.get(1));

		driver.navigate().refresh();

		// Getting colletral value
		List<WebElement> colletral = driver.findElements(By.cssSelector(".efyPIk.sc-jmhFuu > p"));

		for (WebElement coll : colletral) {
			String Col = coll.getText();

			String M1 = Col;

			String M2 = M1.replace("$", "");

			double C1 = Double.parseDouble(M2);

			// getting loan value
			List<WebElement> Loan = driver.findElements(By.cssSelector(".iNQmrE.sc-dUrmIn > p"));
			for (WebElement loa : Loan) {
				String LO = loa.getText();

				String M3 = LO;

				String M4 = M3.replace("$", "");

				double C2 = Double.parseDouble(M4);

				double C3 = C1 / C2;

				System.out.println("value of ratio " + C3);

				double value = C3;
				value = Double.parseDouble(new DecimalFormat("##.##").format(value));

				System.out.println("Health ratio calculation =" + value);

				// health ratio= colletral divided loan

				List<WebElement> ratio = driver.findElements(By.cssSelector(".guNQua.sc-fmlJrY > p"));

				for (WebElement rt : ratio) {
					String M5 = rt.getText();

					double d6 = Double.parseDouble(M5);

					System.out.println("Health ratio =" + d6);

					if (d6 == C3) {

						System.out.println("Test case pass");
					} else {
						System.out.println("Test case fail ");
					}

				}

			}
		}

	}
	
	@Test(enabled = true, priority = 12)

	public void Walletsconnections() {

		WebDriverWait wait = new WebDriverWait(driver, 60);

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		driver.findElement(By.xpath("//*[text()='DISCONNECT WALLET']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Connect']")));

		driver.findElement(By.xpath("//*[text()='Connect']")).click();

		String phandle = driver.getWindowHandle();

		driver.findElement(By.xpath("//*[@type='checkbox']")).click();

		driver.findElement(By.xpath("//*[text()='Wallet Connect']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("walletconnect-qrcode-close")));

		driver.findElement(By.id("walletconnect-qrcode-close")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Coinbase']")));

		driver.findElement(By.xpath("//*[text()='Coinbase']")).click();
		
		
	}

}
