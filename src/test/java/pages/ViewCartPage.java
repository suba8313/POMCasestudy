package pages;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;



public class ViewCartPage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Cart')]")
	WebElement gotocart;
	
	@FindBy(xpath="//tr[@class='success']")
	List<WebElement> deleteobj;
	
	@FindBy(xpath="//h3")
	WebElement price;
	
	@FindBy(xpath="//h3")
	WebElement price1;
	
	
	@FindBy(xpath="(//td[4]//a)[1]")
	WebElement delete;
	
	WebDriverWait wait;
	public ViewCartPage() {
		PageFactory.initElements(driver, this);
	}
	

	public boolean delete() throws InterruptedException{
		wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		gotocart.click();
		
		String totalamount=price.getText();
		int total= Integer.parseInt(totalamount);
		System.out.println(total);
		delete.click();
		
		String totalamounts= price1.getText();
		int totals= Integer.parseInt(totalamounts);
		System.out.println(totalamounts);
		
		return (total>totals);
	}
	
}
