import java.util.Scanner;
import java.util.Random;


public class Program {

    public class Program {

    public static void main(String[] args) {

        System.out.println(ageAndTemperature( 20, 17));
        System.out.println(ageAndTemperature(35, 10));
        System.out.println(ageAndTemperature(9, 32));
        System.out.println(ageAndTemperature( 19, 11));
        System.out.println(ageAndTemperature( 50, 28));

    }



    public static String ageAndTemperature( int age, int temperature) {
        if (age > 20 && age <= 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять ";

        } else if (age < 20 && temperature >= 0 && temperature < 28) {
            return "Можно идти гулять";

        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        }
        return "Оставйтесь дома!";
    }





