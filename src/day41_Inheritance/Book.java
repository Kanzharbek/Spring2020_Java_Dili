package day41_Inheritance;

public class Book {
    /*
    title
    author
    price
     */
    public String title;
    public String author;
    public double price;

    public String toString() {
        return "Title" + title + ", Author: " + author + ", $" + price;
    }

}

class eBook extends Book {
    /*
    title - inherited
    author - inherited
    price - inherited

    size
    pages
    readBook()
     */
    public String size;
    public int pages;

    public void readBook() {
        System.out.println("Reading: " + title);
    }

}

class audioBook extends Book {
    /*
    title - inherited
    author - inherited
    price - inherited

    length - declared
    listen() - declared

    toString() - inherited
     */

    public String length;

    public void listen() {
        System.out.println("Listening to " + title);
    }
}


