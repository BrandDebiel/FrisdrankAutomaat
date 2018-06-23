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

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/*
 * Class: MessageDisplay
 * 
 * Create display according to pre-defined standard 
 * 
 */

public class MessageDisplayLabel extends JLabel
{
	Font m_DisplayFont;
	
	public MessageDisplayLabel()
	{
		m_DisplayFont = new Font("SansSerif",Font.BOLD,15);
		setText("MESSAGE DISPLAY");
		setHorizontalAlignment(SwingConstants.CENTER);		
		setFont(m_DisplayFont);
		setForeground(Color.BLACK);
	}
	

}
