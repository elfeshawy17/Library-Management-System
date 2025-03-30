package libraryItems;

import utils.Printer;

public class DVD extends LibraryItem{

    private String director;
    private int duration;

    public DVD(String title, String director, int duration, int itemCount) {
        super(title, itemCount);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        Printer.printMsg("Title : " + title);
        Printer.printMsg("Available : " + isAvailable);
        Printer.printMsg("director : " + director);
        Printer.printMsg("duration : " + duration);
        Printer.printMsg("Item copies : " + itemCount);
        System.out.println("_____________________________");
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
