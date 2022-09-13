package ru.mirea.kvbo1.prudchenko.r;

public class Main{
    public static void main(String[]args) {

        // Task 1
        double[] randData = new double[5];
        for(int ind = 0; ind < 5; ++ind) {
            randData[ind] = Math.random() * 100;
        }
        for(int ind = 0; ind < randData.length; ++ind) System.out.println(randData[ind]);

        // Task 2
        Tester test = new Tester(4);
        System.out.println(test);
    }
}
