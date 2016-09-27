import java.util.ArrayList;

public class AddressBook {
	
	private ArrayList<BuddyInfo> buddyList;
	
	public AddressBook()
	{
		buddyList = new ArrayList<BuddyInfo>();
		
	}
	
	public void addBuddy(BuddyInfo buddy)
	{
		buddyList.add(buddy);
	}
	public void removeBuddy(BuddyInfo buddy)
	{
		for(BuddyInfo b : buddyList)
		{
			if(buddy.equals(b))
			{
				buddyList.remove(b);
			}
		}
	}
	
	public static void main(String args[])
	{
		System.out.println("Address book");
		AddressBook addressBook = new AddressBook();
		BuddyInfo bud = new BuddyInfo("Tom", "Carleton", 1234);
		addressBook.addBuddy(bud);
		addressBook.removeBuddy(bud);
	}

}
