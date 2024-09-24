import java.util.Scanner;

public class Book {
    private String title;
    private int pageCount;
    /* 
    The public Book method constructs a new book with the given title and page count
    * @param title The  title of the book.
    * @param pageCount The number of pages in the book.
    */
    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }
    /* 
     * Get the title of the book.
     * @return The title of the book.
    */
    public String getTitle() {
        return title;
    }
    /* 
     * Get the page count of the book.
     * @return the page countof the book
     */
    public Integer getPageCount() {
        return pageCount;
    }
    /* This the main method for Joshua's CS201 simple book management program.
     * The main method allows the user to input information for any amount of books.
     * Entered titles are displayed, and the total number of pages is calculated.
     */ 
    public static void main(String[] args) {
            // Entering the amount of books wanted.
            if (args.length != 1) {
                return;
            }
            int numberOfBooks = Integer.parseInt(args[0]);

            Book[] books = new Book[numberOfBooks];
            // The following for loop asks for an input for a title and page count.
            try (Scanner scanner = new Scanner(System.in)) {
                for (int i = 0; i < numberOfBooks; i++) {
                    System.out.println("Title? " + (i + 1) + ":");
                    String title = scanner.next();
    
                    System.out.println("Page count? " + (i + 1) + ":");
                    int pageCount = scanner.nextInt();
    
                    books[i] = new Book(title, pageCount);
                }
            }
            // The folowing for loop iterates over the array of Book objects
            // Print the list of book titles and total pages on the same line
            System.out.print("Here are your " + numberOfBooks + " books!\n");
            for (int i = 0; i < numberOfBooks; i++) {
                System.out.print(books[i].getTitle());
                if (i < numberOfBooks - 1) {
                    System.out.print(", ");
                }
            }
            
            // Calculate and print the total page count
            int totalPageCount = 0;
            for (Book book : books) {
                totalPageCount += book.getPageCount();
            }
            System.out.print("\nTotal pages: " + totalPageCount);
            System.out.println();

        }
    }
 
