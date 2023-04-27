package AdactinPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LastPage extends Adactinbase {
	 
	public LastPage() {
		PageFactory.initElements(driver,this);
	}	
	    @FindBy(className ="login_title")
	    private WebElement title4;
		@FindBy(xpath ="//input[@id='order_no']")
		private WebElement odd;
		
		public WebElement getOdd() {
			return odd;
		}
		public WebElement getTitle4() {
			return title4;
		}
		
	}