import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task2();
    }
    public static void task2() {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter number ");

        int number = scn.nextInt();

        String temp = Integer.toString(number);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            newGuess[i] = temp.charAt(i) - '0';
        }

        System.out.print(number + "->");
        for (int i = 0; i < newGuess.length; i++) {
            System.out.print(newGuess[i] + 1);
        }

    }
}
