package by.bsuir.kosten.lab1.objects.books;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition = 0;

    @Override
    public int hashCode() {
        return title.hashCode()+author.hashCode()+price+edition;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author) && price == book.price;
    }

    @Override
    public String toString() {
        return "Title: "+title+
                "\nAuthor: "+author+
                "\nPrice: "+price+
                "\nEdition: "+edition;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Book(title,author,price);
    }
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public static int getEdition() {
        return edition;
    }

    public Book() {
    }
}
