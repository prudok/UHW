package Task7;

import Task5.Dog;
import Task5.DogKennel;
import Task6.Circle2;

public class Main {
    public static void main(String[] args) {
        Book one = new Book("E.B. White", "Charlotte’s Web", 1980);
        Book two = new Book("Eleanor Coerr", "Mieko and the Fifth Treasure", 1790);
        Book[] shelf = {one, two};
        Bookshelf bookshelf = new Bookshelf(shelf);
        System.out.println(bookshelf.earlyWritingTime());
        System.out.println(bookshelf.lateWritingTime());
        System.out.println(bookshelf.toString());
    }
}