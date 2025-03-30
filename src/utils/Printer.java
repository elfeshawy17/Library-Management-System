package utils;

import customers.Customer;
import libraryItems.LibraryItem;

import java.util.ArrayList;

public class Printer {

    public static void printMsg(String msg) {
        System.out.println(msg);
    }

    public static void printMsg(int msg) {
            System.out.println(msg);
    }

    public static void printMsg(boolean msg) {
            System.out.println(msg);
    }

    public static void printItem(LibraryItem item){
        item.displayDetails();
    }

    public static void printLibItems (ArrayList <LibraryItem> libraryItems) {
        for (LibraryItem item : libraryItems){
            item.displayDetails();
        }
    }

    public static void printCustomer(Customer customer) {
        customer.displayDetails();
    }

    public static void printAllCustomers(ArrayList <Customer> customers) {
        for (Customer customer : customers){
            customer.displayDetails();
        }
    }

}
