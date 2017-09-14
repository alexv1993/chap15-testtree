import java.util.Comparator;
import java.util.jar.Pack200;

/**
 * Created by Alex on 14.09.2017.
 */
public class BookCompare implements Comparator<Book> {
    public int compare(Book one, Book two) {
        return (one.title.compareTo(two.title));
    }
}
