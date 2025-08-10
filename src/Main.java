import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = sc.nextLine();
        System.out.println("Введите возраст: ");
        int age = sc.nextInt();
        System.out.println(name + " is " + age + " years old.");
        // капец
    }

}