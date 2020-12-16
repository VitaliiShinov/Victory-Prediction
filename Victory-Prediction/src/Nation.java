
public class Nation {
	private String name;
	private int pop;
	private int milTech;
	private int terr;
	private int luck;
	private int age;
	private int strength;
	
	public Nation(String name, int pop, int milTech, int terr, int luck, int age, int strength) {
		super();
		this.name = name;
		this.pop = pop;
		this.milTech = milTech;
		this.terr = terr;
		this.luck = luck;
		this.age = age;
		this.setStrength(strength);
	}
	
	public Nation() {}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPop() {
		return pop;
	}
	public void setPop(int pop) {
		this.pop = pop;
	}
	public int getMilTech() {
		return milTech;
	}
	public void setMilTech(int milTech) {
		this.milTech = milTech;
	}

	public int getTerr() {
		return terr;
	}

	public void setTerr(int terr) {
		this.terr = terr;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}


	
}
