import java.util.List;

public class Presenter {
	// TODO Auto-generated constructor stub
	Data data = Data.getInstance();
	
	
	public void calc() {
		try {
			Calc.calc(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Nation calc(int index, Nation n2) {
		Nation nation = null;
		try {
			nation =  Calc.calc(data.getNations().get(index), n2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nation;
	}
	
	public Nation getNationByIndex(int i) {
		return data.getNations().get(i);
	}

	public Nation getCustomNation(String text, int parseInt, int parseInt2, int parseInt3, int parseInt4, int parseInt5,
			int parseInt6) {
		return new Nation(text, parseInt, parseInt2, parseInt3, parseInt4, parseInt5, parseInt6);
	}

	public List<Nation> getNations() {
		
		return data.getNations();
	}


	
	
}
