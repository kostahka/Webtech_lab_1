package by.bsuir.kosten.lab1.objects.books.comparators;

import by.bsuir.kosten.lab1.objects.books.Book;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
