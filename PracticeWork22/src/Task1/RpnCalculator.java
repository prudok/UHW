package Task1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RpnCalculator {

    private double arr[];
    private int top;
    private int capacity;
    private double answer = 0;

    RpnCalculator(int size) {
        arr = new double[size];
        capacity = size;
        top = -1;
    }
    public void inputExpression(String expression) {
        String[] valuesToCalculate = expression.split(" ");
        for(String ind : valuesToCalculate) {
            if(ind.equals("+") || ind.equals("-") || ind.equals("*") ||ind.equals("/")) {
                switch (ind) {
                    case "+": {
                        double sum = 0;
                        sum = pop() + pop();
                        push(sum);
                    } break;
                    case "-": {
                        double difference = 0;
                        double fisrtValue = pop();
                        double secondValue = pop();
                        difference = secondValue - fisrtValue;
                        push(difference);
                    } break;
                    case "/": {
                        double division = 0;
                        double fisrtValue = pop();
                        double secondValue = pop();
                        division = secondValue / fisrtValue;
                        push(division);
                    } break;
                    case "*": {
                        double multiplication = 0;
                        multiplication = pop() * pop();
                        push(multiplication);
                    } break;
                    default: {
                        System.out.println("Error. Try again.");
                    }
                }
            } else {
                try {
                    double value = Integer.valueOf(ind);
                    push(value);
                } catch (Exception err) {
                    System.out.println("Error: " + err.getMessage());
                }
            }
        }
    }

    public void push(double x) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
            System.exit(1);
        }
        arr[++top] = x;
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            System.exit(1);
        }
        return arr[top--];
    }

    public int getSize() {
        return top + 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printAnswer() {
        System.out.println("The answer is: " + pop());
    }
}
