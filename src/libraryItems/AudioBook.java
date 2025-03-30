package libraryItems;

import utils.Printer;

public class AudioBook extends LibraryItem{

    private int duration;

    public AudioBook(String title, int duration, int itemCount) {
        super(title, itemCount);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        Printer.printMsg("Title : " + title);
        Printer.printMsg("Available : " + isAvailable);
        Printer.printMsg("duration : " + duration);
        Printer.printMsg("Item copies : " + itemCount);
        System.out.println("_____________________________");
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
