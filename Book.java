/****************************************SC**********************************
 *****************
 * Name: Suresh Chitkara *
 * Course: Software Development I CEN-3024C-24667 *
 * Date: 3/9/2024 *
 * Description: The Book Class creates objects which are title, author, and barcode.
 *****************************************SC**********************************
 ******************/

public class Book { /* SC The book class represents a book in the library. */
    private String title; /* SC The title of the book */
    private String author; /* SC The author of the book */
    private int barcode; /* SC The barcode number of the book */
    private boolean checkedOut; /* SC The status of the book (checked out or not) */
    private String dueDate; /* SC The due date of the book if checked out. */
    public Book(String title, String author, int barcode) { /* SC Constructs a new Book object with the given title,
     author, and barcode. By default, the book is not checked out and has no due date. */
        this.title = title; /* SC Initialize the title of the book */
        this.author = author; /* SC Initialize the author of the book */
        this.barcode = barcode; /* SC Initialize the barcode number of the book */
        this.checkedOut = false; /* SC Set the initial checkout status to false */
        this.dueDate = null; /* SC Set the initial due date to null */
    }


    public String getTitle() { /* SC Retrieves the title of the book. */
        return title; /* SC Return the title of the book */
    }

    public String getAuthor() { /* SC Retrieves the author of the book. */
        return author; /* SC Return the author of the book */
    }

    public int getBarcode() { /* SC Retrieves the barcode number of the book. */
        return barcode; /* SC Return the barcode number of the book */
    }

    public boolean isCheckedOut() { /* SC Checks if the book is checked out. */
        return checkedOut; /* SC Return whether the book is checked out */
    }

    public void setCheckedOut(boolean checkedOut) { /* SC Sets the checked out status of the book. */
        this.checkedOut = checkedOut; /* SC Update the checked out status of the book. */
    }

    public String getDueDate() { /* SC Retrieves the due date of the book. */
        return dueDate; /* SC Return the due date of the book */
    }

    public void setDueDate(String dueDate) { /* SC Sets the due date of the book. */

            this.dueDate = dueDate; /* SC Set the due date of the book */
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", barcode=" + barcode +
                ", checkedOut=" + checkedOut +
                ", dueDate='" + dueDate + '\'' +
                '}'; /* SC A string containing the title, author, barcode, checked-out status, and due date of the book. */
    }
}
