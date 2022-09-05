import java.util.Scanner;

public class Diabetes {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a medida da glicose: ");

        float glicose = entrada.nextFloat();

        if (glicose < 100){
            System.out.println("Classificação: normal");
        } if (glicose > 100 && glicose < 140){
            System.out.println("Classificação: elevado");
        } if (glicose > 140) {
            System.out.println("Classificação: diabetes ");
        }

    }
    
}