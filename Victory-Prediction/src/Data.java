import java.util.ArrayList;
import java.util.List;

public class Data {
	private static Data data = null;

	
	private List<Nation> nations = new ArrayList<Nation>();
	private List<Battle> battles = new ArrayList<Battle>();
	
	static Nation rome =  new Nation("Rome", -1, 1, 1, 5, Age.ANCTIENT, 25000);
	static Nation cart =  new Nation("Carthagin", -1, 1, 1, 5, Age.ANCTIENT, 50000);
	
	// 0 to 100
	private int popInfuence = 0 ;
	private int milTechInfuence = 0;
	private int terrInfuence = 0;
	private int luckInfuence = 0;
	private int strengthInfuence = 0;
	
	public int getPopInfuence() {
		return popInfuence;
	}
	public void setPopInfuence(int popInfuence) throws Exception {
		if(popInfuence >= 0 && popInfuence<=100)
			this.popInfuence = popInfuence;
		else throw new Exception("popInfuence is not in range");
	}
	public int getMilTechInfuence() {
		return milTechInfuence;
	}
	public void setMilTechInfuence(int milTechInfuence) throws Exception {
		if(milTechInfuence >= 0 &&  milTechInfuence <=100)
			this.milTechInfuence = milTechInfuence;
		else throw new Exception("milTechInfuence is not in range");
	}
	public int getTerrInfuence() {
		return terrInfuence;
	}
	public void setTerrInfuence(int terrInfuence) throws Exception {
		if(terrInfuence >= 0 &&  terrInfuence <=100)
			this.terrInfuence = terrInfuence;
		else throw new Exception("terrInfuence is not in range");
	}
	public int getLuckInfuence() {
		return luckInfuence;
	}
	public void setLuckInfuence(int luckInfuence) throws Exception {
		if(luckInfuence >= 0 &&  luckInfuence <=100)
			this.luckInfuence = luckInfuence;
		else throw new Exception("luckInfuence is not in range");
	}
	public int getStrengthInfuence() {
		return strengthInfuence;
	}
	public void setStrengthInfuence(int strengthInfuence) throws Exception {
		if(strengthInfuence >= 0 &&  strengthInfuence <=100)
			this.strengthInfuence = strengthInfuence;
		else throw new Exception("strengthInfuence is not in range");
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
	}
	
	private static void initBattle() {
		data.battles.add(new Battle(0, 0, new Nation[] {rome, cart}, rome ));
	}
	
}
