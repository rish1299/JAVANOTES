package aggregationassignment3;

class Room {
		
	//Implement your code here 
	private int roomNo;
	private int capacity=4;
	private static int roomCounter;
	
	static {
		roomCounter=500;
	}
	
	public Room() {
	
		
		
		this.roomNo=roomCounter;
		roomCounter++;
		
	}

	public int getRoomNo() {
		return roomNo;
	}

	

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public static int getRoomCounter() {
		return roomCounter;
	}

	public static void setRoomCounter(int roomCounter) {
		
	}
	
	
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    /*
    public String toString(){
        return "Room\nroomNo: "+this.roomNo+"\ncapacity: "+this.capacity;
    }
    */ 

}

class Member {

	//Implement your code here 
	private int memberId;
	private String name;
	private Room room;
	
	public Member(int memberId, String name) {
		
		this.memberId = memberId;
		this.name = name;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
	
	
	
	//Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    /*
    public String toString(){
        return "Member\nmemberId: "+this.memberId+"\nname: "+this.name;
    }
    */

}

 class Admin 
 { 
	 public void assignRoom(Room []rooms,Member member) 
	 { 
		 for(Room room:rooms) 
	 {
		 int currentRoomCapacity=room.getCapacity(); 
		 
		 if(currentRoomCapacity>0) 
		 { 
		 room.setCapacity(currentRoomCapacity-1); 
		 member.setRoom(room); 
		 break;
	    } 
	 
	 } 
	 
	 } 
	
 }

 










public class Assgn3 {

	public static void main(String[] args) {
		
		Room room1 = new Room();
		Room room2 = new Room();
		Room room3 = new Room();
		Room room4 = new Room();
		Room room5 = new Room();

		Room[] totalRooms = { room1, room2, room3, room4, room5 };

		Admin admin = new Admin();

		Member member1 = new Member(101, "Serena");
		Member member2 = new Member(102, "Martha");
		Member member3 = new Member(103, "Nia");
		Member member4 = new Member(104, "Maria");
		Member member5 = new Member(105, "Eva");
		
		Member[] members = { member1, member2, member3, member4, member5 };
		
		for (Member member : members) {
			admin.assignRoom(totalRooms, member);
			if(member.getRoom()!=null) {
				System.out.println("Hi "+member.getName()+"! Your room number is "+member.getRoom().getRoomNo());
			}
			else {
				System.out.println("Hi "+member.getName()+"! No room available");
			}
		}
	}

}
