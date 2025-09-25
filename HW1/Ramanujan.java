
public class Ramanujan {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int a = 1; a * a * a < n; a++) {
            for (int b = a + 1; a * a * a + b * b * b <= n; b++) {
                for (int c = a + 1; c * c * c < n; c++) {
                    for (int d = c + 1; c * c * c + d * d * d <= n; d++) {
                        if (a * a * a + b * b * b == c * c * c + d * d * d) {
                            System.out.println(a * a * a + b * b * b + "=" + a + "^3+" + b + "^3=" + c + "^3+" + d + "^3");
                        }
                    }
                }
            }

        }
    }
}
