package libraryItems;

import utils.Printer;

public class Magazine extends LibraryItem {

    private String publisher;

    public Magazine(String title, String publisher, int itemCount) {
        super(title, itemCount);
        this.publisher = publisher;
    }

    @Override
    public void displayDetails() {
        Printer.printMsg("Title : " + title);
        Printer.printMsg("Available : " + isAvailable);
        Printer.printMsg("Publisher : " + publisher);
        Printer.printMsg("Item copies : " + itemCount);
        System.out.println("_____________________________");
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
