import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String a = sc.next();
            String[] arr = a.split(":");
            int[] tempo = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                tempo[i] = Integer.parseInt(arr[i]);
            }

            LocalTime h1 = LocalTime.of(tempo[0], tempo[1]);
            LocalTime h2 = LocalTime.of(7, 0);

            long diferenca = ChronoUnit.MINUTES.between(h2, h1);

            if (diferenca > 0) {
                System.out.println("Atraso maximo: " + diferenca);
            } else {
                System.out.println("Atraso maximo: 0");
            }

        }

        sc.close();
    }
}