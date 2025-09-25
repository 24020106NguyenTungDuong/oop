
import java.lang.Math;

public class ThreeSort {
    public static void main(String[] args) {
        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);
        int C = Integer.parseInt(args[2]);
        int Maximum = Math.max(A, Math.max(B, C));
        int Minimum = Math.min(A, Math.min(B, C));
        int Mid = A + B + C - Maximum - Minimum;
        System.out.println(Minimum + " " + Mid + " " + Maximum);

    }
}
