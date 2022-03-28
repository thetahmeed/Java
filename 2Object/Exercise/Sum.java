import java.util.Scanner;
public class Sum {
    int firstNumber, secondNumber, sum;
    Scanner scanner = new Scanner(System.in);
    public void printSum(){
        System.out.print("Pelase enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Pelase enter second number: ");
        secondNumber = scanner.nextInt();
        sum = firstNumber+secondNumber;
        System.out.println("Sum: "+sum);
    }
}