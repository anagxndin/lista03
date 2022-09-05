import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Deseja a tabauada para qual valor? ");
        int n = entrada.nextInt();

        for (int i = 0; i <= 10; i++){
            int resultado = i * n;
            System.out.println(n + " x " + i + " = " + resultado);
       
        }

        entrada.close();
    }
}
