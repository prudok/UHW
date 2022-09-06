public class Factorial {
    private int number;
    public Factorial(int number) {
        this.number = number;
    }
    public int calculateFactorial() {
        if(number == 0) return 0;
        int sum = 1;
        for(int ind = 1; ind <= number; ++ind) {
            sum *= ind;
        }
        return sum;
    }
}
