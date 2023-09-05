package Part1;
public class Task5 {
    public static void main(String[] args) {

        // Project 4. Part 1. Task 5.

        int x = 1;

        while (x < 5) {
            System.out.println("X=" + x);

            for (int y = 5; y > 0; y--) {
                System.out.println("X*Y=" + x*y);
            }
            x = x + 1;

        }
    }
}