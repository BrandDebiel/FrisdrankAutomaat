
public class Product {
	
	private String m_Name;
	private double m_Price;
	private int m_StockAmount;

		public Product(String name, double price)
		{
			setName(name);
			setPrice(price);
		}
		
		public void setName(String name)
		{
			m_Name = name;
		}
		
		public String getName()
		{		
			return m_Name;
		}
		
		public void setPrice(double price)
		{
			m_Price = price;
		}
		
		public double getPrice()
		{
			return m_Price;
		}
		
		public void addStock(int amount)
		{
			m_StockAmount += amount;
		}
		
		public int getStockAmount()
		{
			return m_StockAmount;
		}
		
}

