import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int senha = 2002;
        System.out.print("Digite a senha: ");
        int senhadigitada = entrada.nextInt();

        do {

            if(senha != senhadigitada){
                System.out.print("Senha inválida! Tente novamente: ");
                senhadigitada = entrada.nextInt();
            } 
            
        } while (senhadigitada != senha);

        if (senhadigitada == senha) {
            System.out.print("Acesso permitido!");
        }

        entrada.close();
    }
}
