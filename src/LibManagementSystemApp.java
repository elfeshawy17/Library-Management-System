import data.LibItemDataStorage;
import libraryItems.*;
import utils.Printer;

import java.util.Scanner;

public class LibManagementSystemApp {

    LibItemDataStorage dataStorage;

    LibManagementSystemApp () {
        dataStorage = new LibItemDataStorage();
    }

    public void run() {

        while (true) {

            int choice = operationChoice();

            switch (choice) {
                case 1 : {
                    int itemNum = getItemNum();
                    addItem(itemNum);
                    break;
                }
                case 2 : {
                    int itemNum = getItemNum();
                    deleteItem(itemNum);
                    break;
                }
                case 3 : Printer.printLibItems(dataStorage.getAllItems()); break;
                case 4 : getItemByTitle(); break;
                case 5 : {
                    int itemNum = getItemNum();
                    updateItem(itemNum);
                    break;
                }
                case 6 : {
                    int itemNum = getItemNum();
                    borrowItem(itemNum);
                    break;
                }
                case 7 : {
                    int itemNum = getItemNum();
                    returnItem(itemNum);
                    break;
                }
                case 8 : break;
                default : Printer.printMsg("Invalid choice");
            }
            if (choice == 8) break;
        }

    }

    private void returnItem(int itemNum) {
        LibraryItem item = libItem(itemNum);
        item.returnItem();
    }

    private void borrowItem(int itemNum) {
        LibraryItem item = libItem(itemNum);
        item.borrowItem();
    }

    private void updateItem(int itemNum) {
        Printer.printMsg("Please enter title of required item");
        input.nextLine();
        String title = input.nextLine();
        LibraryItem newItem = libItem(itemNum);
        dataStorage.updateItem(title, newItem);
    }

    private void getItemByTitle() {
        Printer.printMsg("Please enter item title");
        input.nextLine();
        String title = input.nextLine();
        Printer.printItem(dataStorage.getItemByTitle(title));
    }

    private void deleteItem(int itemNum) {
        LibraryItem item = libItem(itemNum);
        dataStorage.delete(item);
    }

    private void addItem(int itemNum) {
        LibraryItem item = libItem(itemNum);
        dataStorage.add(item);
    }

    private Scanner input = new Scanner(System.in);

    private LibraryItem libItem(int itemNum) {
        return switch (itemNum) {
            case 1 -> book();
            case 2 -> audioBook();
            case 3 -> dvd();
            case 4 -> magazine();
            default -> null;
        };
    }

    private LibraryItem magazine() {
        Printer.printMsg("Please enter magazine title");
        input.nextLine();
        String title = input.nextLine();
        Printer.printMsg("Please enter magazine publisher");
        String publisher = input.nextLine();
        Printer.printMsg("Please enter itemCount");
        int itemCount = input.nextInt();
        return new Magazine(title, publisher, itemCount);
    }

    private LibraryItem dvd() {
        Printer.printMsg("Please enter dvd title");
        input.nextLine();
        String title = input.nextLine();
        Printer.printMsg("Please enter dvd director");
        String director = input.nextLine();
        Printer.printMsg("Please enter dvd duration");
        int duration = input.nextInt();
        Printer.printMsg("Please enter itemCount");
        int itemCount = input.nextInt();
        return new DVD(title, director, duration, itemCount);
    }

    private LibraryItem audioBook() {
        Printer.printMsg("Please enter audioBook title");
        input.nextLine();
        String title = input.nextLine();
        Printer.printMsg("Please enter audioBook duration");
        int duration = input.nextInt();
        Printer.printMsg("Please enter itemCount");
        int itemCount = input.nextInt();
        return new AudioBook(title, duration, itemCount);
    }

    private LibraryItem book() {
        Printer.printMsg("Please enter book title");
        input.nextLine();
        String title = input.nextLine();
        Printer.printMsg("Please enter book author");
        String author = input.nextLine();
        Printer.printMsg("Please enter book ISBN");
        String ISBN = input.nextLine();
        Printer.printMsg("Please enter numberOfPages");
        int numberOfPages = input.nextInt();
        Printer.printMsg("Please enter itemCount");
        int itemCount = input.nextInt();
        return new Book(title, author, ISBN, numberOfPages, itemCount);
    }

    private int getItemNum () {
        Printer.printMsg(
                "Please choose the item : \n" +
                        "1- Book \n" +
                        "2- AudioBook \n" +
                        "3- DVD \n" +
                        "4- Magazine"
        );
        return input.nextInt();
    }

    private int operationChoice () {
        Printer.printMsg(
                "Please choose one operation : \n" +
                        "1- Add item \n" +
                        "2- Delete item \n" +
                        "3- Get all items \n" +
                        "4- Get item by title \n" +
                        "5- Update item \n" +
                        "6- Borrow item \n" +
                        "7- Return item \n" +
                        "8- Exit"
        );
        return input.nextInt();
    }

}
