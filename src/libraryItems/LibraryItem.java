package libraryItems;

import utils.Printer;

public abstract class LibraryItem {

    protected String title;
    protected Boolean isAvailable;
    protected int itemCount;

    public LibraryItem(String title, int itemCount) {
        this.title = title;
        this.itemCount = itemCount;
        isAvailable = itemCount > 0;
    }

    public void returnItem() {
        itemCount++;
        Printer.printMsg("This item has been returned." + "And we have now " + this.itemCount + "copies");
    }

    public void borrowItem() {
        if (!isAvailable) {
            Printer.printMsg("We don't have any copies for this item : " + this.title);
        }
        else {
            itemCount--;
            Printer.printMsg("The item " + this.title + " has been borrowed." + "And we have now " + this.itemCount + "copies");
        }
    }

    public abstract void displayDetails();

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public Boolean isAvailable() { return itemCount > 0; }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    private void setAvailability(boolean available) {
        isAvailable = available;
    }

}
