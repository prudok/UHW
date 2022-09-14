package CurrencyConverter;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
        public static void main(String[] args) {
            double number = 123.4567;

            Locale locFR = new Locale("en");
            Locale.setDefault(Locale.US);
            NumberFormat numberFormat3 =
                    NumberFormat.getCurrencyInstance();
            System.out.println("Денежная единица в текущей локали: " + numberFormat3.format(number));
            NumberFormat numberFormat4 =
                    NumberFormat.getCurrencyInstance(Locale.FRANCE);
            System.out.println("Денежная единица во французской локали: " + numberFormat4.format(number));
        }
}