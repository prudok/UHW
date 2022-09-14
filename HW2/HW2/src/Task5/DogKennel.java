package Task5;

import Task5.Dog;

import java.util.Arrays;

public class DogKennel {

    private Dog[] dogs;

    public DogKennel(Dog[] dogs) {
        this.dogs = dogs;
    }

    public void addDog(Dog dog)
    {
        int index = dogs.length;
        dogs = Arrays.copyOf(dogs, dogs.length + 1);
        dogs[index] = dog;
    }

    @Override
    public String toString() {
        String outputAllDogs = "";
        for(Dog ind : dogs) outputAllDogs += ind.toString();
        return outputAllDogs;
    }
}
