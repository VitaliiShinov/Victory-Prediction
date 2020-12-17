public class Battle {
	public Battle(int duration, int casulties, Nation[] participants, Nation victorius, Nation defeated) {
		super();
		this.setDuration(duration);
		this.casulties = casulties;
		this.setParticipants(participants);
		this.victorius = victorius;
		this.setDefeated(defeated);
	}
	private int duration; // in seconds???
	private int casulties;
	private Nation[] participants = new Nation[2];
	private Nation victorius;
	private Nation defeated;
	
	
	public int getCasulties() {
		return casulties;
	}
	public void setCasulties(int casulties) {
		this.casulties = casulties;
	}
	public Nation[] getParticipant() {
		return getParticipants();
	}
	public void setParticipant(Nation[] participants) {
		this.setParticipants(participants);
	}
	public Nation getVictorius() {
		return victorius;
	}
	public void setVictorius(Nation victorius) {
		this.victorius = victorius;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Nation[] getParticipants() {
		return participants;
	}
	public void setParticipants(Nation[] participants) {
		this.participants = participants;
	}
	public Nation getDefeated() {
		return defeated;
	}
	public void setDefeated(Nation defeated) {
		this.defeated = defeated;
	}
}
