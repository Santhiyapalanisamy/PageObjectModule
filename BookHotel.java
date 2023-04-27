package AdactinPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BookHotel extends Adactinbase {
	public BookHotel() {
	PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement title3;
	@FindBy(id="first_name")
	private WebElement name;
	@FindBy(id="last_name")
	private WebElement last;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement ccNum;
	@FindBy(id="cc_type")
	private WebElement ccType;
	@FindBy(id="cc_exp_month")
	private WebElement expiry;
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement  b;
	
	public WebElement getName() {
		return name;
	}
	public WebElement getLast() {
		return last;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getCcType() {
		return ccType;
	}
	public WebElement getExpiry() {
		return expiry;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getB() {
		return b;
	}
	public WebElement getOdd() {
		return getOdd();
	}
	public WebElement getTitle3() {
		return title3;
	}
}
	
	