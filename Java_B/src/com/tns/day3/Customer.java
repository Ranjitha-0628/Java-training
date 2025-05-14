package com.tns.day3;

public class Customer {

	private String customerName;
	private int CustomerId;
	private String customerCity;
	//default constructor
//	public Customer()
//	{
//		System.out.println("I am the default constructor");
		

	//}

	public Customer(String customerName, int customerId, String customerCity) {
		
		this.customerName = customerName;
		this.CustomerId = customerId;
		this.customerCity = customerCity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", CustomerId=" + CustomerId + ", customerCity="
				+ customerCity + ", getCustomerName()=" + getCustomerName() + ", getCustomerId()=" + getCustomerId()
				+ ", getCustomerCity()=" + getCustomerCity() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
