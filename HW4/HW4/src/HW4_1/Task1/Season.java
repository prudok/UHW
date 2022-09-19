package HW4_1.Task1;

public enum Season {
    SUMMER (29.4, "Summer", "It's hot time of the year"),
    WINTER (-14.5, "Winter", "It's cold time of the year"),
    AUTUMN (-3.5, "Autumn", "It's nice time of the year"),
    SPRING (6.5, "Spring", "It's great time of the year");

    private double temperature;
    private String nameOfYear;
    private String description;

    Season(double temperature, String nameOfYear, String description) {
        this.temperature = temperature;
        this.nameOfYear = nameOfYear;
        this.description = description;
    }

    public static void getDescription() {
        System.out.println("It's cold time of year");
    }
    public static void getDescription(Season SUMMER) {
        System.out.println("It's hot time of year");
    }

    @Override
    public String toString() {
        return "Temperature: " + temperature + ", season: " + nameOfYear + ", description: " + description;
    }
}
