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

import javax.swing.JButton;

/*
 * Class: InterFaceButton
 * 
 * Create button according to pre-defined standard 
 * 
 */

public class InterFaceButton extends JButton 
{
	private Font m_ButtonFont;
	
	public InterFaceButton(String tag)
	{
		m_ButtonFont = new Font("SansSerif",Font.BOLD,18);
		this.setText(tag);
		this.setFont(m_ButtonFont);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.white);
		
	}
}
