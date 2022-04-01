public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.add();
        arithmetic.sub();
        arithmetic.mul();
        arithmetic.div();
        arithmetic.mod();

        InDe inDe = new InDe();
        inDe.Increment();
        inDe.Decrement();

        Asignment asignment = new Asignment();
        asignment.Assign();

        Relational relational = new Relational();
        relational.whoIsBigger();

        Ternaory ternaory = new Ternaory();
        ternaory.findMax();

        Logical logical = new Logical();
        logical.bothAreEvenOrNot();

        Bitwise bitwise = new Bitwise();
        bitwise.bitWiseAnd();
        bitwise.bitWiseOr();
    }
}