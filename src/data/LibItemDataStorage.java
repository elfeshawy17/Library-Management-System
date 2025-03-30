package data;

import customers.Customer;
import customers.GuestCustomer;
import customers.MemberCustomer;
import customers.PremiumCustomer;
import libraryItems.LibraryItem;

import java.util.ArrayList;

public class LibItemDataStorage {

    private ArrayList <LibraryItem> libraryItems;

    public LibItemDataStorage () {
        libraryItems = new ArrayList<>();
    }

    public void add (LibraryItem libraryItem) {
        libraryItems.add(libraryItem);
    }

    public void delete (LibraryItem libraryItem) {
        libraryItems.remove(libraryItem);
    }

    public ArrayList<LibraryItem> getAllItems () {
        return libraryItems;
    }

    public LibraryItem getItemByTitle (String title) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equals(title)){
                return item;
            }
        }
        return null;
    }

    public String updateItem (String title, LibraryItem newLibraryItem) {
        LibraryItem item = getItemByTitle(title);
        if (item != null){
            int index = libraryItems.indexOf(item);
            libraryItems.set(index, newLibraryItem);
            return "Item changed successfully.";
        }
            return "This item is not found.";
    }

}
