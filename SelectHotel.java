package AdactinPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SelectHotel extends Adactinbase{
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//td[@class='login_title'])[1]")
	private WebElement title2;
	
	@FindBy(id="radiobutton_0")
	private WebElement select;
	@FindBy(id="continue")
	private WebElement con;
	public WebElement getSelect() {
		return select;
	}
	public WebElement getCon() {
		return con;
	}
	public WebElement getTitle2() {
		return title2;
	}

}

