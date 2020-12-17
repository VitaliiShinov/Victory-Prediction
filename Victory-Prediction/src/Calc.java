
public class Calc {

		// changes influence values
		public static void calc() throws Exception{
			Data data = Data.getInstance();
			
			int numOfBattles = data.getBattles().size();
			
			for(int i=0; i<numOfBattles; i++)
			{
				Battle battle = data.getBattles().get(i);
				if(battle.getVictorius().getPop() > battle.getDefeated().getPop())
					data.setPopInfuence(100/(numOfBattles+1) + data.getPopInfuence());
				else if  (battle.getVictorius().getPop() < battle.getDefeated().getPop())
					data.setPopInfuence((data.getPopInfuence() - 100/(numOfBattles+1)));
				
				if(battle.getVictorius().getMilTech() > battle.getDefeated().getMilTech())
					data.setMilTechInfuence(100/(numOfBattles+1) + data.getMilTechInfuence());
				else if  (battle.getVictorius().getMilTech() < battle.getDefeated().getMilTech())
					data.setMilTechInfuence((data.getMilTechInfuence() - 100/(numOfBattles+1)));
					
				if(battle.getVictorius().getTerr() > battle.getDefeated().getTerr())
					data.setTerrInfuence(100/(numOfBattles+1) + data.getTerrInfuence());
				else if  (battle.getVictorius().getTerr() < battle.getDefeated().getTerr())
					data.setTerrInfuence(data.getTerrInfuence() - 100/(numOfBattles+1));
					
				if(battle.getVictorius().getLuck() > battle.getDefeated().getLuck())
					data.setLuckInfuence(100/(numOfBattles+1) + data.getLuckInfuence());
				else if  (battle.getVictorius().getLuck() < battle.getDefeated().getLuck())
					data.setLuckInfuence(data.getLuckInfuence() - (100/(numOfBattles+1)));
							
				if(battle.getVictorius().getStrength() > battle.getDefeated().getStrength())
					data.setStrengthInfuence(100/(numOfBattles+1) + data.getStrengthInfuence());
				else if  (battle.getVictorius().getStrength() < battle.getDefeated().getStrength())
					data.setStrengthInfuence((data.getStrengthInfuence() - 100/(numOfBattles+1)));
				
			}	
		}
		
		// CALC A WINNER
		public static Nation calc(Nation n1,  Nation customNation){
			
			Data data = Data.getInstance();
			
			int advantage = 0;
			
			int rPop = n1.getPop() * data.getPopInfuence()/100;
			int rMilTech = n1.getMilTech() * data.getMilTechInfuence()/100;
			int rTerr= n1.getTerr() * data.getTerrInfuence()/100;
			int rLuck = n1.getLuck() * data.getLuckInfuence()/100;
			int rStrength= n1.getStrength() * data.getStrengthInfuence()/100;
			
			if (customNation.getPop()>rPop) 
				advantage++;
			if (customNation.getMilTech()>rMilTech) 
				advantage++;
			if (customNation.getTerr()>rTerr) 
				advantage++;
			if (customNation.getLuck()>rLuck) 
				advantage++;
			if (customNation.getStrength()>rStrength) 
				advantage++;
		
			if(advantage>2)
				return customNation;
			
			return n1;
		}
}
