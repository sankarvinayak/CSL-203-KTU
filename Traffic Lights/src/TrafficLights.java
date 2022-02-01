import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
public class TrafficLights extends JFrame implements ActionListener {
	JRadioButton buttonRed,buttonYellow,buttonGreen;
    Signal green = new Signal(Color.green);
    Signal yellow = new Signal(Color.yellow);
    Signal red = new Signal(Color.red);
	ButtonGroup g1;
	public TrafficLights() {
		super("Java Traffic light program");
		getContentPane().setLayout(new GridLayout(2,1));
		buttonRed = new JRadioButton("Red");
		buttonYellow=new JRadioButton("Yellow");
		buttonGreen = new JRadioButton("Green");
		buttonRed.addActionListener(this);
		buttonYellow.addActionListener(this);
		buttonGreen.addActionListener(this);
		JPanel lightPanel = new JPanel(new GridLayout(3,1));
		JPanel controlPanel = new JPanel(new GridLayout(1,3));
		lightPanel.add(red);
		lightPanel.add(yellow);
		lightPanel.add(green);
		controlPanel.add(buttonGreen);
		controlPanel.add(buttonYellow);
		controlPanel.add(buttonRed);
		getContentPane().add(lightPanel);
		getContentPane().add(controlPanel);
		pack();
		g1=new ButtonGroup();
		g1.add(buttonGreen);
		g1.add(buttonRed);
		g1.add(buttonYellow);
	}
	public static void main(String[] args) {
		TrafficLights lights=new TrafficLights();
		lights.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String light = "";
		if(buttonGreen.isSelected()) {
			 red.turnOn(false);          
	         yellow.turnOn(false);
	         green.turnOn(true);
		}
		else if(buttonYellow.isSelected()) {
			 yellow.turnOn(true);          
	         green.turnOn(false);
	         red.turnOn(false);
		}
		else {
            green.turnOn(false);          
            yellow.turnOn(false);
            red.turnOn(true);
		}
	}
}

