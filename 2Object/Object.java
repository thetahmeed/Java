public class Object{
    public static void main(String[] args){
        
        // Creating an object of AnotherClass
        AnotherClass obj = new AnotherClass();

        // Calling another class elements by class reffrence
        System.out.println("i = "+obj.i);
        System.out.println("s = "+obj.s);

        obj.printSomething();
    }
}