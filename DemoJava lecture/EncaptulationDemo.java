package lj.diploma;

class ProductList{
	
	String productName = "Cloth";
	int productPrice = 1500;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
}

public class EncaptulationDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductList p = new ProductList();
		p.setProductName("Jeans");
		p.setProductPrice(2000);
		
		System.out.println(p.getProductPrice());
		System.out.println(p.getProductName());
	}

}
