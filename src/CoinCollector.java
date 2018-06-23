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

import javax.swing.JTextField;

/*
 * Class: CoinCollector
 * 
 * Create collector to take money input 
 * 
 */

public class CoinCollector extends JTextField 
{
	Font m_CollectorFont;
	
	public CoinCollector()
	{
		m_CollectorFont = new Font("SansSerif",Font.BOLD,14);
		setFont(m_CollectorFont);
		setForeground(Color.BLACK);
		setHorizontalAlignment(CENTER);
		resetCollector();
	}
	
	public double getAmount()
	{
		return (Double.parseDouble(getText()));
	}
	
	public void resetCollector()
	{
		setText("0.00");
	}

}
