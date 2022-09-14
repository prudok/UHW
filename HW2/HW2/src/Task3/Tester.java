package Task3;

import Task3.Circle;

public class Tester {

    private int amountCircles;
    private Circle[] circleArray;

    public Tester(int amountCircles,  Circle[] circleArray) {
        this.amountCircles = amountCircles;
        this.circleArray = circleArray;
    }

    public int getAmountCircles() {
        return amountCircles;
    }

    @Override
    public String toString() {
        String output = "All circles: ";
        for(int ind = 0; ind < amountCircles; ++ind) {
            output += circleArray[ind].toString() + " ";
        }
        return output;
    }
}
