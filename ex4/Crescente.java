import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        

        float num1;
        float num2;

        do {
            System.out.println("Digite dois números: ");
            num1 = entrada.nextFloat();
            num2 = entrada.nextFloat();

            if (num1 > num2){
                System.out.println("DECRESCENTE!");
            } if (num2 > num1){
                System.out.println("CRESCENTE!");  
            } 
            
        } while (num1 != num2);
            

        entrada.close();
    }
}
