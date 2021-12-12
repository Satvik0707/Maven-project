package Refi;

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

public class AddingETH extends metamaskconnection {

	@Test(enabled = false, priority = 1)

	public void checkingconnection() {
		System.out.println("Connection done");

	}

	@Test(enabled = false, priority = 1)
	public void ETHdesposit() throws InterruptedException {

		// Here first getting current Balance

		// Adding eth

		// Transaction Success

		// After add colletral then getting the balance

		WebDriverWait wait = new WebDriverWait(driver, 20);

		Homepage page = new Homepage();

		page.Colletralbalance(driver);

		// adding ETH

		page.ETHDEPOSIT(driver);

		page.transactionsuccess(driver);

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".sc-ehSDrC div:nth-of-type(1) .grrkDB")));

		page.ColletralbalanceAfter(driver);

	}
//	@Test 
//	public void borrowLoan()
//	{
//		Borrowloan loan= new Borrowloan();
//		
//		loan.fivedigits(driver);
//	}

	@Test(enabled = false, priority = 1)

	public void disconn() {

		Homepage page = new Homepage();

		page.metamaskdisconnection(driver);

	}

	@Test(enabled = false, priority = 1)

	public void Borrowloan() {

		Homepage page = new Homepage();

		page.Beforetransactionloan(driver);

		page.Borrowloan(driver);

		page.confirmbuttton(driver);

		page.transactionsuccess(driver);

		page.Aftertransactionloan(driver);

	}

	@Test(enabled = false, priority = 1)

	public void Repayloan() {

		Homepage page = new Homepage();

		page.Beforetransactionloan(driver);

		page.repayloan(driver);

		page.confirmbuttton(driver);

		page.unapprovedtransaction(driver);

		page.transactionsuccess(driver);

		page.Aftertransactionloan(driver);

	}

	@Test(enabled = false, priority = 1)

	public void WithdrawETH() {

		Homepage page = new Homepage();

		page.Colletralbalance(driver);

		page.withdrawcolletral(driver);

		page.confirmbuttton(driver);

		page.transactionsuccess(driver);

		page.ColletralbalanceAfter(driver);

	}

	@Test(enabled = false, priority = 1)

	public void Borrowlimtcalculation() {

		Homepage page = new Homepage();

		page.calcualteborrowlimitamount(driver);

	}

	@Test(enabled = false, priority = 1)

	public void Healthratio() {

		Homepage page = new Homepage();

		page.Healthratio(driver);

	}

	@Test(enabled = false, priority = 1)

	public void borrowingpower() {

		Homepage page = new Homepage();
		
		System.out.println("calculation part ");

		page.calculateBorrowingpower(driver);

	}
	
	@Test(enabled = true, priority = 1)

	public void Repayloanmax() {

		Homepage page = new Homepage();

		page.Maxrepayloan(driver);
		
		page.confirmbuttton(driver);
		
		page.unapprovedtransaction(driver);
		
		page.transactionsuccess(driver);

		
	}
	@Test(enabled = true, priority = 1)

	public void Maxwithdraweth() {

		Homepage page = new Homepage();

		page.Maxwithdraw(driver);
		
		page.confirmbuttton(driver);
		
		page.transactionsuccess(driver);

		
	}
	
	
}
