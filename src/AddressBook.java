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
	

}
