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


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

/*
 * Class: UserInterface
 * 
 * Makes the main panel and handles user interaction 
 * 
 */

class UserInterfacePanel extends JPanel implements ActionListener
{
    private WarehouseStockHandler m_WareHouse;
    private CheckoutHandler m_Checkout;
    private MessageDisplayLabel m_MessageDisplay; 
    private CoinCollector m_CoinCollector;
    private ArrayList<Product> m_ProductList;
    private ArrayList<InterFaceButton> m_InterFaceButtonList;
   
   

	public UserInterfacePanel()
	{

		//Build GUI device
		m_WareHouse = new WarehouseStockHandler();
		m_Checkout = new CheckoutHandler(m_WareHouse);
		m_MessageDisplay = new MessageDisplayLabel();
		m_CoinCollector = new CoinCollector();
		m_ProductList = new ArrayList<Product>();
		m_InterFaceButtonList = new ArrayList<InterFaceButton>();
		
		//Add products
		m_ProductList.add(new Product("Cola", 1.15));
		m_ProductList.add(new Product("Fanta", 1.25));
		m_ProductList.add(new Product("7Up", 1.35));
		m_ProductList.add(new Product("IceTea", 1.45));
		
		//Build layout based on added products
		setLayout(new GridLayout(m_ProductList.size()+2,1));
		add(m_MessageDisplay);
		add(m_CoinCollector);
		
		//Build components based on added products
		for(int i = 0; i < m_ProductList.size(); i++)
		{
			m_WareHouse.addProduct(m_ProductList.get(i),2);
			m_InterFaceButtonList.add(new InterFaceButton(m_ProductList.get(i).getName()));
			add(m_InterFaceButtonList.get(i));
			m_InterFaceButtonList.get(i).addActionListener(this);
		}
		
		//Set default message
		m_MessageDisplay.setText("Machine is READY, make your choice!");

	}
	
	/*
	 * Perform action based on the pushed product button
	 */
	public void actionPerformed(ActionEvent eventSource)
	{
		
		for(int i = 0; i < m_ProductList.size(); i++)
		{
			if(eventSource.getSource() == m_InterFaceButtonList.get(i))
			{
				m_Checkout.setInput(m_CoinCollector.getAmount());
				m_MessageDisplay.setText(m_Checkout.makeChoice(m_InterFaceButtonList.get(i).getText()));
				m_CoinCollector.resetCollector();

			}
		}
		

	}
	

	


	
}




