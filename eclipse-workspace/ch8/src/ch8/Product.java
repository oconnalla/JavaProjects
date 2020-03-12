package ch8;
import java.text.NumberFormat;

public class Product {
	
	// VARIABLES
	protected int productCode;
	protected String description;
	protected double price;
	protected int productCount;
	
	// CONSTRUCTORS
	public Product(Product other) {
		this(other.getProductCode(), other.getDescription(), other.getPrice(), other.getProductCount());
	}
	
	public Product(int productCode, String description, double price, int productCount) {
		if (productCount == 0) {
			throw new NullPointerException();
		}
		this.productCode = productCode;
		this.description = description;
		this.price = price;
		this.productCount = productCount;
	}
	
	
	//GETTERS
	 public int getProductCode() {
		return productCode;
	}

	 
	public String getDescription() {
			return description;
		}

	
	public double getPrice() {
		return price;
	}

	public int getProductCount() {
		return productCount;
	}

	
	//SETTERS
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}


	
	//FORMATTERS
	@Override
	public String toString() {
		return ("ProductCode:  \t\t " + getProductCodeFormatted() + 
	"\nProduct Description: \t " + getDescription() + "\nPrice:  \t\t " + 
				getPriceFormatted()+ "\nNumber Available:\t " + getProductCountFormatted() + "\n");
	}	
	
	public String getPriceFormatted() {
	        String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
	        return formattedPrice;
	    }	
	public String getProductCodeFormatted() {
        String formattedCode = Integer.toString(this.productCode);
        return formattedCode;
    }
	
	public String getProductCountFormatted() {
        String formattedCount = Integer.toString(this.productCount);
        return formattedCount;
    }
	
		
	
}


