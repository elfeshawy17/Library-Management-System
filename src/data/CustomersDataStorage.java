package data;

import customers.Customer;
import customers.MemberCustomer;

import java.util.ArrayList;

public class CustomersDataStorage {

    private ArrayList <Customer> Customers;

    public CustomersDataStorage() {
        Customers = new ArrayList<>();
    }

    public void add (Customer customer) {
        Customers.add(customer);
    }

    public void delete (Customer customer) {
        Customers.remove(customer);
    }

    public ArrayList<Customer> getAllCustomers () {
        return Customers;
    }

    public Customer getCustomerByPhone (String phoneNumber) {
        for (Customer customer : Customers) {
            if (customer.getPhoneNumber().equals(phoneNumber)){
                return customer;
            }
        }
        return null;
    }

    public String updateCustomer (String phoneNumber, Customer newData) {
        Customer customer = getCustomerByPhone(phoneNumber);
        if (customer != null){
            int index = Customers.indexOf(customer);
            Customers.set(index, newData);
            return "Customer data changed successfully.";
        }
        return "This customer is not found.";
    }

}
