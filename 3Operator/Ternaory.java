public class Ternaory {
    int n1 = 5, n2 = 10, max;

    public void findMax() {
        max = (n1 > n2) ? n1 : n2;
        System.out.println("Max is "+max);
    }
}
