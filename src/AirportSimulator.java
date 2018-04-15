import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AirportSimulator implements ActionListener {
	JFrame mainFrame;
	JPanel mainPanel;

	JButton startButton;
	JButton helpButton;
	JButton exitButton;

	public static void main(String[] args) {
		AirportSimulator run = new AirportSimulator();
		run.startMainMenu();

	}

	public void startMainMenu() {
		mainFrame = new JFrame();
		mainPanel = new JPanel();

		startButton = new JButton();
		helpButton = new JButton();
		exitButton = new JButton();

		mainFrame.add(mainPanel);
		mainFrame.setTitle("Airport Simulator");

		startButton.addActionListener(this);
		helpButton.addActionListener(this);
		exitButton.addActionListener(this);

		startButton.setText("Start");
		helpButton.setText("Help");
		exitButton.setText("Exit");

		mainPanel.add(startButton);
		mainPanel.add(helpButton);
		mainPanel.add(exitButton);

		mainFrame.setVisible(true);
		mainFrame.pack();
	}
	//Step 1 Run the program and click help to understand what you are making
	
	//Step 2 Create three buttons for three different airlines.
	
	public void whenStartIsPressed() {
		
		//Step 3 Start by making a new JFrame, and JPanel.
		
		//Step 4 Add action listeners to each button
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if (startButton == buttonPressed) {
			//Step 5 Call the method
			
		}
		if (helpButton == buttonPressed) {
			JOptionPane.showMessageDialog(null, "This program will allow you to purchase plane tickets from airlines.");
		}
		if (exitButton == buttonPressed) {
			System.exit(0);
		}
		
		//Step 6 When an airline is clicked, use a OptionDialog to choose the tier of your seat. Business, First, Economy.
		
		
		//Step 7 Make a checkout page showing all of the tickets you selected		
		

	}
}
