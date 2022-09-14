package Task7;

import Task7.Book;

public class Bookshelf {

    private Book[] bookStore;

    public Bookshelf(Book[] bookStore) {
        this.bookStore = bookStore;
    }

    public int earlyWritingTime() {
        int earlyTime = bookStore[0].getYearOfWriting();
        for(Book ind : bookStore) {
            if(earlyTime > ind.getYearOfWriting()) earlyTime = ind.getYearOfWriting();
        }
        return earlyTime;
    }

    public int lateWritingTime() {
        int lateTime = bookStore[0].getYearOfWriting();
        for(Book ind : bookStore) if(lateTime < ind.getYearOfWriting())
            lateTime = ind.getYearOfWriting();
        return lateTime;
    }

    public void sortByYear() {
            //TODO
    }

    @Override
    public String toString() {
        String output = "";
        for(Book ind : bookStore) output += ind.toString() + "\n";
        return output;
    }


}
