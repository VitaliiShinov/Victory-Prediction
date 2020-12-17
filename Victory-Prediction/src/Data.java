import java.util.ArrayList;
import java.util.List;

public class Data {
	private static Data data = null;

	private List<Nation> nations = new ArrayList<Nation>();
	private List<Battle> battles = new ArrayList<Battle>();
	
	static Nation rome = new Nation("Rome", 2, 1, 1, 10, Age.ANCTIENT, 25000);
	static Nation cart = new Nation("Carthagin", 1, 1, 1, 5, Age.ANCTIENT, 50000);
	static Nation rus =  new Nation("Russia", 6, 3, 10, 10, Age.RENAISSANCE, 34000);
	static Nation swe =  new Nation("Sweden", 4, 4, 3, 5, Age.RENAISSANCE, 17000);
	
	// 0 to 100
	private int popInfuence = 50;
	private int milTechInfuence = 50;
	private int terrInfuence = 50;
	private int luckInfuence = 50;
	private int strengthInfuence = 50;
	
	public List<Nation> getNations() {
		return nations;
	}
	public void setNations(List<Nation> nations) {
		this.nations = nations;
	}
	
	public List<Battle> getBattles() {
		return battles;
	}
	public void setBattles(List<Battle> battles) {
		this.battles = battles;
	}

	public int getPopInfuence() {
		return popInfuence;
	}
	public void setPopInfuence(int popInfuence){
		if(popInfuence < 0)
			this.popInfuence = 0;
		else if (popInfuence > 100)
			this.popInfuence = 100;
		else 
			this.popInfuence = popInfuence;
	}

	public int getMilTechInfuence() {
		return milTechInfuence;
	}
	public void setMilTechInfuence(int milTechInfuence){
		if(milTechInfuence < 0)
			this.milTechInfuence = 0;
		else if (milTechInfuence > 100)
			this.milTechInfuence = 100;
		else 
			this.milTechInfuence = milTechInfuence;
	}
	public int getTerrInfuence() {
		return terrInfuence;
	}
	public void setTerrInfuence(int terrInfuence){
		if(terrInfuence < 0)
			this.terrInfuence = 0;
		else if (terrInfuence > 100)
			this.terrInfuence = 100;
		else 
			this.terrInfuence = terrInfuence;
	}
	public int getLuckInfuence() {
		return luckInfuence;
	}
	public void setLuckInfuence(int luckInfuence){
		if(luckInfuence < 0)
			this.luckInfuence = 0;
		else if (luckInfuence > 100)
			this.luckInfuence = 100;
		else 
			this.luckInfuence = luckInfuence;
	}
	public int getStrengthInfuence() {
		return strengthInfuence;
	}
	public void setStrengthInfuence(int strengthInfuence){
		if(strengthInfuence < 0)
			this.strengthInfuence = 0;
		else if (strengthInfuence > 100)
			this.strengthInfuence = 100;
		else 
			this.strengthInfuence = strengthInfuence;
	}

	private static void init() {
		initNations();
		initBattle();
		
}
	public static Data getInstance() {
	      if(data == null) {
	    	  data = new Data();
	    	  init();
	      }
	      return data;
	   }
	
	private static void initNations() {
		
		data.nations.add(rome);
		data.nations.add(cart);
		data.nations.add(rus);
		data.nations.add(swe);
	}
	
	private static void initBattle() {
		data.battles.add(new Battle(0, 0, new Nation[] {rome, cart}, cart, rome));
		data.battles.add(new Battle(0, 0, new Nation[] {swe, rus}, rus, swe));
	}
	
}
