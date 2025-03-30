package customers;

import libraryItems.LibraryItem;

public class GuestCustomer extends Customer implements BrowsePrivilege {

    public GuestCustomer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
        type = "guest";
    }

    @Override
    public void browseLibItem(LibraryItem item) {
        item.displayDetails();
    }
}
