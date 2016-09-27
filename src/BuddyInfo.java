 
public class BuddyInfo {
	private String name;
	private int phoneNumber;
	private String address;	
	
	public BuddyInfo(String name, String address, int number)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public static void main(String[] args) {
		
		BuddyInfo friend = new BuddyInfo("Bob", "street lane", 33);
		
		friend.setName("Bob");
		friend.setAddress("2 street crescent");
		friend.setPhoneNumber(123456);
		
		System.out.println("Hello " + friend.getName() +"!");
	}

}
