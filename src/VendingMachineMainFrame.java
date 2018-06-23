/*
 * Developer: Dennis van der Vlugt
 * Studentnumber: 418679
 * 
 * HogeSchool InHolland
 * 
 * Java 2
 * 
 * "Frisdrankautomaat" 
 * 
 */

import javax.swing.JFrame;

/*
 * Class: VendingMachine
 * 
 * Creates main application frame 
 * 
 */

public class VendingMachineMainFrame extends JFrame 
{
	
	private UserInterfacePanel m_UserInterface;
	
	public VendingMachineMainFrame()
	{
		m_UserInterface = new UserInterfacePanel();
		setContentPane(m_UserInterface);
	}
	
	public static void main(String args[])
	{
		JFrame mainFrame = new VendingMachineMainFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("Vending Machine");
		mainFrame.setSize(600,400);
		mainFrame.setVisible(true);
	}	

}
