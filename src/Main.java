import java.util.Scanner;

public class Main {
    public static void main(String[] args) {   //256 = 2 + 5 + 6 = 13

        int number, right, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        number = scanner.nextInt();


        while(number > 0){   // number 126 > 0 // number 12 > 0  סיבוב שני
            right = number % 10;   //126 % 10 = 6
            sum = sum + right;     // sum = 0,  0 + 6 = 6
            number = number/10;    //126/10 = 12
        }                          // חזרה ל while
        System.out.print("Sum of Digits " + sum);
    }
}