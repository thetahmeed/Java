public class Results extends Test implements Sports{

    float total;

    public void getWt() {
        System.out.println("Sports Wt: "+sportWt);
    }

    void display() {
        total = part1 + part2 +sportWt;

        getRoll();
        getMarks();
        getWt();

        System.out.println("Total score: "+total);
    }
    
}
