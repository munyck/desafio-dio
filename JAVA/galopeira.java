import java.io.IOException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double T;
        String C;
        int num = leitor.nextInt();
        for (int i = 0; i < num; i++) {
            C = leitor.next();
            T = C.length();
            System.out.printf("%.2f\n", (T / 100));
        }
	}
}
