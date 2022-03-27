import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Variables
        String name = "Tahmeedul Islam";
        int age = 90;
        int year;

        // Printiong something
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        // Talking user input
        Scanner s = new Scanner(System.in);
        System.out.print("Enter year: ");
        year = s.nextInt();

        // Calling variables
        printYear(year);
    }

    // User definged method
    static void printYear(int y){
        System.out.println("Year: " + y);
    }

}