package by.bsuir.kosten.lab1.objects.books;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int isbn, String language, int level) {
        super(title, author, price, isbn);
        this.language = language;
        this.level = level;
    }

    public ProgrammerBook() {
    }

    @Override
    public int hashCode() {
        return super.hashCode()+language.hashCode()+level;
    }

    @Override
    public boolean equals(Object obj) {
        ProgrammerBook book = (ProgrammerBook) obj;
        return super.equals(obj) && language.equals(book.language) && level==book.level;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nLanguage: "+language+
                "\nLevel: "+level;
    }
}
