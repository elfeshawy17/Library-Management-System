# Library Management System

## Overview
This is a Library Management System implemented in Java, following SOLID principles. The system provides functionalities for managing library items and customers, allowing CRUD operations for both, as well as borrowing and returning items.

## Features
- **Library Items Management**: Add, update, delete, and retrieve library items.
- **Customers Management**: Add, update, delete, and retrieve customers.
- **Borrow and Return Items**: Customers can borrow and return library items with proper tracking.
- **SOLID Principles**: The code follows SOLID principles for better maintainability and scalability.

## Technologies Used
- **Java**: Core programming language.
- **OOP (Object-Oriented Programming)**: Used for structuring the system.
- **SOLID Principles**: Ensuring a clean and maintainable codebase.

## Installation and Setup
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/library-management-system.git
   ```
2. Navigate to the project directory:
   ```sh
   cd library-management-system
   ```
3. Compile the Java files:
   ```sh
   javac -d bin src/**/*.java
   ```
4. Run the application:
   ```sh
   java -cp bin Main
   ```

## Project Structure
```
Library Management System
│── src
│   ├── models
│   │   ├── LibraryItem.java
│   │   ├── Book.java
│   │   ├── Customer.java
│   ├── services
│   │   ├── LibraryService.java
│   │   ├── CustomerService.java
│   ├── Main.java
│── README.md
```

## How It Works
1. **Adding Items and Customers**: Users can add books and customers to the system.
2. **Borrowing Items**: A customer can borrow available library items.
3. **Returning Items**: Items can be returned and marked as available again.
4. **Viewing Records**: Users can view the list of items and customers.

## Future Enhancements
- Implement a database to store library data persistently.
- Add a GUI for better user interaction.
- Implement fine calculation for overdue returns.

## Contributing
Feel free to fork this repository and make improvements. Pull requests are welcome!
