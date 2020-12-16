import java.util.*;

public class Battle {
	public Battle(int duration, int casulties, Nation[] participants, Nation victorius) {
		super();
		this.setDuration(duration);
		this.casulties = casulties;
		this.participants = participants;
		this.victorius = victorius;
	}
	private int duration; // in seconds???
	private int casulties;
	private Nation[] participants = new Nation[2];
	private Nation victorius = new Nation();
	
	
	
	// changes influence values
	public static void calc(Battle battle) throws Exception{
		Nation defeated = null;
		Data data = Data.getInstance();
		
		for(int i=0;i<1;i++)
			if (battle.participants[i] != battle.victorius)
				defeated = battle.participants[i];
		
		if(battle.victorius.getPop() > defeated.getPop())
			data.setPopInfuence((data.getPopInfuence() / 2 + data.getPopInfuence()));
		else if  (battle.victorius.getPop() < defeated.getPop())
			data.setPopInfuence((data.getPopInfuence() - data.getPopInfuence()/2));
	
		if(battle.victorius.getMilTech() > defeated.getMilTech())
			data.setMilTechInfuence((data.getMilTechInfuence() / 2 + data.getMilTechInfuence()));
		else if  (battle.victorius.getMilTech() < defeated.getMilTech())
			data.setMilTechInfuence((data.getMilTechInfuence() - data.getMilTechInfuence()/2));
		
		if(battle.victorius.getTerr() > defeated.getTerr())
			data.setTerrInfuence((data.getTerrInfuence() / 2 + data.getTerrInfuence()));
		else if  (battle.victorius.getTerr() < defeated.getTerr())
			data.setTerrInfuence((data.getTerrInfuence() - data.getTerrInfuence()/2));
		
		if(battle.victorius.getLuck() > defeated.getLuck())
			data.setLuckInfuence((data.getLuckInfuence() / 2 + data.getLuckInfuence()));
		else if  (battle.victorius.getLuck() < defeated.getLuck())
			data.setPopInfuence((data.getLuckInfuence() - data.getLuckInfuence()/2));
		
		if(battle.victorius.getStrength() > defeated.getStrength())
			data.setStrengthInfuence((data.getStrengthInfuence() / 2 + data.getStrengthInfuence()));
		else if  (battle.victorius.getStrength() < defeated.getStrength())
			data.setStrengthInfuence((data.getStrengthInfuence() - data.getStrengthInfuence()/2));
		
	}
	
	// CALC A WINNER
	public static Nation[] calc(Nation n1,  Nation n2){

		return null;
	}
	
	public int getCasulties() {
		return casulties;
	}
	public void setCasulties(int casulties) {
		this.casulties = casulties;
	}
	public Nation[] getParticipant() {
		return participants;
	}
	public void setParticipant(Nation[] participants) {
		this.participants = participants;
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
}
