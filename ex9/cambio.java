package ex9;

import java.util.Scanner;

public class cambio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Qual o valor do dólar? ");
        double valordolar = entrada.nextFloat();
        System.out.print("Quantos dólares serão comprados? ");
        float quantidadedolar = entrada.nextFloat();
        double valordolartotal = valordolar * quantidadedolar; 
        System.out.println(valordolartotal);
        double valortotal = (6/100) * valordolartotal + valordolartotal;
        System.out.println("Valor a ser pago em reais = " + valortotal);


    }
    
}
