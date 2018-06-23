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


/*
 * Class: Checkout
 * 
 * Handles checkout, money flow and warehouse corrections based on user choices
 * 
 */

public class CheckoutHandler
{
    private double m_MoneyInput;

    WarehouseStockHandler m_WareHouse;
    
    public CheckoutHandler(WarehouseStockHandler wareHouse){

    	m_MoneyInput = 0.00;
    	m_WareHouse = wareHouse;
    } 
    
    public void setInput(double moneyInput)
    {
        
        m_MoneyInput = moneyInput;
    }
    
    public String makeChoice(String productName)
    {
        
        if(m_WareHouse.getStockAmount(productName) > 0)
        {
            
            if(checkPricing(productName) < m_MoneyInput)
            {
            	
            	m_WareHouse.changeStock(productName,-1);
                
                StringBuilder sb = new StringBuilder();
                sb.append(productName);
                sb.append(" is vended and can be taken from the tray");
                String message = sb.toString();

                return message;

            }
            if((checkPricing(productName) > m_MoneyInput) | (m_MoneyInput == 0))
            {
            
                StringBuilder sb = new StringBuilder();
                sb.append("Insufficient input for ");
                sb.append(productName);
                sb.append(", minimum amount is € "); 
                sb.append(checkPricing(productName));
                String message = sb.toString();
                
                return message;
            }
            
        }
        StringBuilder sb = new StringBuilder();
        sb.append(productName);
        sb.append(" is out of stock, sorry");
        String message = sb.toString();
        
        return message;
        
    }
    
    private double checkPricing(String productName)
    {
               
        Product product = m_WareHouse.getProduct(productName);
        
        return product.getPrice();

    }
    
    private double checkStock(String productName)
    {
               
        Product product = m_WareHouse.getProduct(productName);
        
        return product.getStockAmount();

    }
}