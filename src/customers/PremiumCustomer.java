package customers;

import libraryItems.LibraryItem;

public class PremiumCustomer extends Customer implements BorrowingPrivilege, BrowsePrivilege, BuyPrivilege{

    public PremiumCustomer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName, phoneNumber);
        type = "premium";
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

    @Override
    public void browseLibItem(LibraryItem item) {
        item.displayDetails();
    }

    @Override
    public void buyLibItem(LibraryItem item) {

    }
}
