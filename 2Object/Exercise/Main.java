public class Main{
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.printSum();
        int fNumber = sum.firstNumber;
        int sNumber = sum.secondNumber;
        System.out.println("First number is "+fNumber);
        System.out.println("Second number is "+sNumber);
    }
}