import java.util.TreeSet;

/**
 * Created by Alex on 14.09.2017.
 */
public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("How made a cat");
        Book b2 = new Book("Build a new body");
        Book b3 = new Book("In searching of Emo");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);

        System.out.println(tree);


        BookCompare bCompare = new BookCompare();
        TreeSet<Book> treeSet = new TreeSet<>(bCompare);
        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b3);

        System.out.println(treeSet);
    }
}
