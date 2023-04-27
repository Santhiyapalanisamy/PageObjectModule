package AdactinPOM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends Adactinbase {
    public SearchHotel() {
    	PageFactory.initElements(driver, this);
    	
}
    @FindBy(className="login_title")
    private WebElement title;
    @FindBy(id="location")
    private WebElement loc;
    @FindBy(id="hotels")
    private WebElement hotels;
    @FindBy(id="room_type")
    private WebElement room;
    @FindBy(id="room_nos")
    private WebElement noOfRooms;
    @FindBy(id="adult_room")
    private WebElement adults;
    @FindBy(id="child_room")
    private WebElement child;
    @FindBy(id="Submit")
    private WebElement search;
    
    
	public WebElement getTitle() {
		
		return title;
	}
	public WebElement getLoc() {
		
		return loc;
	}
	public WebElement getHotels() {
		
		return hotels;
	}
	public WebElement getRoom() {
		
		return room;
	}
	public WebElement getNoOfRooms() {
	
		return noOfRooms;
	}
	public WebElement getAdults() {
		
		return adults;
	}
	public WebElement getChild() {	
		return child;
	}
	public WebElement getSearch() {
		return search;
	}

}
