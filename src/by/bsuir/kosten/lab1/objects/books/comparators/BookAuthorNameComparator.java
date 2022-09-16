package by.bsuir.kosten.lab1.objects.books.comparators;

import by.bsuir.kosten.lab1.objects.books.Book;

import java.util.Comparator;

public class BookAuthorNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2){
        int result = o1.getAuthor().compareTo(o2.getAuthor());
        if(result != 0) return result;
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
