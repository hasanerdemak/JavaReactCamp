package inheritance;
//base / super  Class
public class Customer {
	private int id;
	private String customerNumber; // Üzerinde toplama çıkarma yapılmayan veriler metinsel kabul edilir
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	
}