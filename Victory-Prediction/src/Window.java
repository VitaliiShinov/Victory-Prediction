import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Window extends JFrame {
	
	private JLabel popInfuence = new JLabel();
	private JLabel milTechInfuence = new JLabel();
	private JLabel terrInfuence  = new JLabel();
	private JLabel luckInfuence = new JLabel();
	private JLabel strengthInfuence = new JLabel();
	
	private JTextField popInput = new JTextField("popInput");
	private JTextField milTechInput  = new JTextField("milTechInput");
	private JTextField terrInput  = new JTextField("terrInput");
	private JTextField luckInput  = new JTextField("luckInput"); 
	private JTextField strengthInput  = new JTextField("strengthInput");
	private JTextField nameInput  = new JTextField("name");
	private JTextField ageInput  = new JTextField("ageInput");
	
	private JPanel infoPanel;
	private JPanel inputPanel;
	private JPanel nationPanel;
	
	private JComboBox  nations;
	
	private JButton b1;
	private JButton b2;
	
	 public Window(int w, int h) {
	    super("Victory Prediction");
	    Data data = Data.getInstance();
	    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    this.setSize(w,h);	
	    setResizable(false);
	    this.setLayout(new GridLayout(1,3));
	    
	    b1 = new  JButton("Calc");
	    b1.setPreferredSize(new Dimension(100,100));
	    b1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
	    			Calc.calc();
	    			data.setLuckInfuence(data.getLuckInfuence()/2+data.getLuckInfuence());
	    			refresh();
	    			b1.setEnabled(false);
	    		}catch (Exception e1) {
	    			e1.printStackTrace();
	    		};
	    	 	}
	    });
	    
	    b1 = new  JButton("Calc");
	    b1.setPreferredSize(new Dimension(100,100));
	    b1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
	    			Calc.calc();
	    			refresh();
	    			b1.setEnabled(false);
	    		}catch (Exception e1) {
	    			e1.printStackTrace();
	    		};
	    	 	}
	    });
	    
	    b2 = new JButton("LET THE BATTLE BEGIN");
	    b2.setPreferredSize(new Dimension(100,100));
	    b2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
	    			
	    			Nation customNation = 	new Nation(nameInput.getText(), Integer.parseInt(popInput.getText()), 
	    									Integer.parseInt(milTechInput.getText()), Integer.parseInt(terrInput.getText()),
	    									Integer.parseInt(luckInput.getText()), Integer.parseInt(ageInput.getText()),
	    									Integer.parseInt(strengthInput.getText()));
	    			
	    			Nation victoriousNation = Calc.calc(data.getNations().get(nations.getSelectedIndex()), customNation);
	    			if(victoriousNation.getName() == customNation.getName())
	    				JOptionPane.showMessageDialog(	b2.getParent(), "GLORY TO " + customNation.getName() +"!!! YOU ARE VICTORIOUS OVER " + 
	    												data.getNations().get(nations.getSelectedIndex()).getName());
	    			
	    			else
	    				JOptionPane.showMessageDialog(	b2.getParent(), "BAD LUCK " + data.getNations().get(nations.getSelectedIndex()).getName() 
	    												+" COMLITLLY DEMOLISHED " + customNation.getName());
	    
	    		}catch (Exception e1) {
	    			e1.printStackTrace();
	    		};
	    	 	}
	    });
	    
	    
	    infoPanel = new JPanel(new GridLayout(6,1));
	    
	    infoPanel.add(popInfuence);
	    infoPanel.add(milTechInfuence);
	    infoPanel.add(terrInfuence);
	    infoPanel.add(luckInfuence);
	    infoPanel.add(strengthInfuence);
	    
	    infoPanel.add(b1);
	    
	    this.add(infoPanel);
	    
	  
	    
	    inputPanel =new JPanel(new GridLayout(5,1));
   
	    inputPanel.add(nameInput);
	    inputPanel.add(popInput);
	    inputPanel.add(milTechInput);
	    inputPanel.add(terrInput);
	    inputPanel.add(luckInput);
	    inputPanel.add(ageInput);
	    inputPanel.add(strengthInput);
	    
	    this.add(inputPanel);
	    
	    
	    
	    nationPanel = new JPanel(new GridLayout(2,1));
	    nations= new JComboBox<Nation>();
	    
	    for(int i=0;  i<data.getNations().size(); i++){
	    	nations.addItem(data.getNations().get(i).getName());
	    }
	    
	    nationPanel.add(nations);
	    nationPanel.add(b2);
	    
	    this.add(nationPanel);
	    
	    this.refresh();
	    this.setVisible(true);
	
	   }
	 
	 public void refresh(){
		 Data data = Data.getInstance();
		 
		 this.revalidate();
		 this.repaint();
		 
		 popInfuence.setText("popInfuence" + ": " + String.valueOf(data.getPopInfuence()) + "%");
		 milTechInfuence.setText("milTechInfuence" + ": " + String.valueOf(data.getMilTechInfuence())+ "%");
		 terrInfuence.setText("terrInfuence" + ": " + String.valueOf(data.getTerrInfuence())+ "%");
		 luckInfuence.setText("luckInfuence" + ": " + String.valueOf(data.getLuckInfuence())+ "%");
		 strengthInfuence.setText("strengthInfuence" + ": " + String.valueOf(data.getStrengthInfuence())+ "%");
	 }
}