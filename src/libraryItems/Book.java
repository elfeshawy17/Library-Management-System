package libraryItems;

import utils.Printer;

public class Book extends LibraryItem {

    private String author;
    private String ISBN;
    private int numberOfPages;

    public Book(String title, String author, String ISBN, int numberOfPages, int itemCount) {
        super(title, itemCount);
        this.author = author;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayDetails() {
        Printer.printMsg("Title : " + title);
        Printer.printMsg("Available : " + isAvailable);
        Printer.printMsg("author : " + author);
        Printer.printMsg("ISBN : " + ISBN);
        Printer.printMsg("numberOfPages : " + numberOfPages);
        Printer.printMsg("Item copies : " + itemCount);
        System.out.println("_____________________________");
    }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public String getISBN() { return ISBN; }

    public void setISBN(String ISBN) { this.ISBN = ISBN; }

    public int getNumberOfPages() { return numberOfPages; }

    public void setNumberOfPages(int numberOfPages) { this.numberOfPages = numberOfPages; }

}
