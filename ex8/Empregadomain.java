package ex8;

import java.util.Scanner;

/**
 * Empregadomain
 */
public class Empregadomain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Funcionario f = new Funcionario("João Silva", 6000, 1000);

        double salarioliquido = (f.salarioBruto - f.imposto);

        System.out.println("Nome: " + f.nome + "\nSalário bruto: " + f.salarioBruto + "\nImposto: " + f.imposto + "\nFuncionário:" + f.nome + ", salario liquido: " + (salarioliquido) + "\n Qual a porcentagem para aumentar o salario? ");

        float porcentagemescolhida = entrada.nextFloat();
        f.aumentarSalario(porcentagemescolhida);

        double salariofinal = salarioliquido + salarioliquido * porcentagemescolhida/100;

        System.out.println("Dados atualizados: " + f.nome + ", R$ " + salariofinal);

        entrada.close();
    }
}