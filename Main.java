import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите деньги:");
        int money = sc.nextInt();
        System.out.println("Введите цену:");
        int price = sc.nextInt();
        System.out.println("Введите цену шоколадок за обертки:");
        int wrap = sc.nextInt();
        int total = money / price;
        int wraps = total;
        while (wraps >= wrap) {
            int newChocolates = wraps / wrap;
            total += newChocolates;
            wraps = wraps % wrap + newChocolates;
        }
        System.out.println(total);
    }
}