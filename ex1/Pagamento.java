/* Problema “pagamento”
Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário
com uma mensagem explicativa, conforme exemplo. */


public class Pagamento {

    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("Joao Silva", 50, 60);

        float pagamento = f.getValorPorHora() * f.getHorasTrabalhadas();

        System.out.println("Nome: " + f.getNome() + "\n Valor por Hora: " + f.getValorPorHora() + "\nHoras trabalhadas: " + f.getHorasTrabalhadas() + "\nO pagamento para " + f.getNome() + " deve ser " + pagamento + ".");

    }
    
}
