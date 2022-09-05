package ex10;

import java.util.Scanner;

public class hotelPet {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);   
        Animal  lista[];

        System.out.println("1 - CHECK-IN \n2 - CHECK-OUT \n3 - SAIR");
        int opcao = entrada.nextInt();

        switch (opcao){
            case 1:
            
            System.out.println("Nome: ");
                String nome = entrada.nextLine();
                System.out.println("Raça: ");
                String raca = entrada.nextLine();
                System.out.println("1 - Cachorro \n 2 - Gato");
            int opcaoespecie = entrada.nextInt();
            if (opcaoespecie == 1){
                
                Cachorro c  = new Cachorro(nome, raca);
                c.late();          
            }
            if (opcaoespecie == 2){
                Gato g = new Gato(nome, raca);
                g.mia();
            }
            break;

            case 2:
                System.out.println("Qual animal deseja buscar? ");
            break;

        }
    }
    
}
