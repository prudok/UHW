package Task1_2_3;


public class Main {
    public static void main(String[] args) {
        HashTab<String, Integer> hashTab = new HashTab<String, Integer>();
        hashTab.hashtabInit();

        hashTab.hashtabAdd("Russia", 1);
        hashTab.hashtabAdd("India", 2);
        hashTab.hashtabAdd("China", 3);
        hashTab.hashtabAdd("England", 5);
        hashTab.hashtabAdd("Alabama", 6);
        hashTab.hashtabAdd("Alaska", 7);
        hashTab.hashtabAdd("Arizona", 8);
        hashTab.hashtabAdd("Arkansas", 9);
        hashTab.hashtabAdd("California", 10);

        hashTab.hashtabHash();

        hashTab.hashtabAdd("USA", 4);
        hashTab.hashtabDelete("India");

        hashTab.hashtabHash();

        System.out.println("Key of China: " + hashTab.hashtabLookup("China"));
    }
}