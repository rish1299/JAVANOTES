package mthodoverriding;

class Event {
	
	private String eventName;
	private String participantName;
	private double registrationFee;
	
	
	public Event(String eventName, String participantName) {
		
		this.eventName = eventName;
		this.participantName = participantName;
	}


	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public String getParticipantName() {
		return participantName;
	}


	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}


	public double getRegistrationFee() {
		return registrationFee;
	}


	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	public void registerEvent() {
		
		if (this.getEventName().equals("Singing")) {
			double  basefee=8.0;
			this.setRegistrationFee(basefee);
			
		} else if (this.getEventName().equals("Dancing")) {
			double basefee=10.0;
			this.setRegistrationFee(basefee);
		}
		else if (this.getEventName().equals("DigitalArt")) {
			double  basefee=12.0;
			this.setRegistrationFee(basefee);
		}
		else if (this.getEventName().equals("Acting")) {
			double  basefee=15.0;
			this.setRegistrationFee(basefee);
		}
		else {
			this.setRegistrationFee(0.0);
		}
	}
	
	
	
}


class SoloEvent extends Event{
	
	private int participantNo;
	
	public SoloEvent(String eventName, String participantName, int participanNo )
	{
		super(eventName, participantName);
		this.participantNo=participanNo;
	}

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int partcipantNo) {
		this.participantNo = partcipantNo;
	}
	
public void registerEvent() {
		
		if (this.getEventName().equals("Singing")) {
			double  basefee=8.0;
			this.setRegistrationFee(basefee);
			
		} else if (this.getEventName().equals("Dancing")) {
			double  basefee=10.0;
			this.setRegistrationFee(basefee);
		}
		else if (this.getEventName().equals("DigitalArt")) {
			double  basefee=12.0;
			this.setRegistrationFee(basefee);
		}
		else if (this.getEventName().equals("Acting")) {
			double  basefee=15.0;
			this.setRegistrationFee(basefee);
		}
		else {
			this.setRegistrationFee(0.0);
		}
	
}
}

class TeamEvent extends Event{
	
	private int noOfParticipant;
	private int teamNo;
	
	public TeamEvent(String eventName, String participantName, int noOfParticipant,  int teamNo)
	{
		super(eventName, participantName);
		this.noOfParticipant=noOfParticipant;
		this.teamNo=teamNo;
		
	}

	public int getNoOfParticipant() {
		return noOfParticipant;
	}

	public void setNoOfParticipant(int noOfParticipant) {
		this.noOfParticipant = noOfParticipant;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
public void registerEvent() {
		
		if (this.getEventName().equals("Singing")) {
			double basefee=4.0;
			double sum;
			sum = basefee * this.getNoOfParticipant();
			this.setRegistrationFee(sum);
			
		} else if (this.getEventName().equals("Dancing")) {
			double  basefee=6.0;
			double sum;
			sum = basefee * this.getNoOfParticipant();
			this.setRegistrationFee(sum);
		}
		else if (this.getEventName().equals("DigitalArt")) {
			double  basefee=8.0;
			double sum;
			sum = basefee * this.getNoOfParticipant();
			this.setRegistrationFee(sum);
		}
		else if (this.getEventName().equals("Acting")) {
			double  basefee=10.0;
			double sum;
			sum = basefee * this.getNoOfParticipant();
			this.setRegistrationFee(sum);
		}
		else {
			this.setRegistrationFee(0.0);
		}
	
}

}


public class MethodOverAssgnment2 {

	public static void main(String[] args) {
		SoloEvent soloEvent = new SoloEvent("Dancing", "Jacob", 1);
		soloEvent.registerEvent();
		if (soloEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + soloEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + soloEvent.getRegistrationFee());
			System.out.println("Your participant number is " + soloEvent.getParticipantNo());

		} else {
			System.out.println("Please enter a valid event");
		}

		System.out.println();
		TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
		teamEvent.registerEvent();
		if (teamEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + teamEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
			System.out.println("Your team number is " + teamEvent.getTeamNo());
		} else {
			System.out.println("Please enter a valid event");
		}

	}

}
