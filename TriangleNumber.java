import java.util.Scanner;

/**
 * TriangleNumber
 */
public class TriangleNumber {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = iScanner.nextInt();

        int t = getTriangle(n);
        System.out.printf("Треугольное число Tn = %d\n\n", t);
        System.out.printf("Доказательство: (8x + 1)\u00bd есть полный квадрат\nИстинность выражения при x = %d: %b\n", t,
                isTriangle(t));
        drawTriangle(t);

        iScanner.close();
    }

    public static boolean isTriangle(int x) {
        return Math.sqrt(8 * x + 1) % 2 == 1;
    }

    public static int getTriangle(int n) {
        return n * (n + 1) / 2;
    }

    public static void drawTriangle(int t) {
        int i = 0;

        System.out.println("\nГрафическое представление треугольного числа Tn:");

        while (t > 0) {
            i++;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            t -= i;
            System.out.println();
        }
    }

}