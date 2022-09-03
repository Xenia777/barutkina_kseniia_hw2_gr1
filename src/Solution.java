import java.util.Scanner;

public class Solution {

    public static void Data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = sc.nextInt();;
        System.out.println("Введите температуру на улице");
        int temp = sc.nextInt();;
        if(20 >= age && temp >= 0 ){
            System.out.println("Можно идти гулять");
        }

}}
