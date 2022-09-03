import java.util.Scanner;
import java.util.Random;


public class Program {

    public static int generateRandomAge(){
        Random rnd = new Random();
        int number = 0 + rnd.nextInt(10 - 0 + 1);
        System.out.println(number);
        return number;
    }


    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Введите ваш возраст");
                int age = new Program().generateRandomAge();
                System.out.println("Введите температуру на улице");
                int temp = sc.nextInt();
                if(age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
                    System.out.println("Можно идти гулять");}
                else if(age < 20 && temp >= 0 && temp <= 28){
                    System.out.println("Можно идти гулять");}
                else if(age > 45 && temp >= -10 && temp <= 25){
                    System.out.println("Можно идти гулять");}
                else{
                    System.out.println("Отсавайтесь дома");}


            }}





