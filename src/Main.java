import utils.Printer;

import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        chooseApp();

    }

    private static void chooseApp() {
        Printer.printMsg("Please choose the operation : \n" +
                "1- Manage library items \n" +
                "2- Manage customers");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch (choice) {
            case 1 : {
                LibManagementSystemApp libApp = new LibManagementSystemApp();
                libApp.run();
            }
            case 2 : {
                CustomersManagementApp customersApp = new CustomersManagementApp();
                customersApp.run();
            }
        }
    }
}
