/****************************************SC**********************************
 *****************
 * Name: Suresh Chitkara *
 * Course: Software Development I CEN-3024C-24667 *
 * Date: 3/9/2024 *
 * Description: The Main class provides a set of basic operations that
 * lets user type in barcode of book, and title of book. This removes book from file.
 *****************************************SC**********************************
 ******************/
import java.util.Scanner;

public class Main { /* SC Main class for the Library Management System application. */
    public static void main(String[] args) { /* SC This class contains the main method to start the application. */
        LibraryManagementSystem library = new LibraryManagementSystem(); /* SC Create an instance of the LibraryManagementSystem to manage the library. */
        Scanner scanner = new Scanner(System.in); /* SC Create a Scanner object to read user input from the console. */

        boolean exit = false; /* SC Initialize a boolean variable to control the main program loop. */


        while (!exit) { /* SC Start a loop that continues until the exit condition becomes true. */
            System.out.println("Library Management System Menu:"); /* SC Display the Library Management System menu options to the user. */
            System.out.println("1. Add a book"); /* SC Press 1 to add book. */
            System.out.println("2. Remove a book by barcode"); /* SC Press 2 to remove book by barcode. */
            System.out.println("3. Remove a book by title"); /* SC Press 3 to remove book by title. */
            System.out.println("4. Check out a book by title"); /* SC Press 4 to check out book by title. */
            System.out.println("5. Check in a book by title"); /* SC Press 5 to check in book by title. */
            System.out.println("6. Exit"); /* SC Press 6 to exit. */
            System.out.print("Enter your choice: "); /* SC Message displays to let user enter choice. */
            int choice = scanner.nextInt(); /* SC This line declares an integer variable named choice and assigns it the
             integer value entered by the user through the console. */
            scanner.nextLine(); /* SC This step is necessary to ensure that the newline character after the integer
            input is consumed and the input stream is ready for the next input operation. */

            switch (choice) { /* SC This switch statement helps organize the different actions that can be taken based
            on the user's input choice. */
                case 1:
                    addBook(scanner, library);
                    break;
                case 2:
                    removeBookByBarcode(scanner, library);
                    break;
                case 3:
                    removeBookByTitle(scanner, library);
                    break;
                case 4:
                    checkoutBook(scanner, library);
                    break;
                case 5:
                    checkinBook(scanner, library);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again."); /* SC If user enters a number thats not in case,
                    the error message displays. */
            }
        }

        scanner.close(); /* SC Closing the scanner object using the close() method is a good practice to release the
        resources associated with it and prevent any potential resource leaks. */
    }

    private static void addBook(Scanner scanner, LibraryManagementSystem library) { /* SC The addBook() method allows
     users to add a new book to the library by providing information such as the title, author, and barcode of the book. */
        System.out.print("Enter the title of the book: "); /* SC User enters title of book. */
        String title = scanner.nextLine();
        System.out.print("Enter the author of the book: "); /* SC User enters author of book. */
        String author = scanner.nextLine();
        System.out.print("Enter the barcode of the book: "); /* SC User enters barcode of book. */
        int barcode = scanner.nextInt();
        scanner.nextLine();

        Book book = new Book(title, author, barcode); /* SC Create new instance of book. */
        library.addBook(book); /* SC Add book to library. */
        System.out.println("Book added successfully."); /* SC Message displays indicating book is added. */
    }

    private static void removeBookByBarcode(Scanner scanner, LibraryManagementSystem library) { /* SC this method
     provides a user-friendly way to interact with the application and remove books based on their barcode identifiers. */
        System.out.print("Enter the barcode of the book to remove: ");
        int barcode = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        library.removeBookByBarcode(barcode);
    }

    private static void removeBookByTitle(Scanner scanner, LibraryManagementSystem library) { /* SC this method
    facilitates the removal of a book from the library database based on the title entered by the user, enhancing the
    user experience and providing a convenient way to manage the library's collection. */
        System.out.print("Enter the title of the book to remove: ");
        String title = scanner.nextLine();
        library.removeBookByTitle(title);
    }

    private static void checkoutBook(Scanner scanner, LibraryManagementSystem library) { /* SC This method, checkoutBook,
     allows the user to check out a book from the library by providing the title of the book they wish to check out.*/
        System.out.print("Enter the title of the book to check out: ");
        String title = scanner.nextLine();
        library.checkOutBook(title);
    }

    private static void checkinBook(Scanner scanner, LibraryManagementSystem library) { /* SC This method, checkinBook,
    allows the user to check in a book into the library by providing the title of the book they wish to check in. */
        System.out.print("Enter the title of the book to check in: ");
        String title = scanner.nextLine();
        library.checkInBook(title);
    }
}
