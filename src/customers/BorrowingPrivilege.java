package customers;

import libraryItems.LibraryItem;

public interface BorrowingPrivilege {

    String borrowItem(LibraryItem item);
    String returnItem(LibraryItem item);

}
