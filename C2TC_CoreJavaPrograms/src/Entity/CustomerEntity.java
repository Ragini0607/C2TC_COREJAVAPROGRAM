package Entity;

public class CustomerEntity
{
  private int customerId;
  private String customerName;
  private String customerCity;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerCity() {
	return customerCity;
}
public void setCustomerCity(String customerCity) {
	this.customerCity = customerCity;
}
@Override
public String toString() {
	return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
			+ customerCity + "]";
}
}
