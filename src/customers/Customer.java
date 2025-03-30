package customers;

import libraryItems.LibraryItem;
import utils.Printer;

public class Customer {

    protected String firstName;
    protected String lastName;
    protected String phoneNumber;
    protected String type;

    public Customer(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public void displayDetails() {
        Printer.printMsg("First name : " + firstName);
        Printer.printMsg("Last name : " + lastName);
        Printer.printMsg("Phone number : " + phoneNumber);
        Printer.printMsg("Type : " + type);
        System.out.println("_____________________________");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
