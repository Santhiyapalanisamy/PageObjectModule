package AdactinPOM;

public class AdactinMainClass extends Adactinbase {
	public static void main(String[] args) throws InterruptedException {
		browserLaunch("http://adactinhotelapp.com/");
		
		Adachomepage a = new Adachomepage();
		inputText(a.getUser(),"abinesh1990");
		inputText(a.getPass(),"Abinesh123");
		button(a.getLogin());
		
		SearchHotel s = new SearchHotel(); 
		outputText(s.getTitle());
		inputText(s.getLoc(),"London");
		inputText(s.getHotels(),"Hotel Sunshine");
		inputText(s.getRoom(),"Deluxe");
		inputText(s.getNoOfRooms(),"3 - Three");
		inputText(s.getAdults(),"2 - Two");
		inputText(s.getChild(),"2 - Two");
		button(s.getSearch());
		
		SelectHotel d = new SelectHotel();
		outputText(d.getTitle2());
		button(d.getSelect());
		button(d.getCon());
		
		BookHotel b = new BookHotel();
		outputText(b.getTitle3());
		inputText(b.getName(),"Santhiya");
		inputText(b.getLast(),"palanisamy");
		inputText(b.getAddress(),"123456789");
		inputText(b.getCcNum(),"1234567890123456");
		inputText(b.getCcType(),"VISA");
		inputText(b.getExpiry(),"March");
		inputText(b.getYear(),"2022");
		inputText(b.getCvv(),"123");
		button(b.getB());
		Thread.sleep(5000);
		
		LastPage l=new LastPage();
		outputText(l.getTitle4());
		outputAttribute(l.getOdd());

	}

}

