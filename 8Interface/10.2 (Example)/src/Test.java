public class Test extends Student {
    float part1, part2;

    void setMarks(float f1, float f2) {
        part1 = f1;
        part2 = f2;
    }

    void getMarks(){
        System.out.println("Part 1: "+part1);
        System.out.println("Part 2: "+part2);
    }
}
