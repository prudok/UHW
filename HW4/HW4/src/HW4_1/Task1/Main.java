package HW4_1.Task1;

public class Main {
    public static void main(String[] args) {
        //1
        String timeOfYear = String.valueOf(Season.SPRING);
        System.out.println(timeOfYear);
        //2
        myFavoriteSeason(Season.SPRING);
        //3-6
        Season.getDescription();
        Season.getDescription(Season.SUMMER);
        for(Season season : Season.values()) {
            System.out.println(season);
        }
    }

    public static void myFavoriteSeason(Season season) {
        switch (season){
            case WINTER -> System.out.println("I don't love winter.");
            case AUTUMN -> System.out.println("I don't love autumn.");
            case SPRING -> System.out.println("I love spring!");
            case SUMMER -> System.out.println("I don't love summer.");
            default -> System.out.println("Error, try again.");
        }
    }
}