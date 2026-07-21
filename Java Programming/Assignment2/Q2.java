// JAVA Programming Assignment - 2
// (Submitted by Chaitanya Jindal)

// Q2. Create a class named Book with the following attributes:
// · title (String): to store the title of the book.
// · author (String): to store the author of the book.
// · isbn (String): to store the ISBN number of the book.
// Implement a constructor to initialize these attributes.
// · The main method, create an array named library that can hold up to 5 Book objects.
// · Initialize the library array with different Book objects. You can choose any books you like or create fictional ones.
// · Write a method named displayLibrary that takes the library array as a
// parameter and displays the details of each book in the array.
// · Write a method named searchBook that takes the library array and a book title as parameters. This method should search for the book with the given title in the library array and display its details if found. If the book is not found, it should print a message indicating that the book is not in the library.

package Assignment2;

public class Q2 {
    static void displayLibrary(Book[] library) {
        System.out.println("----- Library Details -----");
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null) {
                System.out.println("Title: " + library[i].title);
                System.out.println("Author: " + library[i].author);
                System.out.println("ISBN: " + library[i].isbn);
                System.out.println("-----------------------------");
            }
        }
    }

    static void searchBook(Book[] library, String title) {
        boolean found = false;
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null && library[i].title.equalsIgnoreCase(title)) {
                System.out.println("Book Found:");
                System.out.println("Title: " + library[i].title);
                System.out.println("Author: " + library[i].author);
                System.out.println("ISBN: " + library[i].isbn);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book \"" + title + "\" is not in the library");
        }
    }

    public static void main(String[] args) {
        Book[] library = new Book[5];
        library[0] = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
        library[1] = new Book("1984", "George Orwell", "ISBN002");
        library[2] = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN003");
        library[3] = new Book("The Hobbit", "J.R.R. Tolkien", "ISBN004");
        library[4] = new Book("Atomic Habits", "James Clear", "ISBN005");

        displayLibrary(library);

        System.out.println();
        searchBook(library, "1984");

        System.out.println();
        searchBook(library, "Harry Potter");
    }
}