package Task1;

import Task1.Author;

public class TestAuthor extends Author {
    private int money;

    TestAuthor(String name, String email, char gender, int money) {
        super(name, email, gender);
        this.money = money;
    }

    @Override
    public String toString() {
        return super.toString() + "Currently I have " + money + "$.";
    }

}
