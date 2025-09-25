import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


public class Dragon {
    public static void main(String[] args) {

        int N = 5;
        String DragonFractal = "F";
        String DragonTail = "F";
        while (N >= 0) {
            StdOut.println(DragonFractal + " ");
            String temp = DragonFractal;
            DragonFractal = DragonFractal + "L" + DragonTail;
            DragonTail = temp + "R" + DragonTail;
            N--;
        }


    }
}
