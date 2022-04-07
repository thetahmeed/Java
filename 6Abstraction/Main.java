public class Main {
    public static void main(String[] args) {
        AbsClass absClass1;
        absClass1 = new ClassA();
        absClass1.absMethod();

        AbsClass absClass2;
        absClass2 = new ClassB();
        absClass2.absMethod();
    }
}