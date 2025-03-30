package customers;

import libraryItems.LibraryItem;

public class MemberCustomer extends Customer implements BorrowingPrivilege, BrowsePrivilege {

    public MemberCustomer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
        type = "member";
    }

    @Override
    public void browseLibItem(LibraryItem item) {
        item.displayDetails();
    }

    @Override
    public String borrowItem(LibraryItem item) {
        item.borrowItem();
        return "Borrowed Successfully";
    }

    @Override
    public String returnItem(LibraryItem item) {
        item.returnItem();
        return "Returned Successfully";
    }
}
