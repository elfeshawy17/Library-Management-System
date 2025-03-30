import customers.Customer;
import customers.GuestCustomer;
import customers.MemberCustomer;
import customers.PremiumCustomer;
import data.CustomersDataStorage;
import utils.Printer;

import java.util.Scanner;

public class CustomersManagementApp {

    CustomersDataStorage dataStorage;

    public CustomersManagementApp() {
        dataStorage = new CustomersDataStorage();
    }

    public void run() {

        while (true) {

            int choice = operationChoice();

            switch (choice) {
                case 1 : {
                    int customerNum = getCustomerType();
                    addCustomer(customerNum);
                    break;
                }
                case 2 : {
                    int customerNum = getCustomerType();
                    deleteItem(customerNum);
                    break;
                }
                case 3 : {
                    Printer.printAllCustomers(dataStorage.getAllCustomers());
                    break;
                }
                case 4 : {
                    getCustomerByPhone();
                    break;
                }
                case 5 : {
                    int customerNum = getCustomerType();
                    updateCustomer(customerNum);
                    break;
                }
                case 6 : break;
                default : Printer.printMsg("Invalid choice");
            }
            if (choice == 6) break;
        }

    }

    private void updateCustomer(int customerNum) {
        Printer.printMsg("Please enter phone number of required customer");
        input.nextLine();
        String phoneNum = input.nextLine();
        Customer newCustomer = customerType(customerNum);
        dataStorage.updateCustomer(phoneNum, newCustomer);
    }

    private void getCustomerByPhone() {
        Printer.printMsg("Please enter customer phone number");
        input.nextLine();
        String phoneNum = input.nextLine();
        Printer.printCustomer(dataStorage.getCustomerByPhone(phoneNum));
    }

    private void deleteItem(int customerNum) {
        Customer customer = customerType(customerNum);
        dataStorage.delete(customer);
    }

    private void addCustomer(int customerNum) {
        Customer customer = customerType(customerNum);
        dataStorage.add(customer);
    }

    private Customer customerType(int customerNum) {
        return switch (customerNum) {
            case 1 -> guestCustomer();
            case 2 -> memberCustomer();
            case 3 -> premiumCustomer();
            default -> null;
        };
    }

    private Customer premiumCustomer() {
        Printer.printMsg("Please enter first name");
        input.nextLine();
        String fName = input.nextLine();
        Printer.printMsg("Please enter last name");
        String lName = input.nextLine();
        Printer.printMsg("Please enter phone number");
        String phoneNum = input.nextLine();
        return new PremiumCustomer(fName, lName, phoneNum);
    }

    private Customer memberCustomer() {
        Printer.printMsg("Please enter first name");
        input.nextLine();
        String fName = input.nextLine();
        Printer.printMsg("Please enter last name");
        String lName = input.nextLine();
        Printer.printMsg("Please enter phone number");
        String phoneNum = input.nextLine();
        return new MemberCustomer(fName, lName, phoneNum);
    }

    private Customer guestCustomer() {
        Printer.printMsg("Please enter first name");
        input.nextLine();
        String fName = input.nextLine();
        Printer.printMsg("Please enter last name");
        String lName = input.nextLine();
        Printer.printMsg("Please enter phone number");
        String phoneNum = input.nextLine();
        return new GuestCustomer(fName, lName, phoneNum);
    }

    private int getCustomerType() {
        Printer.printMsg(
                "Please choose customer type : \n" +
                        "1- Guest customer \n" +
                        "2- Member customer \n" +
                        "3- Premium customer"
        );
        return input.nextInt();
    }

    private int operationChoice() {
        Printer.printMsg(
                "Please choose one operation : \n" +
                        "1- Add customer \n" +
                        "2- Delete customer \n" +
                        "3- Get all customers \n" +
                        "4- Get customer by phone number \n" +
                        "5- Update customer \n" +
                        "6- Exit"
        );
        return input.nextInt();
    }

    private Scanner input = new Scanner(System.in);

}
